Calculo de la memoria
Hice el calculo de la memoria ocupada por las variables declaradas, ignorando el encabezado de los objetos, la memoria utilizada por la máquina virtual de Java (JVM) y las referencias.

Clases:

Dispositivo Medico (Clase padre):
Marca paso (Clase hija):
Desfibrilador (Clase hija):

Dispositivo Medico:
int idDispositivo: costo de memoria: 4 bytes
String codigoFabricante(referencia): "": 4 bytes
byte nivelBateria: "": 1 bytes
total = 9 bytes


Marca paso:
short latidosPorMinutos: costo de memoria: 2 bytes
total = 2 bytes

Desfibrilador:
int nivelDescargas: costo de memoria: 4 bytes
int cantidadCargasAplicadas: "" 4 bytes
total = 8 bytes

Justificacion de equals() y hashCode()
Se usaron en la clase padre porque los otros dispositivos (marca paso y desfibrilador) comparten atributos como el id y codigo de fabricante, estos sirven para representar la identidad del dispositivo y con equals y hashCode podemos evaluar si son exactamente los mismos dispositivos medicos. Al definirlos en la clase padre evitamos repetir codigo.


