package org.accenture.factoryMultimedia;



public class MultimediFactory implements Factory {
  
  @Override
  public MultimediaFile createMedia (String name) {
    MultimediaFile file;
    if (name.equals("MP3")) {
      file = new MP3();
    } else if  (name.equals("WAV")) {
      file = new WAV () ;
    } else {
      throw new RuntimeException("File Type" + name  + "does not exist");
    }
      return file;
    }
      
    
  

}
