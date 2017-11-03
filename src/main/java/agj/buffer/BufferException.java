package agj.buffer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**Excepcion por buffer vacio
 * 
 */

public class BufferException extends RuntimeException {
  private static final Logger LOGGER = LogManager.getLogger(BufferException.class) ;
  
    public BufferException (String message){
    super(message);
   LOGGER.fatal(message);
  }
  
  
}
  
  
  


