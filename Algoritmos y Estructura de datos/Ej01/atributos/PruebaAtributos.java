//Primer programa Java, variables e inicialización
package atributos;

// defino la clase
public class PruebaAtributos{
    private String nombre; // defino los atributos
    public boolean estudia;
    public int edad;
    public double altura;
    public char inicial;

    public static void main(String[] args){
        
        // creo la instancia del objeto
        PruebaAtributos persona = new PruebaAtributos(); 
        
        // Muestro el valor por defecto del atributo de las variables
        System.out.println(persona.nombre); // devuelve null
        System.out.println(persona.estudia); // "" false
        System.out.println(persona.edad);  // "" 0
        System.out.println(persona.altura); // "" 0.0
        System.out.println("[" + persona.inicial + "]"); // con corchetes devuelve [] 
        System.out.println(persona.inicial); // devuelve \u0000, pero no se ve en linea

        /*
            Hice la prueba de compilar las variables sin inicializar y luego con valores asignados.
            Se obtienen resultados diferentes, y note una caracteristica en el uso de char, si no usamos corchetes, no se muestra el valor por defecto
            pero al usarlos, obtenemos como resultado: [].
        
        */
    }
}