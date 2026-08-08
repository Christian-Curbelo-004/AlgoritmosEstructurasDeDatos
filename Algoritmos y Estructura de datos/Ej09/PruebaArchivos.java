package Ej09;
import java.util.Arrays;
public class PruebaArchivos {
    public static void main(String[]args){
        ContadorPalabras contador = new ContadorPalabras();
        String[] a = {"java", "python", "c", "javascript"};
       String[] b = {"java", "c", "ruby"};
       System.out.println("Con arrays: " + Arrays.toString(contador.palabrasComunes(a, b)));
       System.out.println("Con arrays list: " + contador.ColeccionPalabrasComunes(a, b));
       contador.palabrasComunes(a, b);
       
      
    }
    
}
