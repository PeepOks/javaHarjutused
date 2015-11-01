package teema2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application{
    Stage lava;
    GridPane laud;
    StackPane maailm;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);
    int LaevaServaPikkus = 50;
    int lauaPikkus = 4;
    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        setupStage();
        generateGrid();
        reageeriKlikile();
        otsilaevu();
        //gameOver();
    }



    private boolean otsilaevu() {

        for (Node ruut : laud.getChildren()){
            if (ruut.getId().equals("Laev")){
                return true;
            }
        }
        return false;
    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle)event.getTarget();
            String ruuduID = ruut.getId();
            if (ruuduID.equals("Laev")){
                ruut.setFill(Color.RED);
                ruut.setFill(laevaMuster);
                ruut.setId("Põhjas");
            } else if (ruuduID.equals("meri")){
                ruut.setFill(Color.DARKBLUE);
            } else if(ruuduID.equals("Põhjas")){
                System.out.println("Lasid juba põhja");
            }
            if (!otsilaevu()){
                gameOver();
            }
        });
    }

    private void generateGrid() {
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus; j++) {
                Rectangle ruut = new Rectangle(LaevaServaPikkus,LaevaServaPikkus);
                int random = (int)(Math.random()*2);
                if (random==1){
                    ruut.setId("meri");
                } else {
                    ruut.setId("Laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add(ruut,i,j);
            }
        }


    }
    private void gameOver() {
        System.out.println("Game Over");
        Label tekst = new Label("Võitsid");
        maailm.getChildren().addAll(tekst);
    }
    private void setupStage() {
        maailm = new StackPane();
        laud = new GridPane();
        maailm.getChildren().add(laud);
        Scene scene = new Scene(maailm, 400,400);
        lava.setTitle("Laevad");
        lava.setScene(scene);
        lava.show();
        lava.setOnCloseRequest(event -> {System.exit(0);}); //akna sulgedes läheb programm kinni
    }
}
