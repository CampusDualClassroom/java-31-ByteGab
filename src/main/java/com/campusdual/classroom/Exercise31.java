package com.campusdual.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exercise31 {
    public static void main(String[] args) {
        String file = "src/main/resources/lorem.txt";

        try {
            List<String> linesFile = Files.readAllLines(Paths.get(file));
            for (String line : linesFile) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("Error en el fichero" + exception.getMessage());
        }
    }
}
