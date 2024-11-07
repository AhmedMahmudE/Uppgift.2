package org.example;

// LineCounter.java
public class LineCounter {
    private int lineCount = 0;
    private int characterCount = 0;

    public void incrementLineCount() {
        lineCount++;
    }

    public void addCharacters(int count) {
        characterCount += count;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
