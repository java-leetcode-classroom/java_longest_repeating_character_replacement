import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void characterReplacementExample1() {
    assertEquals(4, sol.characterReplacement("ABAB", 2));
  }
  @Test
  void characterReplacementExample2() {
    assertEquals(4, sol.characterReplacement("AABABBA", 1));
  }
}