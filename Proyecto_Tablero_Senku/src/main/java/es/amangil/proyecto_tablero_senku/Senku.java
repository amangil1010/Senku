package es.amangil.proyecto_tablero_senku;


public class Senku {

    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    static final char FICHAS = '2';
    final char VACIO = '1';
    final char TABLERO = '0';
    
    // Método constructor
    public Senku() {  
        tamXTablero = 7;
        tamYTablero = 7;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = FICHAS;
            }
        }
        for(int x=0; x<2; x++){
            for(int y=0; y<2; y++) {
                tablero[x][y] = TABLERO;
            }
        }
        for(int x=5; x<7; x++){
            for(int y=0; y<2; y++) {
                tablero[x][y] = TABLERO;
            }
        }
        for(int x=0; x<2; x++){
            for(int y=5; y<7; y++) {
                tablero[x][y] = TABLERO;
            }
        }
        for(int x=5; x<7; x++){
            for(int y=5; y<7; y++) {
                tablero[x][y] = TABLERO;
            }
        }
        for(int x=3; x<4; x++){
            for(int y=3; y<4; y++) {
                tablero[x][y] = VACIO;
            }
        }
    }
    
    
    public void movimientoFicha(short movOrigenX, short movOrigenY, short movDestinoX, short movDestinoY) {
        int saltosX = movDestinoX - movOrigenX;
        int saltosY = movDestinoY - movOrigenY;
        boolean saltoDe2X = false;
        boolean saltoDe2Y = false;
        
        System.out.println("saltosX " + saltosX);
        System.out.println("saltosY " + saltosY);
        
        if (saltosX==2 || saltosX==-2) {
            saltoDe2X = true;
        } else {
            saltoDe2X = false;
          }
        
        if (saltoDe2X==false){
            if (saltosY==2 || saltosY==-2) {
                saltoDe2Y = true;
            } else {
                saltoDe2Y = false;
              }
        }
        
        if (saltoDe2X==true || saltoDe2Y==true) {
            tablero[movDestinoX][movDestinoY] = FICHAS;
            tablero[movOrigenX][movOrigenY] = VACIO;
//            tablero[movDestinoX][movDestinoY] = FICHAS;
            if (movOrigenX < movDestinoX){
                tablero[movOrigenX + 1][movOrigenY] = VACIO;
            } else if (movOrigenY < movDestinoY) {
                tablero[movOrigenX][movOrigenY + 1] = VACIO;
            } else if (movOrigenX > movDestinoX) {
                tablero[movOrigenX - 1][movOrigenY] = VACIO;
            } else if (movOrigenY > movDestinoY) {
                tablero[movOrigenX][movOrigenY - 1] = VACIO;
            }
        }
        
    }

    
    
    

    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }


    
    
    
    
    
    
    
    
    
    
    
    
}