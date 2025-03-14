package mediaplayer.player;

import mediaplayer.media.Audio;
import mediaplayer.media.Immagine;
import mediaplayer.media.Media;
import mediaplayer.media.Video;

public class MenuUtente {
    private InputUtente inputUtente;
    
    public MenuUtente(InputUtente inputUtente) {
        this.inputUtente = inputUtente;
    }
    
    public void gestisciMenuInterattivo(Media elemento) {
        boolean inEsecuzione = true;
        while (inEsecuzione) {
            System.out.println("Cosa vuoi fare?");
            if (elemento instanceof Audio) {
                System.out.println("1: Alza volume");
                System.out.println("2: Abbassa volume");
            } else if (elemento instanceof Video) {
                System.out.println("1: Alza volume");
                System.out.println("2: Abbassa volume");
                System.out.println("3: Aumenta luminosità");
                System.out.println("4: Diminuisci luminosità");
            } else if (elemento instanceof Immagine) {
                System.out.println("3: Aumenta luminosità");
                System.out.println("4: Diminuisci luminosità");
            }
            System.out.println("0: Torna al menu principale");
            
            int azione = inputUtente.leggiIntero("Scegli un'opzione:");
            switch (azione) {
                case 1:
                    if (elemento instanceof Audio) {
                        ((Audio) elemento).alzaVolume();
                    } else if (elemento instanceof Video) {
                        ((Video) elemento).alzaVolume();
                    } else {
                        System.out.println("Opzione non valida per questo elemento.");
                    }
                    break;
                case 2:
                    if (elemento instanceof Audio) {
                        ((Audio) elemento).abbassaVolume();
                    } else if (elemento instanceof Video) {
                        ((Video) elemento).abbassaVolume();
                    } else {
                        System.out.println("Opzione non valida per questo elemento.");
                    }
                    break;
                case 3:
                    if (elemento instanceof Video) {
                        ((Video) elemento).aumentaLuminosita();
                    } else if (elemento instanceof Immagine) {
                        ((Immagine) elemento).aumentaLuminosita();
                    } else {
                        System.out.println("Opzione non valida per questo elemento.");
                    }
                    break;
                case 4:
                    if (elemento instanceof Video) {
                        ((Video) elemento).diminuisciLuminosita();
                    } else if (elemento instanceof Immagine) {
                        ((Immagine) elemento).diminuisciLuminosita();
                    } else {
                        System.out.println("Opzione non valida per questo elemento.");
                    }
                    break;
                case 0:
                    inEsecuzione = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
            
            if (inEsecuzione) {
                elemento.esegui();
            }
        }
    }
}
