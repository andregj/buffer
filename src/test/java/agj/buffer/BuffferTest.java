package agj.buffer;

import java.awt.List;
import org.junit.Test;

public class BuffferTest {
  private Buffer bufferTest;
  private List element = new List();

   @Test
  public void crearBuffer(int x) {
     bufferTest = new Buffer(x);
  }
  @Test
  public void crearBufferZero() {
     bufferTest = new Buffer (0);
  }
 
}
