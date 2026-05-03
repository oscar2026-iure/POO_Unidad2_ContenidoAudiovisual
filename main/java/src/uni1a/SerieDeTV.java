/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private Temporada temporadaActual; // Agregamos la relación con la clase Temporada (Etapa 2)

    // Constructor modificado para recibir la Temporada
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, Temporada temporadaActual) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temporadaActual = temporadaActual;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Getter y Setter para la temporada (útil para la Etapa 5)
    public Temporada getTemporadaActual() {
        return temporadaActual;
    }

    public void setTemporadaActual(Temporada temporadaActual) {
        this.temporadaActual = temporadaActual;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:"); // Corregido de "película" a "serie"
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Total de temporadas: " + this.temporadas);
        
        // Verificamos si existe una temporada asignada para mostrar sus detalles (Etapa 5)
        if (temporadaActual != null) {
            System.out.println("Información de la " + temporadaActual.toString());
        } else {
            System.out.println("Temporada: No asignada");
        }
        System.out.println();
    }
}