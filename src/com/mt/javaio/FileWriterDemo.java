package com.mt.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("data.txt");
            writer.write("welcome to java io");
            writer.flush();
            writer.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
