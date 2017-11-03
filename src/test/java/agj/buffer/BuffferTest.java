package agj.buffer;

import java.awt.List;
import org.junit.Test;

public class BuffferTest {
  private Buffer bufferTest;
  private List element = new List();

   @Test
  public void crearBuffer() {
     int tamArray = 4;
     bufferTest = new Buffer(tamArray);
  }
  @Test
  public void crearBufferZero() {
     bufferTest = new Buffer (0);
  }
  @Test
  public void putNewElement() {
     bufferTest = new Buffer (0);
  }
}
