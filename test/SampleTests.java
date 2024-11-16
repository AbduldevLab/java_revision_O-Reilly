import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SampleTests {

    @Test
    public void testSomething() {
        int a = 4;
        int b = 8;

        int total = a + b;

        Assertions.assertEquals(12, total);
    }
}
