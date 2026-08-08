package Ej11;


import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.InputMismatchException;

public class Principal {

// Parte A
 public static void leerEntradaArchivo(String rutaArchivo) {
    File archivo = new File(rutaArchivo);
    
    try{
        Scanner nuevoScanner = new Scanner(archivo);
            int numEntero = nuevoScanner.nextInt();
            int numEnteroDos = nuevoScanner.nextInt();
            double numDecimal = nuevoScanner.nextDouble();
            nuevoScanner.nextLine();
            String texto = nuevoScanner.nextLine();


            System.out.println("Numero entero: " + numEntero);
            System.out.println("Numero decimal: " + numDecimal);
            System.out.println("Texto: " + texto);
            

            // llama calculo
            Calculo(numEntero, numEnteroDos);

            // cierra el scanner
            nuevoScanner.close();
    }catch(FileNotFoundException e){
        System.out.println("No se logro encontrar el archivo");
    }
    
    
 }
 // calcula radio del circulo
 public static void calcularRadio(double radio){
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
 // hace los calculos 
 public static void Calculo(int numEntero, int numEnteroDos){
    int suma = numEntero + numEnteroDos;
    int division = numEntero / numEnteroDos;
    int mod = numEntero % numEnteroDos;

    System.out.println("Suma: " + suma);
    System.out.println("Division "+ division);
    System.out.println("Resto: " + mod);
 }

 public static void leerEntradaStdin() {
    Scanner scanner = new Scanner(System.in);
    try{
         System.out.println("Ingrese el radio del circulo: ");
         double radioCirculo = scanner.nextDouble();
         calcularRadio(radioCirculo);
    }catch(InputMismatchException e){
        System.out.println("Error al ingresar un numero");
    }
    scanner.close();
 }


 public static void main(String[] args){
    leerEntradaArchivo("Ej11/texto.txt");
    leerEntradaStdin();
    
    
 }
}
 
 



