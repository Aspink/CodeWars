import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class SolutionTest {
    @ParameterizedTest(name = "Quadrant {0}: ({1}, {2})")
    @CsvSource(textBlock = """
        1,       5,   15
        2,       -3,   15
        2,     -1, 12
        3,      -9,  -1
        3,      -15,   -12
        4,      20, -21
        4,      11, -43
    """)
    @DisplayName("Sample tests") void sampleTests(int expected, int x, int y) {
        assertEquals(expected, Kata.quadrant(x, y));
    }
}
