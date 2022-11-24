import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelperTest {
    Helper helper = new Helper();

    @Test
    public void shouldReturnIfGreaterNumber() {
        int actual = helper.greaterNumber(10, 12);
        assertEquals(12, actual);
    }
}
