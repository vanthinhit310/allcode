/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author THINH
 */
public class CutFile {
        public boolean splitFile(String source, String dest, int nuberFile) throws FileNotFoundException, IOException {
        File sourceFile = new File(source);
        if (sourceFile.exists() && sourceFile.isFile()) {
            long sizeFile = sourceFile.length();
            long sizeSplitFile = (sizeFile / nuberFile);
            InputStream is = new FileInputStream(sourceFile);
            byte[] arr = new byte[1024];
            for (int i = 1; i <= nuberFile; i++) {
                int j = 0;
                long a = 0;
                OutputStream os = new FileOutputStream(dest + sourceFile.getName() + "." + i);
                System.out.println("file cắt được " + sourceFile.getName() + "." + i);
                while ((j = is.read(arr)) != -1) {
                    os.write(arr, 0, j);
                    a += j;
                    if (a >= sizeSplitFile) {
                        break;
                    }
                }
                os.flush();
                os.close();
            }
            is.close();
            return true;
        } else {
            System.out.println("file không tồn tại");
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        CutFile sp = new CutFile();
        sp.splitFile("F:/Ftext/exam/ex1.pdf", "F:/Ftext/exam", 5);
    }
}
