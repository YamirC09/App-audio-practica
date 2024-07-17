package coronado.yamir.appaudio.principal;
import coronado.yamir.appaudio.calculos.Favoritos;
import coronado.yamir.appaudio.modelos.Cancion;
import coronado.yamir.appaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("Tu no vive así");
        cancion.setAñoLanzamiento(2017);
        cancion.setDuracionMinutos(4);
        cancion.setAlbum("Tu no metes cabra");
        cancion.setGenero("Trap");
        cancion.setCantante("Arcangel y Bad buny");
        for (int i = 0; i < 4000; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 6000; i++) {
            cancion.reproduce();
        }
        cancion.muestrFichaTecnica();

        System.out.println("*******************************+");

        Podcast podcast = new Podcast();
        podcast.setTitulo("Farid Dieck | Relatos y reflexiones");
        podcast.setPresentador("Farid Dieck");
        podcast.setCategoria("Reflexion");
        podcast.setMinutosPorEpisodio(20);
        podcast.setAñoLanzamiento(2023);
        for (int i = 0; i < 2000; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 7000; i++) {
            podcast.reproduce();
        }
        podcast.setEpisodios(50);
        podcast.setDescripcion("Reflexiones de la vida cotidiana");
        podcast.getDuracionMinutos();
        podcast.muestrFichaTecnica();

        Favoritos favoritos = new Favoritos();
        favoritos.adicioneFavorito(podcast);
        favoritos.adicioneFavorito(cancion);
    }
}
