package mediaplayer.media;

import lombok.AllArgsConstructor;
import mediaplayer.interfacce.Play;

public class Video extends Media implements Play {
    private int durata;
    private int volume;
    private int luminosita;
    
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }
    
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    
    public void alzaVolume() {
        volume++;
    }
    
    public void aumentaLuminosita() {
        luminosita++;
    }
    
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
    
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " *".repeat(luminosita));
        }
    }
    
    @Override
    public void esegui() {
        play();
    }
}
