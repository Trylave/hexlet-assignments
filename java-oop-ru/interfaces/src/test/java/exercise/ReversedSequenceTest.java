package exercise;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReversedSequenceTest {
    @Test
    void testToString() {
        ReversedSequence sequence = new ReversedSequence("abcdef");
        assertEquals("fedcba", sequence.toString());
    }

    @Test
    void testCharAt() {
        ReversedSequence sequence = new ReversedSequence("abcdef");
        assertEquals('e', sequence.charAt(1));
    }

    @Test
    void testLength() {
        ReversedSequence sequence = new ReversedSequence("abcdef");
        assertEquals(6, sequence.length());
    }

    @Test
    void testSubSequence() {
        ReversedSequence sequence = new ReversedSequence("abcdef");
        assertEquals("edc", sequence.subSequence(1, 4).toString());
    }
}
