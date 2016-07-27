package com.openknowl.tutorials;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        printLines("test.txt");
        readLines("test.dat");
    }

    public static void printLines(String fileName) {
        // Input stream
        try {
            BufferedReader stream = new BufferedReader(new FileReader(fileName));
            stream.lines().forEach((line) -> {
                System.out.println(line);
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readLines(String fileName) {
        // Ouput stream
        try {
            FileOutputStream stream = new FileOutputStream("test.dat");
            for (int i = 0; i < 11; i++) {
                String data = i + " 번쨰 줄입니다.\n";
                stream.write(data.getBytes());
            }
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
