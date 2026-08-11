package Ej04.UtilMath;
import java.util.Scanner;

public class UtilMath {
 public static int factorial(int num) {
    int resultado = 1;

    for(int i = 1; i<= num; i++){
        resultado = resultado * i;
    }
         return resultado; // 
 }

 public static boolean isPrime(long n) {
    if(n < 2)
        return false;

    for(int i = 2; i< n; i++){
        if(n % i == 0){
            return false;
        }
        

    }
    return true;
}

    public static int sumarPares(int n) {
    int numeroA = 0;
    int suma = 0;

    while (numeroA <= n) {
        suma = suma + numeroA;
        numeroA += 2;
    }

    return suma;
}

 public static int sumarImpares(int n) {
    int numeroA = 1;
    int suma = 0;

    while (numeroA <= n) {
        suma = suma + numeroA;
        numeroA += 2;
    }

    return suma;
}
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = scanner.nextInt();
    int factorial = UtilMath.factorial(numero);
    System.out.println("El factorial de " + numero + " es: " + factorial);
    
    boolean primo = UtilMath.isPrime(numero);
    
    if (primo) {
    System.out.println("El número es primo.");
    System.out.println("Suma de pares: " + UtilMath.sumarPares(numero));

} else {
    System.out.println("El número no es primo.");
    System.out.println("Suma de impares: " + UtilMath.sumarImpares(numero));
}

    scanner.close();

 }
}
