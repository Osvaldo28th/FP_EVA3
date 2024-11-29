/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tik_tak_toe;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class TIK_TAK_TOE {
       static char [][] tab = new char [3][3]; 
       static final char cru = 'X';
       static final char cir = 'O';       
       static final char nada = ' ';

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
      inicializarTablero();
        Scanner cap = new Scanner(System.in);
        char turnoActual = cru;

        while (true) {
            imprimirTablero();
            if (turnoActual == cru) {
                movimientoJug(turnoActual);
            } else {
                movimientoComp();
            }

            if (evaluarPartida(turnoActual)) {
                imprimirTablero();
                System.out.println("El jugador X ha ganado");
                break;
            }

            if (tableroLlenado()) {
                imprimirTablero();
                System.out.println("Es un empate");
                break;
            }

            // Cambiar turno
            turnoActual = cambiarTurno(turnoActual);
        }
    }
    public static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = nada;
            }
        }
    }
    public static void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + tab[i][j]);
            }
            System.out.println("|");
        }
    }
    public static void movimientoJug(char turno) {
        Scanner cap = new Scanner(System.in);
        int fil, col;
        while (true) {
            System.out.println("Jugador " + turno + ", introduce fila (0-2): ");
            fil = cap.nextInt();
            System.out.println("Introduce columna (0-2): ");
            col = cap.nextInt();

            if (fil >= 0 && fil < 3 && col >= 0 && col < 3 && tab[fil][col] == nada) {
                tab[fil][col] = turno;
                break;
            } else {
                System.out.println("Movimiento inválido, inténtalo de nuevo.");
            }
        }
    }
    public static void movimientoComp() {
        int fila, colu;
        while (true) {
            fila = (int) (Math.random() * 3);
            colu = (int) (Math.random() * 3);
            if (tab[fila][colu] == nada) {
                tab[fila][colu] = cir;
                break;
            }
        }
    }
    public static boolean evaluarPartida(char turno) {
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == turno && tab[i][1] == turno && tab[i][2] == turno) {
                return true; // Fila
            }
            if (tab[0][i] == turno && tab[1][i] == turno && tab[2][i] == turno) {
                return true; // Columna
            }
        }
        if (tab[0][0] == turno && tab[1][1] == turno && tab[2][2] == turno) {
            return true; // Diagonal principal
        }
        if (tab[0][2] == turno && tab[1][1] == turno && tab[2][0] == turno) {
            return true; // Diagonal secundaria
        }
        return false;
    }
    public static char cambiarTurno(char turnoActual) {
        if (turnoActual == cru) {
            return cir;
        } else {
            return cru;
        }
    }
    public static boolean tableroLlenado() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j] == nada) {
                    return false;
                }
            }
        }
        return true; // Tablero lleno
    }
}
    

    
        
        
    
    


