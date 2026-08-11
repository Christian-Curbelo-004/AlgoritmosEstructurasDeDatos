 Ejercicio 14 - Transformador T9 con JUnit 5

Descripción:

Este proyecto implementa un transformador de texto al formato T9 utilizado en los teclados numéricos tradicionales.

Cada grupo de letras se transforma al número correspondiente:

- ABC → 2
- DEF → 3
- GHI → 4
- JKL → 5
- MNO → 6
- PQRS → 7
- TUV → 8
- WXYZ → 9

También se implementa una variante que invierte el texto antes de realizar la conversión a T9.

Ejemplo:

java devuelve 5282

java invertido devuelve avaj > 2825

 Estructura del proyecto

El proyecto utiliza la estructura estándar de Maven:

src/main/java → código principal

src/test/java → pruebas con JUnit 5

El programa principal se encuentra en App.java y la lógica de transformación en TransformadorT9.java.

 Pruebas

Se utilizaron pruebas con JUnit 5 para verificar el funcionamiento del transformador.

Se implementaron:

- Test básico.
- Test parametrizado.
- Test de excepción.
- Test con timeout.

 Ejecutar los tests

Abrir una terminal en la carpeta del proyecto donde se encuentra pom.xml y ejecutar:

bash
mvn test

CHECKLIST:
 Proyecto organizado con Maven. v
 Estructura src/main/java. v
 Estructura src/test/java. v 
 Variante con texto invertido. v 
 JUnit 5 configurado. v
 Test básico. v
 Test parametrizado. v
 Test de excepción. v
 Test con timeout. v
 Ejecución de pruebas mediante mvn test. v
 README con instrucciones de ejecución. v