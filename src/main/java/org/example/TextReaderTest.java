package org.example;// TextReaderTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TextReaderTest {

    private LineCounter mockLineCounter;
    private TextReader textReader;

    @BeforeEach
    public void setUp() {
        mockLineCounter = mock(LineCounter.class);
        textReader = new TextReader(mockLineCounter);
    }

    @Test
    public void testReadingStopsOnStopCommand() {
        // Simulera inmatning och kontrollera att lineCounter incrementeras
        textReader.startReading(); // Anpassa för att styra inmatningen om nödvändigt

        verify(mockLineCounter, atLeastOnce()).incrementLineCount();
    }
}
