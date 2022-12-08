
package com.mycompany.batallanaval;
import java.util.Scanner;


public class BatallaNaval {
    
    static int fil, col, disparoX,disparoY,disparoX2,disparoY2;
    static String p2, p1;
    static int array[][];
    static Scanner leer = new Scanner(System.in);
    static int tirosJugador1 = 4;
    static int tirosJugador2 = 4;
    static int campo[][];
    
    public static void main(String[] args) {
      
       
       
       System.out.println("Ingresa el numero de fila del tablero");
       fil =  leer.nextInt();
       
       System.out.println("Ingresa el numero de columnas del tablero");
       col = leer.nextInt();
       
       array = new int [fil][col];
       campo = new int [fil][col];
       
       
       for( int i = 0; i < fil; i++){
           for(int j = 0; j < col; j++){
               array[i][j] = 0;
           }
       }
       
       for( int i = 0; i < fil; i++){
           for(int j = 0; j < col; j++){
               campo[i][j] = 0;
           }
       }
       
      
       
       
        System.out.println("Ingresa tu nickname player 1");
        p1 = leer.next();
        System.out.println("Ingresa tu nickname player 2");
        p2 = leer.next();
        System.out.println("Quieres empezar la partida");
        String inicio = leer.next();
        
        if(inicio.equalsIgnoreCase("s")){
            System.out.println("-------------Bienvenido " + p1 + "-------------");
            System.out.println("Quieres ingresar tus barcos S/N");
            String opcion = leer.next();
            if(opcion.equalsIgnoreCase("s")){
                barcosJug1();
            }
            System.out.println("-------------Bienvenido " + p2 + "-------------");
            System.out.println("Quieres ingresar tus barcos S/N");
            String opc = leer.next();
            if(opc.equalsIgnoreCase("s")){
                barcosJug2();
            }
            juego();
        }
        
        
        
       
    }
     
    
    
    
    
