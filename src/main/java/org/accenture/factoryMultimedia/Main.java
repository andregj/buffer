package org.accenture.factoryMultimedia;

public class Main {
  public static void main (String[] args) {
    Factory factory = new MultimediFactory();
    MultimediaFile mp3  = factory.createMedia("MP3");
    mp3.play();
    
    MultimediaFile wav = factory.createMedia("WAV");
        wav.play();
    
    MultimediaFile newfile = factory.createMedia("NEWFILE");
        newfile.play();
  }

}
