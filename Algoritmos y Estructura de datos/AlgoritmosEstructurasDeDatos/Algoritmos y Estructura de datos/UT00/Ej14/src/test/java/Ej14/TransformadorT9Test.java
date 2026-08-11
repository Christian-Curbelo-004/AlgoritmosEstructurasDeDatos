package Ej14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransformadorT9Test {

    // Test basico
    @Test
    public void convertirJavaAT9() {

        String palabra = TransformadorT9.convertirT9("java");

        assertEquals("5282", palabra);
    }

    // Test parametrizado
    @ParameterizedTest
    @CsvSource({
        "java, 5282",
        "hola, 4652",
        "abc, 222"
    })
    public void convertirVariasPalabrasAT9(String texto, String esperado) {

        String resultado = TransformadorT9.convertirT9(texto);

        assertEquals(esperado, resultado);
    }

    @Test
    public void textoNullLanzaExcepcion() {

    assertThrows(IllegalArgumentException.class, () -> {TransformadorT9.convertirT9(null);
    });
}
}