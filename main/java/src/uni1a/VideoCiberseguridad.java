package uni1a;

// Paso 1: Heredar de ContenidoAudiovisual
public class VideoCiberseguridad extends ContenidoAudiovisual {
    // Atributos adicionales (Iniciativa del estudiante)
    private String nivelDificultad;
    private String plataforma;

    // Constructor que incorpora atributos de la clase padre y propios[cite: 1]
    public VideoCiberseguridad(String titulo, int duracionEnMinutos, String genero, String nivelDificultad, String plataforma) {
        super(titulo, duracionEnMinutos, genero);
        this.nivelDificultad = nivelDificultad;
        this.plataforma = plataforma;
    }

    // Métodos (Implementación de la clase padre)[cite: 1]
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de Ciberseguridad:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Nivel: " + nivelDificultad);
        System.out.println("Plataforma: " + plataforma);
        System.out.println();
    }
}