package org.accenture.factoryMultimedia;

public class MultimediaFile {
  private String name;
  
  public MultimediaFile(String name) {
    this.name = name;
    
  }
  public void play () {
    System.out.println(name);
  }

}
