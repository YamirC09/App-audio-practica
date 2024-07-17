package coronado.yamir.appaudio.modelos;

import java.security.KeyStore;

public class Cancion extends Audio{
    private String letra;
    private String album;
    private String genero;
    private String cantante;

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() > 5000){
            return 1;
        }else{
            return 0;
        }
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void muestrFichaTecnica() {
        super.muestrFichaTecnica();
        System.out.println("Genero: " + getGenero());
        System.out.println("Album: " + getAlbum());
        System.out.println("Duracion minutos: " + getDuracionMinutos());
        System.out.println("Cantante(s): " + getCantante());
    }
}
