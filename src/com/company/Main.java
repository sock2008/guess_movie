package com.company;

import java.io.File;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws Exception {

//Read whole file and count number of lines
        File file = new File("movie.txt");
        Scanner scanner = new Scanner(file);
        int numberOfLines = 0;
        while (scanner.hasNextLine()) {
            String textFile = scanner.nextLine();
            System.out.println(textFile);
            numberOfLines++;
        }
        int randomNumber = (int) (Math.random() * numberOfLines+1);
//Read random line
        String randomLine = Files.readAllLines(Paths.get("movie.txt")).get(randomNumber-1);
        System.out.println("\n" +"Movie in " + randomNumber + " line: " + randomLine);

        String[] underscores  = randomLine.split("");
        System.out.println(underscores[0]);

//Сonvert  letters to underscores "_"
        for (int i = 0; i < underscores.length; i++) {
            underscores[i] = "_";
        }
//Array to string
        StringBuilder builder = new StringBuilder();
        for(String s : underscores) {
            builder.append(s);
        }
        String str = builder.toString();
        System.out.println(str);

        System.out.println("Number of lines: " + numberOfLines);
        System.out.println("Random number: " + randomNumber);

        Game game = new Game();


    }
}
