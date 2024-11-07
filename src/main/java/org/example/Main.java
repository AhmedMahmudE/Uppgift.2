package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        LineCounter lineCounter = new LineCounter();
        TextReader textReader = new TextReader(lineCounter);
        textReader.startReading();
    }
}
