package mediaplayer.media;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Media {
    protected String titolo;
    
    public abstract void esegui();
}
