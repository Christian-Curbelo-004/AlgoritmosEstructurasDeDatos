
package Ej06;

public class Multsuma {
 public static double multsuma(double a, double b, double c) {
    
 return a * b + c;
 }

 // sobrecarga
 public static int multsuma(int a, int b, int c){
    return a * b + c;
 }

 // multiplicar vectores
 public static int[] multiplicarVectores(int[]a, int[] b){ // defino a y b como array
    
    // si la longitud de ambos vectores es igual, multiplica y los guarda en resultado que es otro vector
    if(a.length == b.length){
        int[] resultado = new int[a.length];
        for(int i = 0; i < a.length; i++){ // mientras que la longitud de a sea mayor a 0, ejecuta el codigo
            resultado[i]=a[i]*b[i]; // calculo y guarda
        }
        return resultado;
    }
    else{
        return null; // si la longitud no es igual, devuelve null
    }
 }
// main
 public static void main(String[] args) {
    int[] vectorA = {1,2,3};
    int[] vectorB = {4,5};
    multiplicarVectores(vectorA, vectorB); // llama funcion
    int[] vectorResultado = multiplicarVectores(vectorA, vectorB); // guarda los resultados en otro vector
    for(int i = 0; i < vectorResultado.length; i++){
        System.out.println(vectorResultado[i]);
    }
 }

} 
