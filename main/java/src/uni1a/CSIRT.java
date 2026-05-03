package uni1a;

public class CSIRT extends ContenidoAudiovisual {
    private String organismo;
    private String tipoAlerta;

    public CSIRT(String titulo, int duracionEnMinutos, String genero, String organismo, String tipoAlerta) {
        super(titulo, duracionEnMinutos, genero);
        this.organismo = organismo;
        this.tipoAlerta = tipoAlerta;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Contenido CSIRT:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Organismo: " + organismo);
        System.out.println("Alerta: " + tipoAlerta);
        System.out.println();
    }
}