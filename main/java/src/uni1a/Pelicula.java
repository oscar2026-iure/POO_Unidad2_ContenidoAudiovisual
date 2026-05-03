/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actorPrincipal; // Agregamos la relación con la clase Actor (Etapa 2)

    // Constructor modificado para recibir también al Actor
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, Actor actorPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actorPrincipal = actorPrincipal;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // Getter y Setter para el actor (útil para la Etapa 5: Sistema Funcional)
    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        
        // Verificamos si existe un actor asignado para mostrar sus datos
        if (actorPrincipal != null) {
            System.out.println("Actor Principal: " + actorPrincipal.getNombre() + " (Papel: " + actorPrincipal.getPapel() + ")");
        } else {
            System.out.println("Actor Principal: No asignado");
        }
        System.out.println();
    }
}