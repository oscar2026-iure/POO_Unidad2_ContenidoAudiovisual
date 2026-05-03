package uni1a;

/**
 * Clase que representa una temporada de una serie de TV.
 * Se relaciona con SerieDeTV mediante composición o agregación.
 */
public class Temporada {
    private int numero;
    private int episodios;
    private String tituloTemporada;

    public Temporada(int numero, int episodios, String tituloTemporada) {
        this.numero = numero;
        this.episodios = episodios;
        this.tituloTemporada = tituloTemporada;
    }

    // Getters para poder mostrar la información
    public int getNumero() { return numero; }
    public int getEpisodios() { return episodios; }
    public String getTituloTemporada() { return tituloTemporada; }

    @Override
    public String toString() {
        return "Temporada " + numero + ": " + tituloTemporada + " (" + episodios + " episodios)";
    }
}