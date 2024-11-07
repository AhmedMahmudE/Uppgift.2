package org.example;// TextReader.java
import java.util.Scanner;

public class TextReader {
    private LineCounter lineCounter;

    public TextReader(LineCounter lineCounter) {
        this.lineCounter = lineCounter;
    }

    public void startReading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in text (skriv 'stop' för att avsluta):");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            lineCounter.incrementLineCount();
            lineCounter.addCharacters(line.length());
            System.out.println("Du skrev: " + line);
        }

        scanner.close();
        System.out.println("Antal rader: " + lineCounter.getLineCount());
        System.out.println("Totalt antal tecken: " + lineCounter.getCharacterCount());
    }
}
