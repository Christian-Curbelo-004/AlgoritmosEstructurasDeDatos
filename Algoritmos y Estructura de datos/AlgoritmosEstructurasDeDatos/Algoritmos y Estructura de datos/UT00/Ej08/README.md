Explicar qué es StringBuilder y para qué sirve.

StringBuilder es una clase de paquete de Java que nos permite crear y modificar cadena de caracteres de forma mutable, ya que las Strings por defecto son tipos inmutables.
Una de las caracteristicas de StringBuilder es que modifica el contenido en memoria, esto evita que se creen nuevos objetos.







Explicar por qué comparar String con == puede producir errores lógicos, corregir el caso del bucle
infinito y relacionarlo con equals, intern() y el string pool.

Comparar String con == puede producir errores logicos porque == compara si ambas variables hacen referencia al mismo objeto en la memoria, para comprar el resultado de las Strings
debemos usar equals().

Para solucionar el caso del bucle infinito deberiamos usar equals() ya que como vimos en el anterior punto, comparar Strings con == puede llevar a errores logicos y un bucle infinito
es uno de ellos.

String pool: En java tenemos la String pool que lo que hace es reutilizar algunos Strings, a veces puede pasar que hagan referencia a dos variables con el mismo literal, todo parece que apuntan al mismo objeto porque son lo mismo, pero eso es un problema porque al usar == no quiere decir que sea correcto la comparacion del contenido.

intern(): Este metodo lo que hace es devolvernos la representacion de un String pool, en caso de que exista una cadena con un contenido en la pool, vamos a tener una referencia a esa cadena y sino, se crea y se devuelve la referencia.