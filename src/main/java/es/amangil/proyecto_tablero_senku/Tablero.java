package es.amangil.proyecto_tablero_senku;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tablero extends GridPane{
    Senku senku;
    static final double TAM_FICHA = 50;

    
    public Tablero(Senku senku) {
        this.senku = senku;
        this.setBackground(new Background(
            new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth(TAM_FICHA * senku.tamXTablero);
        this.setMinHeight(TAM_FICHA * (senku.tamYTablero + 1)); 
        this.setMaxWidth(TAM_FICHA * senku.tamXTablero);
        this.setMaxHeight(TAM_FICHA * (senku.tamYTablero + 1));
        
        this.setOnMouseClicked((event) -> {
                int filaX = (int)(event.getX() / 40);
                int columnaY = (int)(event.getY() / 40);
                System.out.println("X " + filaX);
                System.out.println("Y " + columnaY);
        });
        
        for(int x=0; x<senku.tamXTablero; x++) {
            for(int y=0; y<senku.tamYTablero; y++) {
                senku.tablero[x][y] = ficha();
            }
        }
        for(int x=5; x<7; x++){
            for(int y=0; y<2; y++) {
                senku.tablero[x][y] = ficha();
            }
        }
        for(int x=3; x<4; x++){
            for(int y=3; y<4; y++) {
                senku.tablero[x][y] = fichaHueco();
            }
        }
    }
        
    public void fichaHueco (){
        Circle circleExterior = new Circle();
        circleExterior.setRadius(TAM_FICHA / 2);
        circleExterior.setFill(Color.BLACK);
    }
    
    public void ficha (){
        Circle circleExterior = new Circle();
        circleExterior.setRadius(TAM_FICHA / 2);
        circleExterior.setFill(Color.ORANGE);
    }
}
