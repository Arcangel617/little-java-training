package example;

import tipos.Sexo;

public class Gato extends Animal {

    private Sexo sexo;

    public Gato(int nroPatas, String comida, Sexo sexo) {
        super(nroPatas, comida);
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String sonido() {
        return "Miau";
    }

    @Override
    public String feliz() {
        return "Purrrrrr";
    }

    @Override
    public String enojado() {
        return "Pelo erizado";
    }

    @Override
    public String comer() {
        return "Comer " + getComida();
    }

    @Override
    public String mover() {
        return "Gatear en " + getNroPatas() + " patas";
    }
}
