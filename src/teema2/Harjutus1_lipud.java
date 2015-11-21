package teema2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{
    Stage lava;
    VBox Lipud;
    VBox eestiLipp;


    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        Lipud = new VBox();

        LooEestiLipp();
        LooJaapaniLipp();


        Scene scene = new Scene(Lipud,600,400);
        lava.setScene(scene);
        lava.show();
    }

    private void LooJaapaniLipp() {
        StackPane JaapaniLipp = new StackPane();

        Rectangle Liputaust = new Rectangle(200,120);
        Liputaust.setStroke(Color.BLACK);
        Liputaust.setFill(Color.WHITE);
        Circle ring = new Circle(30,Color.RED);
        JaapaniLipp.getChildren().add(Liputaust);
        JaapaniLipp.getChildren().add(ring);
        Lipud.getChildren().add(JaapaniLipp);

    }

    private void LooEestiLipp() {
        eestiLipp = new VBox();
        Rectangle sinine = new Rectangle(100,20);
        sinine.setFill(Color.BLUE);
        sinine.setStroke(Color.BLACK);
        Rectangle must = new Rectangle(100,20);
        must.setFill(Color.BLACK);
        must.setStroke(Color.BLACK);
        Rectangle valge = new Rectangle(100,20);
        valge.setFill(Color.WHITE);
        valge.setStroke(Color.BLACK);
        eestiLipp.getChildren().addAll(sinine,must,valge);
        Lipud.getChildren().add(eestiLipp);
    }

    private void setupStage() {

    }
}
