/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.amangil.proyecto_tablero_senku;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FichaHueco { 
    
    static final double TAM_FICHA = 50;
    
    public void fichaHueco (){
        Circle circleExterior = new Circle();
        circleExterior.setRadius(TAM_FICHA / 2);
        circleExterior.setFill(Color.BLACK);
    }
}
