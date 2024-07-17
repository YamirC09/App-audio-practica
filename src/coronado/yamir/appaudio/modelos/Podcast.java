package coronado.yamir.appaudio.modelos;

public class Podcast extends Audio{
    private String descripcion;
    private String presentador;
    private String categoria;
    private int episodios;
    private int minutosPorEpisodio;

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() > 3000){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int getDuracionMinutos() {
        return getEpisodios() * getMinutosPorEpisodio();
    }
    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void muestrFichaTecnica() {
        super.muestrFichaTecnica();
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Presentador: " + getPresentador());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Duracion total en minutos: " + getDuracionMinutos());
    }
}