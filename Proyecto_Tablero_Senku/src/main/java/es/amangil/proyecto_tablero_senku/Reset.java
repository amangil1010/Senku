package es.amangil.proyecto_tablero_senku;

import static es.amangil.proyecto_tablero_senku.Senku.FICHAS;
import javafx.scene.control.Button;


public class Reset {
    Tablero tablero2;
    Button boton = new Button("Reset");
    static final char FICHAS = '2';
    final char VACIO = '1';
    final char TABLERO = '0';
    char[][] tablero;
    
    public void crearBoton(){
        boton.setMinWidth(100);
        boton.setMaxWidth(100);
        boton.setMinHeight(50);
        boton.setMaxHeight(50);
        boton.setTranslateY(10);
        boton.setTranslateX(270);
        tablero = new char[7][7];    
    }
        public void codigoBoton(){
//          button.setOnAction(nuevo EventHandler() {
//              @Anular
//              manejador de vacío público (ActionEvent actionEvent) {
//                  //... haz algo aquí.
//          }
//          });

//            tablero2.limpiarTablero();
//            tablero2.pintarTablero();
//            if (boton){
//                for(int x=0; x<7; x++) {
//                    for(int y=0; y<7; y++) {
//                        tablero[x][y] = FICHAS;
//                    }
//                }
//                for(int x=0; x<2; x++){
//                    for(int y=0; y<2; y++) {
//                        tablero[x][y] = TABLERO;
//                    }
//                }
//                for(int x=5; x<7; x++){
//                    for(int y=0; y<2; y++) {
//                        tablero[x][y] = TABLERO;
//                    }
//                }
//                for(int x=0; x<2; x++){
//                    for(int y=5; y<7; y++) {
//                        tablero[x][y] = TABLERO;
//                    }
//                }
//                for(int x=5; x<7; x++){
//                    for(int y=5; y<7; y++) {
//                        tablero[x][y] = TABLERO;
//                    }
//                }
//                for(int x=3; x<4; x++){
//                    for(int y=3; y<4; y++) {
//                        tablero[x][y] = VACIO;
//                    }
//                }
//            }
        }

            
}
