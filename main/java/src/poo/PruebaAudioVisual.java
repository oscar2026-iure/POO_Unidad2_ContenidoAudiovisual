package poo;

import uni1a.*;

// Clase principal para ejecutar el sistema funcional de Contenidos Audiovisuales.

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        System.out.println("--- Sistema de Gestión de Contenidos Audiovisuales ---");

        // 1. Creación de instancias de apoyo 
        Actor actorAvatar = new Actor("Oscar Legarda", "Student");
        Temporada tempGOT = new Temporada(8, 6, "El Trono de Hierro");
        Investigador invCosmos = new Investigador("Tim Berners-Lee", "Inventor WWW", 40);

        // 2. Creación del arreglo expandido
        // Se aumenta el tamaño a 5 para incluir las nuevas subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // --- Contenidos Originales Modificados con Relaciones ---
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actorAvatar);
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8, tempGOT);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", invCosmos);

        // --- Nuevas Subclases de Iniciativa
        // Clase 1: VideoCiberseguridad
        contenidos[3] = new VideoCiberseguridad("Fundamentos de Redes Seguras", 30, "Educativo", "Básico", "YouTube");
        
        // Clase 2: CSIRT
        contenidos[4] = new CSIRT("Respuesta a Incidentes de Malware", 20, "Seguridad", "CERT-EC", "Crítica");

        // El bucle recorre todas las clases demostrando polimorfismo y herencia
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido != null) {
                contenido.mostrarDetalles();
                System.out.println("----------------------------------------------");
            }
        }
    }
}