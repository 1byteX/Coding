import java.util.Scanner;
import java.io.File;

public class programm {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(new File("input.csv"), "UTF-8");
        System.out.println(scanner.next());
    }
}
