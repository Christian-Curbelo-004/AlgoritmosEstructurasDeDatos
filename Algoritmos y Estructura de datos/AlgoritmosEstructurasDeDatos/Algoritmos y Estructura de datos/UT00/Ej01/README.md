README!!!

1: ¿Cómo compilar el programa?

Respuesta: usamos el comando cd que nos permite navegar entre las carpetas, por defecto estaremos ubicados en la carpeta "Algoritmos y Estructura de datos". Con cd navegamos hasta
la carpeta Ej01, una vez ahí escribimos "javac atributos\PruebaAtributos.java" ya que en la carpeta atributos se encuentra el package del programa, una vez compilado, en la misma
terminal escribimos "java atributos.PruebaAtributos" y se mostrarán los resultados.

2: Breve explicación escrita de JVM, JDK y JRE.

JVM (Java Virtual Machine): Es la maquina virtual de Java, nos permite ejecutar el codigo compilado y eso es lo que genera el archivo .class. Este archivo es ejecutado por JVM y no por Windows. 
Para que este archivo pueda ejecutarse en cualquier sistema operativo, JVM lo que hace es traducir el bytecode.

JDK (Java Development Kit): Es el kit de desarrollo de Java, este nos permite crear aplicaciones e incluye las herramientas como el compiplador (javac),JVM y JRE. Sin el JDK no podemos compilar ningun
programa en Java.
Al momento de compilar el programa PruebaAtributos, use javac atributos\PruebaAtributos.java y eso quiere decir que estaba usando la herramienta de JDK.

JRE (Java Runtime Environment): Es el entorno de ejecucion, permite que un programa de Java logre ejecutarse. JRE contiene JVM y las bibliotecas String, System, Math, etc.

3: Tabla pequeña con ejemplos de tipos primitivos y de referencia usados en el programa.

Tipo            Categoria              Ejemplo de uso
---------------------------------------------------------      
String            Referencia             nombre
boolean          Primitivo               estudia
int              Primitivo               22
double           Primitivo               altura
char             Primitivo               inicial


