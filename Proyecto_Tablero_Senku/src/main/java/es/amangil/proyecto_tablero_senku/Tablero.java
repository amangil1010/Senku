package es.amangil.proyecto_tablero_senku;

import static es.amangil.proyecto_tablero_senku.Senku.FICHAS;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tablero extends GridPane{
    Senku senku;
    
    public Tablero(Senku senku) {
        this.senku = senku;
        this.setBackground(new Background(
            new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth((Ficha.TAM_FICHA + 1) * senku.tamXTablero);
        this.setMinHeight((Ficha.TAM_FICHA + 1) * senku.tamYTablero); 
        this.setMaxWidth((Ficha.TAM_FICHA + 1) * senku.tamXTablero);
        this.setMaxHeight((Ficha.TAM_FICHA + 1) * senku.tamYTablero);
        
        this.setOnMouseClicked((event) -> {
            int filaX = (int)(event.getX() / Ficha.TAM_FICHA);
            int columnaY = (int)(event.getY() / Ficha.TAM_FICHA);
            System.out.println("X " + filaX);
            System.out.println("Y " + columnaY);
        });
        
        senku.mostrarTableroConsola();
        
        for(int x=0; x<7; x++) {
            for(int y=0; y<7; y++) {
                System.out.println("hola");
                senku.mostrarTableroConsola();
                if (senku.tablero[x][y] == (char) 2 ){
                System.out.println("HOLA");
                senku.mostrarTableroConsola();
                Ficha ficha = new Ficha();
                this.add(ficha, x, y);
                }
//                if (senku.tablero[x][y] == 1 ){
//                fichaHueco fichaHueco = new fichaHueco();
//                this.add(fichaHueco, x, y);
//                }
            }
        }
          
        
    }
    


//    ficha.setLayoutX(0);
//    ficha.setLayoutY();
}