    public static void juego(){
        System.out.println("-------------Turno de " + p1 + "-------------");
        while(tirosJugador1 > 0){
            System.out.println("-------------Te quedan " + tirosJugador1 + " intentosv-------------" );
            System.out.println("Ingresa tu disparo en la posicion horizontal");
            disparoX = leer.nextInt();
            
            System.out.println("Ingresa tu disparo en la posicion vertical");
            disparoY =leer.nextInt();
            
            if(disparoX >= 1 && disparoX <= fil && disparoY >= 1 && disparoY <= col){
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                      
                    }
                }
                
                 if(campo[disparoX][disparoY] == 1){
                    System.out.println("-------------Tiro Acertado le has dado a un barco-------------");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            campo[disparoX][disparoY] = 2;
                        }
                    }
                 }else if(campo[disparoX][disparoY] == 0){
                     System.out.println("-------------No has acertado a un barco-------------");
                     for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            campo[disparoX][disparoY] = 2;
                        }
                    }
                 }
                 
            }
            
            
         tirosJugador1--;
       

            
          
        }
         
        System.out.println("-------------Turno de " + p2 + "-------------");
        do{
            System.out.println("Ingresa tu disparo en la posicion horizontal");
            disparoX2 = leer.nextInt();
            
            System.out.println("Ingresa tu disparo en la posicion vertical");
            disparoY2 =leer.nextInt();
            
            if(disparoX2 >= 1 && disparoX2 <= fil && disparoY2 >= 1 && disparoY2 <= col){
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                      
                    }
                }
                
                 if(array[disparoX2][disparoY2] == 1){
                    System.out.println("-------------Tiro Acertado le has dado a un barco-------------");
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            array[disparoX2][disparoY2] = 2;
                        }
                    }
                 }else if(array[disparoX2][disparoY2] == 0){
                     System.out.println("-------------No has acertado a un barco-------------");
                     for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            array[disparoX2][disparoY2] = 2;
                        }
                    }
                 }
                tirosJugador2--;
            }
            
            
         
        }while(tirosJugador2 > 0);
        
        
        for(int i =0; i < campo.length; i++){
            for(int j = 0; j < campo.length - 1; j++){
                switch (campo[i][j]) {
                    case 1:
                        System.out.println("-------------Perdiste" + p1 + "-------------");
                        for(int x = 0; x < fil; x++){
                            for(int y = 0; y < col; y++){
                                System.out.print(campo[x][y] + " ");
                            }
                            System.out.println("");
                        }   break;
                    case 0:
                        System.out.println("-------------Ganaste" + p1 + "-------------");
                        for(int x = 0; x < fil; x++){
                            for(int y = 0; y < col; y++){
                                System.out.print(campo[x][y] + " ");
                            }
                            System.out.println("");
                        }   break;
                    default:
                        System.out.println("-------------Perdiste" + p1 + "-------------");
                        break;
                }
                return;
                
            }
        }   
        
        for(int i =0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                switch (array[i][j]) {
                    case 1:
                        System.out.println("Perdiste" + p2);
                        for(int x = 0; x < fil; x++){
                            for(int y = 0; y < col; y++){
                                System.out.print(array[x][y] + " ");
                            }
                            System.out.println("");
                        }   break;
                    case 0:
                        System.out.println("-------------Ganaste" + p2 + "-------------");
                        break;
                    default:
                        System.out.println("Perdiste");
                        break;
                }
                return;
                
            }
        } 
    }
    
    public static void barcosJug1(){
        String posicion;
        
        System.out.println("Ingresa la posicion de tu barco 1  ---Horizontal / Vertical----");
        posicion = leer.next();
        
        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 1");
            int horizontal = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 1");
            int columna =leer.nextInt();
            
            if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col - 4){
                for(int i = 0; i < 4; i++){
                    array[horizontal - 1][columna + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(posicion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 1 ");
                 int horizontal = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 1");
                int columna =leer.nextInt();
            
                if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col - 4 ){
                    for(int i = 0; i < 4; i++){
                     array[horizontal + i][columna - 1] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }else{
            System.out.println("Ingresa una cordenada valida");
        }    
        /*
        System.out.println("Ingresa la posicion de tu barco 2 ---Horizontal / Vertical----");
        posicion = leer.next();
        
        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 2");
            int horizontal = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 2");
            int columna =leer.nextInt();
            
            if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= 7 ){
                for(int i = 0; i < 3; i++){
                    array[horizontal][columna + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(posicion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 2");
                 int horizontal = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 2");
                int columna =leer.nextInt();
            
                if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col ){
                    for(int i = 0; i < 3; i++){
                     array[horizontal + i][columna] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        } 
        
        
        System.out.println("Ingresa la posicion de tu barco 3 ---Horizontal / Vertical----");
        posicion = leer.next();
        
        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 3 ");
            int horizontal = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 3 ");
            int columna =leer.nextInt();
            
            if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col ){
                for(int i = 0; i < 2; i++){
                    array[horizontal][columna + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(posicion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 3");
                 int horizontal = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 3");
                int columna =leer.nextInt();
            
                if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col ){
                    for(int i = 0; i < 2; i++){
                     array[horizontal + i][columna] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }
        
        System.out.println("Ingresa la posicion de tu barco 4 ---Horizontal / Vertical----");
        posicion = leer.next();
        
        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 4");
            int horizontal = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 4");
            int columna =leer.nextInt();
            
            if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col ){
                for(int i = 0; i < 1; i++){
                    array[horizontal][columna + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(posicion.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 4");
                 int horizontal = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 4");
                int columna =leer.nextInt();
            
                if(horizontal >= 1 && horizontal <= fil && columna >= 1 && columna <= col ){
                    for(int i = 0; i < 1; i++){
                     array[horizontal + i][columna] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }
*/

    }
    
     public static void barcosJug2(){
        String psc;
        
        System.out.println("Ingresa la posicion de tu barco 1  ---Horizontal / Vertical----");
        psc = leer.next();
        
        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 1");
            int hrz = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 1");
            int ver =leer.nextInt();
            
            if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= 7 ){
                for(int i = 0; i < 4; i++){
                    campo[hrz][ver + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(psc.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 1 ");
                 int hrz = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 1");
                int ver =leer.nextInt();
            
                if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                    for(int i = 0; i < 4; i++){
                     campo[hrz + i][ver] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(campo[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }else{
            System.out.println("Ingresa una cordenada valida");
        }    
        
        System.out.println("Ingresa la posicion de tu barco 2 ---Horizontal / Vertical----");
        psc = leer.next();
        
        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 2");
            int hrz = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 2");
            int ver =leer.nextInt();
            
            if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= 7 ){
                for(int i = 0; i < 3; i++){
                    campo[hrz][ver + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(psc.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 2");
                 int hrz = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 2");
                int ver =leer.nextInt();
            
                if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                    for(int i = 0; i < 3; i++){
                     campo[hrz + i][ver] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(campo[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        } 
        
        
        System.out.println("Ingresa la posicion de tu barco 3 ---Horizontal / Vertical----");
        psc = leer.next();
        
        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 3 ");
            int hrz = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 3 ");
            int ver =leer.nextInt();
            
            if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                for(int i = 0; i < 2; i++){
                    campo[hrz][ver + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(psc.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 3");
                 int hrz = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 3");
                int ver =leer.nextInt();
            
                if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                    for(int i = 0; i < 2; i++){
                     campo[hrz + i][ver] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(campo[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }
        
        System.out.println("Ingresa la posicion de tu barco 4 ---Horizontal / Vertical----");
        psc = leer.next();
        
        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco 4");
            int hrz = leer.nextInt();
            
            System.out.println("Ingresa la posicion vertical de tu barco 4");
            int ver =leer.nextInt();
            
            if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                for(int i = 0; i < 1; i++){
                    campo[hrz][ver + i] = 1;
                }
                
                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                }
                System.out.println("");
                    }
                
            }
        }else if(psc.equalsIgnoreCase("v")){
                 System.out.println("Ingresa la posicion horizontal de tu barco 4");
                 int hrz = leer.nextInt();
            
                System.out.println("Ingresa la posicion vertical de tu barco 4");
                int ver =leer.nextInt();
            
                if(hrz >= 1 && hrz <= fil && ver >= 1 && ver <= col ){
                    for(int i = 0; i < 1; i++){
                     campo[hrz + i][ver] = 1;
                    }
                
                    for( int i = 0; i < fil; i++){
                        for(int j = 0; j < col; j++){
                            System.out.print(campo[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
        }

    }
}    