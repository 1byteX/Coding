package connor.bytex.me;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class programm {
    public static Scanner scanner;
    public static void main(String[] args) {
        try {
            scanner = new Scanner(new File("input.csv"), "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        }
        System.out.println(scanner.next());
    }
}
