/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodos;

import java.util.Scanner;



/**
 *
 * @author Osvaldo Chavez
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mayor de 15 y 100 =" + buscarMayor(15 , 100));
     
        System.out.println(seleccionarDia(1));
    }
    public static int buscarMayor(int n1, int n2){        
        
        if (n1 > 2){
        return n1;
        }
        else{
        return n2;
           
        }
       /*
        
        if (n1 > 2){
        return n1;
        }else{
        return n2;  
    */
    }
    public static String seleccionarDia(int dia){
        switch (dia){
            case 1: 
                return "Es lunes";
            case 2:
                return "Es martes";
            case 3:
                return "Es miercoles";
            case 4:
                return "Es jueves";
            case 5:
                return "Es viernes";
            case 6:
                return "Es sabado";
            case 7:
                return "Es domingo";
            default:
                return "No es valido";
        }
                
    
    }
    
    
}
