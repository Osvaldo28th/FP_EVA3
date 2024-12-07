/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550306_eva3_exam;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class Main {
    public static Scanner cap = new Scanner(System.in);
    public static int cal[];
    public static int sumcal, prom, alum, mayoroigual, may, men;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuantos estudiantes son:");
        alum = cap.nextInt();
        cap.nextLine();
        cal = new int[alum];

        
        for (int i = 0; i < cal.length; i++) {
            System.out.println("Calificacion estudiante #" + (i + 1));
            cal[i] = cap.nextInt();
            cap.nextLine(); 
        }        
        
        prom = calcularPromedio();
        System.out.println("El promedio es:" + prom);
        
        int mayomen = contarCalificacionesMayores();
        System.out.println("Calificaciones mayores o iguales al promedio: " + mayomen);
        
        int mayo = obtenerCalificacionMasAlta();
        System.out.println("La calificacion mas alta es: " + mayo);
        
        int meno = obtenerCalificacionMasBaja();
        System.out.println("La calificacion mas baja es: " + meno);
        
        
        
    }
    
        public static int calcularPromedio() {
        sumcal = 0; 
        for (int calif : cal) {
            sumcal += calif;
        }
        return sumcal / cal.length; 
    }
        
        public static int contarCalificacionesMayores(){
        for (int calif : cal){
            prom = calcularPromedio();
            if (calif >= prom){
              calif = mayoroigual;
            }
            
        }
             return mayoroigual;
        }
        
        public static int obtenerCalificacionMasAlta(){
         int may = cal[0]; 
        for (int calif : cal) {
            if (calif > may) {
                may = calif; 
            }
        }
        return may; 
    }
        
         public static int obtenerCalificacionMasBaja(){
         int men = cal[0]; 
        for (int calif : cal) {
            if (calif < men) {
                men = calif; 
            }
        }
        return men; 
    }
}
    
       
       
    

