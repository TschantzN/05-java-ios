package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.commands.Write;
import ch.heigvd.dai.ios.Writable;


import java.io.*;


/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    //throw new UnsupportedOperationException("Please remove this exception and implement this method.");

    OutputStream fos = null;
    try {
      fos = new FileOutputStream(filename);
      for(int i = 0; i < sizeInBytes; i++) {
        fos.write('A');
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }finally {
      if(fos != null) {
        try {
          fos.close();
        }catch(IOException e){
          System.out.println("Exception in close outputstream: " + e);
        }
      }
    }
  }
}
