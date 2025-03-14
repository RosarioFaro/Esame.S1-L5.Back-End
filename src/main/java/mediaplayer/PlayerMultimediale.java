package mediaplayer;

import java.util.Scanner;

import mediaplayer.media.Audio;
import mediaplayer.media.Immagine;
import mediaplayer.media.Media;
import mediaplayer.media.Video;
import mediaplayer.player.InputUtente;
import mediaplayer.player.MenuUtente;

public class PlayerMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputUtente inputUtente = new InputUtente(scanner);
        MenuUtente menuUtente = new MenuUtente(inputUtente);
        
        Media[] elementi = new Media[5];
        
        for (int i = 0; i < elementi.length; i++) {
            int tipo = inputUtente.leggiNumero(
                    "Inserisci il tipo di elemento (1 = Audio, 2 = Video, 3 = Immagine):", 1, 3);
            String titolo = inputUtente.leggiStringa("Inserisci il titolo:");
            
            switch (tipo) {
                case 1:
                    int durataAudio = inputUtente.leggiIntero("Inserisci la durata:");
                    int volumeAudio = inputUtente.leggiIntero("Inserisci il volume:");
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 2:
                    int durataVideo = inputUtente.leggiIntero("Inserisci la durata:");
                    int volumeVideo = inputUtente.leggiIntero("Inserisci il volume:");
                    int luminositaVideo = inputUtente.leggiIntero("Inserisci la luminosità:");
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    int luminositaImmagine = inputUtente.leggiIntero("Inserisci la luminosità:");
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;
            }
        }
        
        int scelta;
        do {
            scelta = inputUtente.leggiNumero("Quale elemento vuoi eseguire? (1-5, 0 per uscire)", 0, 5);
            if (scelta >= 1 && scelta <= 5) {
                Media elemento = elementi[scelta - 1];
                elemento.esegui();
                menuUtente.gestisciMenuInterattivo(elemento);
            }
        } while (scelta != 0);
    }
}