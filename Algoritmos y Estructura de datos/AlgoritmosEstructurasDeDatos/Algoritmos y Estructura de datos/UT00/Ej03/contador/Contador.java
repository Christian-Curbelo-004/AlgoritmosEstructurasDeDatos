package Ej03.contador;

import java.util.Scanner; // para leer los inputs

public class Contador {
    final int MAX_CONT = 5; // hasta 5
    int incremento = 1; // incrementa en 1
    int contador = 0; // el contador empieza en 0

    static int cantidadObjetos = 0;

    public Contador(){
        cantidadObjetos++;
    }

    // metodo que cuenta con while
    public void contadorConWhile(){
        contador = 0;
        while(contador <= MAX_CONT){
            System.out.println(contador);
            contador +=incremento;
        }
    }

    // metodo que cuenta con Do While
    public void contadorConDoWhile(){
        contador = 0;
        do{
            System.out.println(contador);
            contador += incremento;
        }while(contador <= MAX_CONT);
    }

    public void contadorConFor(){
        for(contador = 0; contador <= MAX_CONT; contador += incremento){
            System.out.println(contador);
        }
    }

    // menu
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // contador de objetos
        Contador contadorA = new Contador();
        System.out.println("Elegí una opción:");
        System.out.println("1 - Contar con while");
        System.out.println("2 - Contar con do-while");
        System.out.println("3 - Contar con for");

        // lee la opcion
        int opcion = scanner.nextInt();

        // creo el menu
        switch(opcion){
            // uso de cada metodo
            case 1:
                contadorA.contadorConWhile(); 
                break;
            case 2:
                contadorA.contadorConDoWhile();
                break;
            case 3:
                contadorA.contadorConFor();
                break;
            default:
                System.out.println("Opcion invalida");
        }
        Contador contadorB = new Contador();
        System.out.println("Cantidad de objetos creados: " + Contador.cantidadObjetos);
        System.out.println("Contador del objeto 1: " + contadorA.contador);
        System.out.println("Contador del objeto 2: " + contadorB.contador);

        scanner.close(); 
        
    }

}
    

   
