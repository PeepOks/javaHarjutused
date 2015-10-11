package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        vertikaalne(foor1);
        vertikaalne(foor2);
    }

    public void vertikaalne (Foor foor){

        foor.syytaRoheline();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.syytaKollane();
        foor.paus(0.5);
        for (int i=0;i<5;i++){
            foor.vahetaKollast();
            foor.paus(0.5);
        }
        foor.kustutaKollane();
        foor.syytaPunane();
        foor.paus(0.5);
    }
    public void horisontaalne (Foor foor){
        foor.vahetaPunast();
        foor.paus(0.5);
    }

}
