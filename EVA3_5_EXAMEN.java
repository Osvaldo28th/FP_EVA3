/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_examen;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA3_5_EXAMEN {
    public static final  int PIEDRA = 1;
    public static final int PAPEL = 2; //CONSTANTES (VARIABLE CON UN SOLO VALOR)
    public static final int TIJERA = 3;
    
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int res, jug, resjug;
       do{
        res = pedirJugada("Introduce tu jugada: 1: piedra, 2: papel, 3: tijera, 4: salir");
        jug = generarJugadaPc();
           System.out.println(jug);
        resjug = evaluarPartida(res, jug);
           System.out.println(resjug);
        
       } while (res != 4);
       
       
        
       
    }
    
    //Pedir datos al usuario
    public static int pedirJugada(String mensaje){
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = cap.nextInt();
        return seleccion;
    }
    
    //GENERAR LA JUGADA DE LA CPC
    
    public static int generarJugadaPc(){
    int jug;
    //COMO GENERAMOS LA JUGADA
    double val = Math.random();
    if (val >= 0 && val < .3)
        jug = PIEDRA; //piedra
    else if (val >= .3 && val < .6)
    jug = PAPEL;//papel
    else 
    jug = TIJERA; // tijera
        
    
    
    return jug;
    }
    
        //EVALUAR LA JUGADA
    public static int evaluarPartida(int jugadaus,int jugadapc){
    int resu; // 0 empate, 1 gana, 2 pierde
        if ((jugadaus == PIEDRA) && (jugadapc == PIEDRA))
            resu = EMPATE;
    else if ((jugadaus == PIEDRA) && (jugadapc == PAPEL))
        resu = PIERDE;
    else if ((jugadaus == PIEDRA) && (jugadapc == TIJERA))
        resu = GANA;
    else if ((jugadaus == PAPEL) && (jugadapc == PIEDRA))
        resu = GANA;
    else if ((jugadaus == PAPEL) && (jugadapc == PAPEL))
        resu = EMPATE;
    else if ((jugadaus ==PAPEL) && (jugadapc == TIJERA))
        resu = PIERDE;
    else if ((jugadaus == TIJERA) && (jugadapc == PIEDRA))
        resu = PIERDE;
    else if ((jugadaus == TIJERA) && (jugadapc == PAPEL))
        resu = GANA;
    else 
        resu = EMPATE;
        return resu;
    }
    
}
