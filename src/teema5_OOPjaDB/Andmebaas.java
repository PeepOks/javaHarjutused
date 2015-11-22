package teema5_OOPjaDB;


import javafx.scene.control.Label;

import java.sql.*;

/**
 * Created by peep on 22.11.15.
 */
public class Andmebaas {
    Connection conn;
    public Andmebaas() {

        seadistaAndmebaas();

    }

    public void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/teema5_OOPjaDB/login.db");
            System.out.println("Andmebaas käivitus");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void sulgeAndmebaas(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seadistaTabel() {
        try {
            Statement sqlkask = conn.createStatement();

            String sqllause = "CREATE TABLE USER (" +
                    "ID INT AUTO_INCREMENT," +
                    "USERNAME TEXT," +
                    "PASSWORD TEXT," +
                    "FULLNAME TEXT," +
                    "NUMBER INT)";
            sqlkask.executeUpdate(sqllause);
            sqlkask.close();
            System.out.println("Tabel on loodud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void reegisteeriKasutaja(String kasutajaNimi, String parool) {

        try {
            Statement sqlkask = conn.createStatement();
            String sqllause = "INSERT INTO USER (USERNAME, PASSWORD) VALUES('" + kasutajaNimi + "','" + parool + "')";
            sqlkask.executeUpdate(sqllause);
            sqlkask.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void kuvaRead(String kasutajaNimi) {
        try {
            Statement sqlkask = conn.createStatement();
            String sqllause = "SELECT * FROM USER WHERE USERNAME = '" + kasutajaNimi + "' ";
            ResultSet results = sqlkask.executeQuery(sqllause);
            System.out.println(results.getString("PASSWORD"));
            sqlkask.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
