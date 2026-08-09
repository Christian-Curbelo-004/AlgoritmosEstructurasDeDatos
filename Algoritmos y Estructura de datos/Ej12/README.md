Bitacora:

Caso 1:
Problemas observados:
Al momento de leer un un archivo con File.readAllines(ruta), se obtenia una lista de tipo Stirng List<String>, el metodo en este caso obtenerLineas() tendria que retornar un array de String (String[]), pero use toString() y eso generaba un error.

Causa del error:
Confundi la conversion de la coleccion con la representacion de un texto de esa misma coleccion. Con toString() obtenia un solo string, pero lo que tenía que retornar seria un array de Strings.

Correccion aplicada:
En vez de usar toString() use toArray(new String[0]) ya que me permite convertir una lista de string en un arreglo de string.

Version funcional:
List<String> lineas = Files.readAllLines(ruta);
String[] nuevasLineas = lineas.toArray(new String[0]);
return nuevasLineas;

Version con fallas controladas con try-catch:
try {
    List<String> lineas = Files.readAllLines(ruta);
    return lineas.toArray(new String[0]);
} catch (IOException e) {
    System.out.println("No se pudo leer el archivo.");
    return new String[0];
}

Buena practica:
Reconocer correctamente los metodos y lo que se pide retornar antes de asignarlo a una variable.

Caso 2:
Confusión entre Scanner(System.in) y Scanner(archivo)
Problema observado:
Al momento de leer un archivo confundí new Scanner(System.in) entonces el programa esperaba una entrada por teclado y no leerlos directamente desde el archivo.

Causa probable:
Desconocimineto de los métodos y de la diferencia entre los mismos.

Corrección aplicada:
Se creó primero el objeto File con la ruta recibida y luego se utilizó ese objeto para construir el Scanner.

Version funcional:
File archivo = new File(rutaArchivo);
Scanner scanner = new Scanner(archivo);

Version que falla de forma controlada con try-catch:
try {
    File archivo = new File(rutaArchivo);
    Scanner scanner = new Scanner(archivo);
} catch (FileNotFoundException e) {
    System.out.println("No se encontró el archivo indicado.");
}