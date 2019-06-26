package paquete;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import tipos.Genero;

@AllArgsConstructor
public class Persona {

    private String nombre;
    private int dni;
    @Getter
    @Setter
    private byte edad;
    @Getter
    @Setter
    private Genero genero;

    public Persona(String nombre, int dni, byte edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String hablar() {
        return "Hola me llamo '" + nombre +  "'";
    }
}
