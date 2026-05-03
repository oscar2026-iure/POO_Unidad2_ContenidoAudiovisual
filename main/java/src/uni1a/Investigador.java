package uni1a;

/**
 * Clase que representa a un investigador.
 * Se relaciona con Documental mediante asociación.
 */
public class Investigador {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    public Investigador(String nombre, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return nombre + " (Especialista en " + especialidad + ")";
    }
}