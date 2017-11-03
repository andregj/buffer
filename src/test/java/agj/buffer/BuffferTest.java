package agj.buffer;

import static org.junit.Assert.*;
import java.awt.List;
import org.junit.Test;

public class BuffferTest {
  private Buffer bufferTest;
  private Object element = new Object();

  @Test
  public void crearBuffer() {
    int capacity = 4;
    Buffer<Double> bufferTest = new Buffer<>(capacity);
    assertNotNull(bufferTest);
    assertEquals(capacity, bufferTest.getCapacity());
    assertEquals(capacity, bufferTest.getNumberOfHoles());

  }

  @Test(expected = BufferException.class)
  public void ShouldGetOneBufferException() {
    int capacity = 2;
    Buffer<String> bufferTest = new Buffer<>(capacity);
    bufferTest.get();
  }

  @Test(expected = BufferException.class)
  public void ShouldPutOnAFullBufferRaiseException() {
    int capacity = 2;
    Buffer<Double> bufferTest = new Buffer<>(capacity);
    bufferTest.put(2.3);
    bufferTest.put(3.1);
    bufferTest.put(4.2);
  }

  @Test
  public void putOneElementNoEmptyBuffer() {
    int capacity = 4;
    Buffer<Double> bufferTest = new Buffer<>(capacity);
    bufferTest.put(2.3);
    int numberOfelemennts = bufferTest.getNumberOfElements();

    assertEquals(1, numberOfelemennts);
  }

  @Test
  public void crearBufferZero() {
    bufferTest = new Buffer(0);
  }
}
