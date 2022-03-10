package es.amangil.proyecto_tablero_senku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    BorderPane paneRoot;

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
        
        //
        Senku senku = new Senku();
        senku.mostrarTableroConsola();
        senku.mostrarTableroConsola();
        Tablero tablero = new Tablero(senku);
        
        paneRoot.setCenter(tablero);            
        
    }

    public static void main(String[] args) {
        launch();
    }

}