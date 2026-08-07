package Ej02.operadores_expresiones;

class ArithmeticDemo {
 public static void main(String[] args) {

    // Verifico que el usuario ingrese dos numeros por la linea de comando
    if (args.length < 2) {


    System.out.println("Debe ingresar dos números.");
    return;
}
    int b = Integer.parseInt(args[0]); // variable 1
    int c = Integer.parseInt(args[1]); // variable 2
    
    // codigo de ArithmeticDemo
    int result = 1 + 2;
    int a = 5;
    int i = 3;
    
    // Caso de prueba
    a += ++i; 
    
    result = result - 1;  // se puede cambiar la asignacion simple por result -=1;
    result = result * 2;  // se puede cambiar la asignacion simple por result *=2;
    result = result / 2;  // se puede cambiar la asignacion simple por result /=2;
    result = result + 8;  // se puede cambiar la asignacion simple por result +=8;
    result = result % 7; // se puede cambiar la asignacion simple por result %=7;

    System.out.println(result);
    System.out.println(a);
    System.out.println("-------------------");

    // Muestra resultados de las operaciones basicas con las nuevas variables
    System.out.println("Suma:" + (b + c));
    System.out.println("Resta:" + (b - c));
    System.out.println("Multiplicacion:" + (b * c));
    System.out.println("Division:" + (b / c));
    System.out.println("Mod/Resto:" + (b % c));
    
 }
}

