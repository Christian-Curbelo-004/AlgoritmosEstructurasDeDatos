package Ej09;

public class ResultadoAnalisis {
    private int cantidadPalabras;
    private int cantidadCaracteres;
    
    public ResultadoAnalisis(int cantidadPalabras, int cantidadCaracteres){
        this.cantidadPalabras = cantidadPalabras;
        this.cantidadCaracteres = cantidadCaracteres;

    }
    @Override
    public String toString(){
        return "Cantidad de palabras: " + cantidadPalabras   + "Cantidad caracteres: " + cantidadCaracteres;

    }
}
