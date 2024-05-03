import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testResult() {
        int a = 3;
        int b = 5;
        int c = 7;
        int actual = Main.result(a, b, c);
        int expected = 4;
        assertEquals(expected, actual);
    }
}