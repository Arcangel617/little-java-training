package example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static tipos.Sexo.HEMBRA;

public class GatoTest {

    private static final String COMIDA = "Whiskas";
    private static final int NRO_PATAS = 4;

    private Gato gato;

    @Before
    public void setUp() {
        gato = new Gato(NRO_PATAS, COMIDA, HEMBRA);
    }

    @Test
    public void debeAsegurarQueGatoTieneCuatroPatas() {
        assertThat(gato.getNroPatas(), is(NRO_PATAS));
    }

    @Test
    public void debeAsegurarQueGatoComeGatti() {
        assertThat(gato.getComida(), is(COMIDA));
    }

    @Test
    public void debeAsegurarQueGatoEnojadoMuestraLosDientes() {
        String resultado = gato.enojado();

        assertThat(resultado, is("Pelo erizado"));
    }

    @Test
    public void debeAsegurarQueGatoFelizRonronea() {
        String resultado = gato.feliz();

        assertThat(resultado, is("Purrrrrr"));
    }

    @Test
    public void debeAsegurarQueGatoMaulla() {
        String resultado = gato.sonido();

        assertThat(resultado, is("Miau"));
    }

    @Test
    public void debeAsegurarQueGatoComeWhiskas() {
        String resultado = gato.comer();

        assertThat(resultado, is("Comer " + COMIDA));
    }

    @Test
    public void debeAsegurarQueGatoGateaEnCuatroPatas() {
        String resultado = gato.mover();

        assertThat(resultado, is("Gatear en " + NRO_PATAS + " patas"));
    }

}