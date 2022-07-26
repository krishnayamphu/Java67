package com.mt.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try {
            int i;
            reader=new FileReader("data.txt");
            while((i=reader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
