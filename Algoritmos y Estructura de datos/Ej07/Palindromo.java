package Ej07;

public class Palindromo {
    public static void main(String[] args) {
        String palindrome = "Ayer lave el auto. Luego sali a dar una vuelta";
        String hannah = "DidHannah see bees? Hannah did.";
        String frase = "anita lava la tina";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        // El método split() divide una cadena según el separador indicado y devuelve un arreglo (String[]) con cada una de las partes obtenidas.
        String palabraString = "Hoy-Esta-Soleado";
        String[] partes = palabraString.split("-");
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }

        
        String nuevoArray = new String(charArray);
        System.out.println(nuevoArray);
        System.out.println(hannah.toLowerCase()); // cambia a minuscula
        System.out.println(frase.toUpperCase()); // cambia a mayuscula
        System.out.println(palindrome.substring(1,3)); // imprime las posiciones
        System.out.println(frase.trim());
        System.out.println(frase.indexOf(0)); // fixear esto
        System.out.println(frase.lastIndexOf(3));
        System.out.println(frase.contains("a"));
        System.out.println(frase.replace("a", "e"));
        System.out.println(frase.replaceAll("anita lava la tina", "Aguante el bolso"));
        System.out.println(frase.replaceFirst("anita lava la tina", "Aguante cidudad gotica"));
        System.out.println("La longitud de la frase es: "+ frase.length());
        System.out.println("La sub sequence de la frase es: "+ frase.subSequence(1,2));




        
    }
}

