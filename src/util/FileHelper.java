package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FileHelper {

    public static void slurp (String filePath, String fileName) throws IOException {
        try{
            List<String> fileContents = Files.readAllLines(Paths.get(filePath,fileName));
            for (int i = 0; i < fileContents.size(); ++i) {
                System.out.printf("%s \n",  fileContents.get(i));
            }
        }catch (RuntimeException RuntimeException){
            System.err.println("Exception " + RuntimeException);
        }
    }

    public void spit(String filename, List<String> contents, boolean append) throws IOException {
        try{
            if(append){
                if(!Files.exists(Paths.get(filename))){
                    Files.createFile(Paths.get(filename));
                    Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
                } else if(Files.exists(Paths.get(filename))){
                    Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
                }
            }
        }catch (RuntimeException RuntimeException){
            System.err.println("Exception " + RuntimeException);
        }
    }

    public void makeExciting(String filename) throws IOException {
        try{
            if(!Files.exists(Paths.get(filename))){
                System.out.println("File does not exist.");
            } else if(Files.exists(Paths.get(filename))){
                List<String> fileContents = Files.readAllLines(Paths.get(filename));
                for (int i = 0; i < fileContents.size(); ++i) {
                    System.out.printf("%s!\n",  fileContents.get(i).toUpperCase());
                }
            }
        }catch (RuntimeException RuntimeException){
            System.err.println("Exception " + RuntimeException);
        }
    }
    public void copy(String originalFile, String copyName) throws IOException {
        try{
            Files.copy(Paths.get(originalFile), Paths.get(copyName));
        } catch(RuntimeException runtimeException){
            System.err.println("Exception " + runtimeException);
        }

    }
    public void move(String oldPath, String newPath) throws IOException {
        try{
            Files.move(Paths.get(oldPath), Paths.get(newPath));
        } catch(RuntimeException runtimeException){
            System.err.println("Exception " + runtimeException);
        }
    }

    public void findString (String fileName, String wordToFind) throws FileNotFoundException {
        // Declare File object
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        // iterate through the file line by line
        while(scan.hasNextLine()){
            // scan for names on the content of the file
            String str = scan.findInLine(String.valueOf(wordToFind ));
            if(str != null){
                // print the string content that satisfies the pattern
                // specified on the method argument
                System.out.println(str);
            }
            // advance to the next line
            scan.nextLine();
        }
        // close the scanner object;
        scan.close();
    }
}
