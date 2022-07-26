package com.mt.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream stream=new FileInputStream("doc.txt");
            int i=stream.read();
            System.out.println((char)i);
            stream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
