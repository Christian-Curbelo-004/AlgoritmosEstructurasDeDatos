package Ej09;

public class TextoProcesado implements ProcesadorTexto{
    @Override
    public int contarPalabras(String texto){
        
        String[ ] palabras = texto.trim().split("\\s+");
        return palabras.length;
    } 
}
