package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
   // throw new UnsupportedOperationException("Please remove this exception and implement this method.");

      try (OutputStream os = new FileOutputStream(filename);
           BufferedOutputStream bw = new BufferedOutputStream(os)) {
        for(int i = 0; i < sizeInBytes; i++) {
          bw.write('A');
        }
        bw.flush();
      } catch (IOException e) {
        System.out.println("Exception: " + e);
      }


  }
}
