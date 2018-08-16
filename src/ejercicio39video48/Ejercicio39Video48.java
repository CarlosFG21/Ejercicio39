/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio39video48;

import ejercicio39video48.Uso.talla;
import java.util.Scanner;

public class Ejercicio39Video48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Uso n = new Uso();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ESCRIBE UNA TALLA: MINI,MEDIANO,GRANDE,MUY_GRANDE");
       
        String entrada_datos = entrada.next().toUpperCase();
        
        talla la_talla=Enum.valueOf(talla.class, entrada_datos);
        
        System.out.println("TALLA= "+la_talla);
        
        System.out.println("ABREVIATURA = " + la_talla.dameAbreviatura());
    }
    
}


    
    

