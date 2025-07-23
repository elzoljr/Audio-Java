package br.com.elzo.meusAudios.main;
import br.com.elzo.meusAudios.modelos.MinhasPreferidas;
import br.com.elzo.meusAudios.modelos.Musica;
import br.com.elzo.meusAudios.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Estranged");
        minhaMusica.setCantor("Guns N' Roses");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


        // todo: Podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igor");

        for (int i = 0 ; i < 5000; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}