/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_return;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar o llamar al metodo
        //Si regresa resultados, tenemos 2 opciones
        //Hacer algo con el valor
         //Guardarlo y usarlo varias veces
         int val;
         val = sumarDosEnteros(100, 50);
         System.out.println("El resultado es:" + " " + val);
         //Usarlo una sola vez
         System.out.println("Resultado:" + "" + sumarDosEnteros(100, 150));
        //Ignorar el valor
        sumarDosEnteros(100, 50);
    }
    //SUMAR 2 ENTEROS
    public static int sumarDosEnteros(int n1, int n2){
     int res;
     res = n1+n2;
        return res;
        
    }
    
}
