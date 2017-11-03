package agj.buffer;



import java.util.LinkedList;
import java.util.Queue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Buffer<T> { // generico
  private Queue<T> mainBuffer;
  private int capacity;
  int numberOperationPut = 0;
  int numberOperationGet = 0;
  private static final Logger LOGGER = LogManager.getLogger(Buffer.class) ;

  /**
   * Constructor
   * 
   * @param bufferSize
   */
  public Buffer(int bsize) {
    capacity = bsize;
    mainBuffer = new LinkedList<T>(); 

  }

  public void put(T element) {
    if (mainBuffer.size() == capacity) {
      throw new BufferException("Buffer vacio");  }

    LOGGER.info("Element inserted");

    mainBuffer.add(element);
    numberOperationPut++;
  }

  public T get() throws BufferException {
    if (mainBuffer.isEmpty()) {
      throw new BufferException("Buffer vacio");}

    T value = mainBuffer.remove();
    LOGGER.info("Element inserted");

    numberOperationGet++;
    return value;
  }

  public int getNumberOfElements() {
    return mainBuffer.size();
  }

  public int getNumberOfHoles() {
    return capacity - mainBuffer.size();
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumberOfOperations() {
    return numberOperationPut + numberOperationGet;
  }
}
