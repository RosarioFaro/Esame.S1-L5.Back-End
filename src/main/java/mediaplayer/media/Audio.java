
package mediaplayer.media;

import mediaplayer.interfacce.Play;

public class Audio extends Media implements Play {
    private int durata;
    private int volume;
    
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    
    public void alzaVolume() {
        volume++;
    }
    
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
    
    @Override
    public void esegui() {
        play();
    }
}