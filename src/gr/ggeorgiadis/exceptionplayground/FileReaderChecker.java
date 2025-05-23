package gr.ggeorgiadis.exceptionplayground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderChecker {
    /**
     * Reads the contents of a text file and prints them line by line.
     *
     * @param filePath the path to the file to read
     * @throws IOException if the file doesn't exist or can't be read
     */
    public static void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("=== File Contents ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * Interactive demo for reading files with exception handling.
     *
     * @param scanner shared scanner from main app
     */
    public static void runFileReaderChecker(Scanner scanner) {
        try {
            System.out.print("Enter file path to read: ");
            String path = scanner.nextLine();

            readFile(path);
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}
