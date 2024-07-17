package coronado.yamir.appaudio.modelos;

import java.util.List;

public class Audio {
    private int duracionMinutos;
    private String titulo;
    private int totalReproducciones;
    private int totalMeGusta;
    private int clasificacion;
    private int añoLanzamiento;



    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void meGusta(){
        this.totalMeGusta++;
    }
    public void reproduce(){
        this.totalReproducciones++;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void muestrFichaTecnica(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Año lanzamiento: " + getAñoLanzamiento());
        System.out.println("Total me gusta: " + getTotalMeGusta());
        System.out.println("Total reproducciones: " + getTotalReproducciones());
    }
}
