import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class TesBClass {

    @Test
    public void testNotEqual() {
        assertNotEquals(Boolean.TRUE, Boolean.TRUE);
    }

    @Test
    public void testEmpty() {
        assertNotNull(null);
    }
}