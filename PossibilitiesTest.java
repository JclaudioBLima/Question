
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("possibilities")
public class PossibilitiesTest {
    @Nested
    @DisplayName("sample test cases")
    class SampleTestCases {

        @Test
        @DisplayName("works on a single signal")
        public void worksOnASingleSignal() {
            assertEquals(new ArrayList<String>(Arrays.asList("E")), Challenge.possibilities("."));
            assertEquals(new ArrayList<String>(Arrays.asList("A")), Challenge.possibilities(".-"));
        }

        @Test
        @DisplayName("works on a word with a single unknown signal")
        public void worksOnAWordWithASingleUnknownSignal() {
            assertEquals(new ArrayList<String>(Arrays.asList("E", "T")), Challenge.possibilities("?"));
            assertEquals(new ArrayList<String>(Arrays.asList("I", "N")), Challenge.possibilities("?.")); 
            assertEquals(new ArrayList<String>(Arrays.asList("I", "A")), Challenge.possibilities(".?"));
        }
    }
}
    