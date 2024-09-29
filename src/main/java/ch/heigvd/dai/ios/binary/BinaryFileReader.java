package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    //throw new UnsupportedOperationException("Please remove this exception and implement this method.");

    InputStream fis = null;
    try {
      fis = new FileInputStream(filename);
      while (fis.read() != -1) {}
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }finally {
      if(fis != null) {
        try {
          fis.close();
        }catch(IOException e){
          System.out.println("Exception in close inputstream: " + e);
        }
      }
    }
  }
}
