package Ej09;

public class PruebaProcesos {
    public static void main(String[] args){

        // polimorfismo
        ProcesadorTexto textoProcesador = new ContadorPalabras();
        ProcesadorTexto otroProcesador = new TextoProcesado();

        System.out.println(textoProcesador.contarPalabras("Hoy esta helado"));
        System.out.println(otroProcesador.contarPalabras("Hoy esta helado"));
        
        ContadorPalabras contador = new ContadorPalabras();
        ResultadoAnalisis resultado = contador.analizar("Hoy esta helado");
        System.out.println(resultado);
        
    }
}
