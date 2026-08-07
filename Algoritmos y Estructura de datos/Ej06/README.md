Explicacion de sobre carga:
Def: Una sobre carga es usar el mismo metodo, pero con un fin diferente.
En este caso se hace una sobre carga del metodo al modificar el tipo de datos con los que estabamos trabajando, pasamo de trabajar con enteros a trabajar con decimales (double).

Ejemplo de uso con arreglos validos:

public static void main(String[] args) {
    int[] vectorA = {1,2,3};
    int[] vectorB = {4,5,6};
    multiplicarVectores(vectorA, vectorB); // llama funcion
    int[] vectorResultado = multiplicarVectores(vectorA, vectorB); // guarda los resultados en otro vector
    for(int i = 0; i < vectorResultado.length; i++){
        System.out.println(vectorResultado[i]);
    }
 }
 El resultado de este ejemplo es:
 4
 10
 18

Ejemplo de uso con arreglos invalidos:
public static void main(String[] args) {
    int[] vectorA = {1,2,3};
    int[] vectorB = {4,5};
    multiplicarVectores(vectorA, vectorB); // llama funcion
    int[] vectorResultado = multiplicarVectores(vectorA, vectorB); // guarda los resultados en otro vector
    for(int i = 0; i < vectorResultado.length; i++){
        System.out.println(vectorResultado[i]);
    }
 }
El resultado de este ejemplo es null porque la longitud de los vectores no es igual. La cuenta no se puede realizar porque falta un elemento en el array B.
