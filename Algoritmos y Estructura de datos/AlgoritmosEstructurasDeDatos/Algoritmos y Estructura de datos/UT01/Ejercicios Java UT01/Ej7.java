import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej7 {
   public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File ("numeros.txt"); // contiene los numeros
        Scanner scanner = new Scanner (archivo);  // lee contenido
        

    int N = scanner.nextInt(); // lee la primera linea
    int[] numeros = new int[N]; // arreglo de tama;o n
    
    int contIntercambios = 0; // cuenta los intercambios 
    int contIf = 0; // cuenta las veces que evalua el if

    for(int h = 0; h < N; h++){ // lee los siguientes N numeros del archivo y los guarda en el array
        
        numeros [h] = scanner.nextInt(); // los guarda en el array
    }
    scanner.close();

    for (int i = 0; i < N-1; i++){  // empieza al final del array y va hacia atras
        for(int j = N-1; j > i; j--){
            contIf++; // contador de comparaciones
            if(numeros[j] < numeros[j-1]){ // compara dos elementos
                int varAuxiliar = numeros[j]; // guarda valor de numeros[j] durante el intercambio
                numeros[j] = numeros[j-1]; // hace intercambio
                numeros[j-1] = varAuxiliar;
                contIntercambios++; // cuenta solamente si hubo cambios
            }
            
        }
    }
    System.out.println("N: " + N);
    System.out.println("Cantidad de veces que se evaluó el if: " + contIf);
    System.out.println("Cantidad de intercambios: " + contIntercambios);
    System.out.println("Primer elemento: " + numeros[0]);
    System.out.println("Último elemento: " + numeros[N - 1]);
   }
   // NOTA: El 10 en el archivo txt quiere decir que luego de el vienen 10 numeros mas
    
}