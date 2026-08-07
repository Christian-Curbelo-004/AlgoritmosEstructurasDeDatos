Cambios realizados:

/*
class ArithmeticDemo {
 public static void main(String[] args) {
 
 int result = 3;
 result -= 1;
 result *= 2;
 result /= 2;  
 result += 8;  
 result %= 7; 

 System.out.println(result); 
 }
}

Funcionamiento: Para que la operacion compuesta funcione correctamente, debe haber una variable con un valor asignado.

*/

Explicacion de lo que pasa con la instrucción: int a = 5; int i = 3; a += ++i;.
1: Defino como entero la variable a y le asigno el valor de 5
2: Defino como entero la variable i seguido de la asignacion de su valor que es 3
3: Vuelvo a definir la variable a sin declarar su tipo, lo que luego es sumarle uno a la variable i que pasa a ser 4 (antes i = 3) y al final se lo sumo a la variable a
4: Como resultado obtengo un 9 = 5 + 4

