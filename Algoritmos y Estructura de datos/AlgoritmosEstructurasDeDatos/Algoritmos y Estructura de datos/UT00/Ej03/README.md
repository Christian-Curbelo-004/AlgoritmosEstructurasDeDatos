 Ejercicio 3 - Contador incremental y control de flujo

 Descripción

Se implementó una clase Contador con los atributos:

 MAX_CONT: constante declarada con final.
 incremento: valor utilizado para incrementar el contador.
 contador: almacena el valor actual del conteo.

El programa implementa tres estructuras de repetición:

 while
 do-while
 for

Además, incorpora un menú mediante switch para seleccionar la variante de conteo a ejecutar y una demostración de la diferencia entre un atributo static y uno de instancia en el contador de objetos

Atributo static: pertenece a la clase y es compartido por todas las instancias.

Atributo de instancia: pertenece a cada objeto, por lo que cada instancia mantiene su propio valor.


Comparación entre while, do-while y for

while: se utiliza cuando no se conoce de antemano la cantidad de repeticiones y la condición debe verificarse antes de cada iteración.
do-while: garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa al finalizar la iteración.
for: es la mejor opción cuando se conoce la cantidad de repeticiones o cuando el recorrido tiene un inicio, una condición y un incremento definidos.

En este ejercicio, las tres estructuras producen el mismo resultado, variando únicamente la forma en que controlan el ciclo.

 Demostración de static

Se agregó el atributo cantidadObjetos declarado como static.

 Los atributos de instancia pertenecen a cada objeto creado.
 Los atributos static pertenecen a la clase y son compartidos por todas las instancias.

Al crear dos objetos Contador, el valor de cantidadObjetos aumenta para ambos, mientras que cada objeto mantiene su propio valor de contador.