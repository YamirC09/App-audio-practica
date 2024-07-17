package coronado.yamir.appaudio.calculos;

import coronado.yamir.appaudio.modelos.Audio;

public class Favoritos extends Audio {
    public void adicioneFavorito(Audio audio){
        if (audio.getClasificacion() == 1){
            System.out.println(audio.getTitulo() + " es favorito");
        }else if (audio.getClasificacion()== 0) {
            System.out.println(audio.getTitulo() + " no es favorito");
        }
    }
}
