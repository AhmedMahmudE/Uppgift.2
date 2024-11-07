package org.example;// LineCounterTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineCounterTest {

    @Test
    public void testIncrementLineCount() {
        LineCounter lineCounter = new LineCounter();
        lineCounter.incrementLineCount();
        lineCounter.incrementLineCount();
        
        assertEquals(2, lineCounter.getLineCount(), "Antalet rader ska vara 2");
    }

    @Test
    public void testAddCharacters() {
        LineCounter lineCounter = new LineCounter();
        lineCounter.addCharacters(5);
        lineCounter.addCharacters(10);
        
        assertEquals(15, lineCounter.getCharacterCount(), "Totalt antal tecken ska vara 15");
    }
}
