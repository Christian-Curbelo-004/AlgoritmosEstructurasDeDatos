package Ej09;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

class ContadorPalabras implements ProcesadorTexto {
    private String texto;

    // constructor vacio
    public ContadorPalabras(){

    }
    // constructor que recibe texto 
    public ContadorPalabras(String texto){
        this.texto = texto;
    }
    
 @Override
 public int contarPalabras(String texto) { // cuenta las palabras de un string solo
     String[ ] palabras = texto.split(" ");
 return palabras.length; // todo

 }
 //sobrecarga
 public int contarPalabras(String[] lineas){// cuenta las palabras de varios strings
    int total = 0;
    for(int i = 0; i< lineas.length; i++){
        total = total + contarPalabras(lineas[i]); // reutilizo el primer mtodo
    }
    return total;
 }

 // Ejercicio 10
 public ResultadoAnalisis analizar(String texto){
    int palabras = contarPalabras(texto);
    int caracteres = texto.length();

    ResultadoAnalisis resultadoAnalisis = new ResultadoAnalisis(palabras, caracteres);
    return resultadoAnalisis;
    }
    public String[] obtenerLineas(String archivo){
        Path ruta = Path.of(archivo);
    
    try{
        List<String> lineas = Files.readAllLines(ruta);
        String[] nuevasLineas = lineas.toArray(new String[0]);
        return nuevasLineas;
    }
    
    catch(IOException e){
        return new String[0];
    }
    
}
    public String[] palabrasComunes(String[] a, String[]b){
        int contador = 0;
        String[] palabraComun = new String[a.length];
        for(int h = 0; h< a.length; h++){
            for(int i = 0; i< b.length; i++){
                if(a[h].equals(b[i])){
                    palabraComun[contador] = a[h];
                    contador++;           
                }   
            }
        }
        String[] resultado = new String[contador];
        for(int j =0; j < contador; j++){
            resultado[j] = palabraComun[j];
            
        }
        return resultado;
    }

    
    public List<String> ColeccionPalabrasComunes(String[]a, String[]b){
        List<String> comunes = new ArrayList<>();
        for(String palabraA : a){ // for-each
            for(String palabraB : b){
                
                if(palabraA.equals(palabraB)){
                    comunes.add(palabraA);  
                }
            }
        }
        return comunes;
        
    }
    /* 
    la lista la creamos afuera del for porque lo que  queremos es que se agreguen las palabras que tienen en comun (en caso de que las haya), si creamos la lista dentro del for
    estariamos creando una lista cada vez que se recorre el bucle y no es la idea.
    */ 

 }

 

