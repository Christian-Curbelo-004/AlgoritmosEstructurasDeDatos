package Ej14;

public class TransformadorT9 {
    public static String convertirT9(String texto) {
        if (texto == null) {
    throw new IllegalArgumentException("El texto no puede ser null");
}
        String palabras = "";

        for (char caracter : texto.toCharArray()) {
            switch (caracter) {
                case 'a':
                case 'b':
                case 'c':
                    palabras += 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    palabras += 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    palabras += 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    palabras += 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    palabras += 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    palabras += 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    palabras += 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    palabras += 9;
                    break;
            }
        }

        return palabras;
    }
    public static String convertirT9Invertido(String texto) {
        StringBuilder builder = new StringBuilder(texto);
        builder.reverse();
        String invertido = builder.toString();
        return convertirT9(invertido);
    }

}
