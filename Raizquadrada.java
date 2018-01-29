
package raizquadrada;

public class Raizquadrada {
 static void Raizesquadradas(int Inf, int sup)
 {for(int I=Inf; I<=sup;I++)
  System.out.print(String.format("%5.1f", Math.sqrt(I)));       }
    
    public static void main(String[] args) 
    {Raizesquadradas(25,36);
    Raizesquadradas(100,120);
        // TODO code application logic here
    }
    
}
