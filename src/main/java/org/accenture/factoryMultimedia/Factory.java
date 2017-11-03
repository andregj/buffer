package org.accenture.factoryMultimedia;

import org.accenture.factoryMultimedia.MultimediaFile;

public interface Factory {
  public MultimediaFile createMedia (String name);

}
