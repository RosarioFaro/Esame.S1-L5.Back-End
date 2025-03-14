package mediaplayer.player;

import java.util.Scanner;

public class InputUtente {
    private Scanner scanner;
    
    public InputUtente(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public int leggiIntero(String messaggio) {
        System.out.println(messaggio);
        while (!scanner.hasNextInt()) {
            System.out.println("Input non valido. Inserisci un numero intero.");
            scanner.next();
        }
        int valore = scanner.nextInt();
        scanner.nextLine();
        return valore;
    }
    
    public int leggiNumero(String messaggio, int min, int max) {
        int valore;
        do {
            valore = leggiIntero(messaggio);
            if (valore < min || valore > max) {
                System.out.println("Valore non valido. Inserisci un numero tra " + min + " e " + max + ".");
            }
        } while (valore < min || valore > max);
        return valore;
    }
    
    public String leggiStringa(String messaggio) {
        System.out.println(messaggio);
        return scanner.nextLine();
    }
}