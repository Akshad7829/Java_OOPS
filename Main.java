package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "E:\\Java Project\\demo\\practice_for_file\\src\\main\\java\\org\\example\\sir.txt"; // Replace with the actual file path

        List<String> trimmedWordsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Trim spaces between words and split by spaces
                String[] words = line.trim().replaceAll("-"," ").split("\\s+");

                // Add each trimmed word to the list
                for (String word : words) {
                    trimmedWordsList.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print or process the list as needed
            System.out.println(trimmedWordsList);

    }
}