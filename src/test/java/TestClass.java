import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestClass
{

  @Test
  public void testEqual ()
  {
    assertEquals(Boolean.TRUE, Boolean.FALSE);
  }

  @Test
   public void testEmpty ()
   {
     assertNull("");
   }

}
