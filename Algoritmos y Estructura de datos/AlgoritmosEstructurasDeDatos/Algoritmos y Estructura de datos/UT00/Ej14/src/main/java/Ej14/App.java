package Ej14;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String palabra = TransformadorT9.convertirT9("java");
        String palabraInvertida = TransformadorT9.convertirT9Invertido("java");

        System.out.println("Texto normal: " + palabra);
        System.out.println("Texto invertido: " + palabraInvertida);
    }
}
