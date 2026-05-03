/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // Agregamos la relación con la clase Investigador (Etapa 2)

    // Constructor modificado para recibir también al Investigador
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Getter y Setter para el investigador (necesario para la Etapa 5)
    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:"); // Corregido de "película" a "documental"
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        
        // Verificamos si existe un investigador asignado para mostrar sus datos (Etapa 5)
        if (investigador != null) {
            System.out.println("Investigador a cargo: " + investigador.getNombre() + 
                               " (Especialidad: " + investigador.getEspecialidad() + ")");
        } else {
            System.out.println("Investigador: No asignado");
        }
        System.out.println();
    }
}