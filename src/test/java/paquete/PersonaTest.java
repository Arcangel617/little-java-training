package paquete;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PersonaTest {

    private static final String NOMBRE = "John Doe";
    private static final int DNI = 12345678;
    private static final byte EDAD = 21;

    private Persona persona;

    @Before
    public void setUp() {
        persona = new Persona(NOMBRE, DNI, EDAD);
    }

    @Test
    public void debeAsegurarQueLaPersonaSeLlamaJohnDoe() {
        assertThat(persona.getNombre(), is(NOMBRE));
    }

    @Test
    public void debeAsegurarQueLaPersonaTieneDni() {
        assertThat(persona.getDni(), is(DNI));
    }

    @Test
    public void debeAsegurarQueLaPersonaTiene21Anios() {
        assertThat(persona.getEdad(), is(EDAD));
    }

    @Test
    public void debeAsegurarQueLaPersonaNoTieneGenero() {
        assertThat(persona.getGenero(), nullValue());
    }

    @Test
    public void debeAsegurarQueLaPersonaSabeHablar() {
        String result = persona.hablar();

        assertThat(result, is("Hola me llamo 'John Doe'"));
    }

}