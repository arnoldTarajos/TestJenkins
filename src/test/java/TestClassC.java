import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestClassC {
    @Test
      public void testEqual ()
      {
        assertEquals(Boolean.TRUE, Boolean.TRUE);
      }

      @Test
       public void testEmpty ()
       {
         assertNull(null);
       }

}
