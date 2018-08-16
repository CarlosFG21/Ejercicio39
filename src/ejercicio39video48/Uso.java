
package ejercicio39video48;

import java.util.*;

public class Uso {
    
   enum talla{
       
       MINI("S"), MEDIANO("M"), GRANDE("L"),MUY_GRANDE("XL");
       
       private talla(String abreviatura){
           
           this.abreviatura=abreviatura;
       }
       
       public String dameAbreviatura(){
      
       return abreviatura;
       
   }
   private String abreviatura;
   
   }
}
