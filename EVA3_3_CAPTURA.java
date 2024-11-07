/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido:");
                 double sal1 = imprimirSalario("Tu salario es:");
                 int edad1 = imprimirNum("Tu edad es:");
                 System.out.println();
        System.out.println("Nombre:" + nombre);
         System.out.println("Apellido:" + apellido);
         System.out.println("Salario:" + sal1);
         System.out.println("Edad:" + edad1);
    }
    
    public static String capturarTexto(String mensaje){
    
        Scanner cap = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = cap.nextLine();
        return texto;  
    }
    
    public static double imprimirSalario(String sal){
    
        Scanner cap = new Scanner(System.in);
        double salario;
        System.out.println(sal);
        salario = cap.nextDouble();
        return salario;
    }
    
    public static int imprimirNum(String ed){
        Scanner cap = new Scanner(System.in);
        int edad;
        System.out.println(ed);
        edad = cap.nextInt();
        return edad;
    }
}
