package Ej08;

public class StringBuilderDemo {
    public static void main(String[] args){
        
        StringBuilder frase = new StringBuilder("Ayer fui a correr y hoy voy al gimnasio");
        System.out.println(frase);

        System.out.println(frase.append(" a la tarde"));
        System.out.println(frase.delete(0, 8));
        System.out.println(frase.insert(2,1));
        System.out.println(frase.deleteCharAt(1));
        System.out.println(frase.reverse());
        System.out.println(frase.capacity()); // muestra 55
       

    }
    
}
