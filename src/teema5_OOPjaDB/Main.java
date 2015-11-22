package teema5_OOPjaDB;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by peep on 22.11.15.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Andmebaas baas = new Andmebaas();
        //baas.seadistaTabel();
        new LoginScreen();
    }
}
