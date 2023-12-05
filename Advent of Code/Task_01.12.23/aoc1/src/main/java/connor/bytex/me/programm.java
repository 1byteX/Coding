import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programm {

    public static void main(String[] args) {
        Scanner scanner;
        String line = "";
        String zwischenErgebnis;
        int endErgebnis = 0;
        int firstInt, secondInt, stringLength;
        try {
            scanner = new Scanner(new File("input.csv"), "UTF-8");
            while (scanner.hasNext()) {
                firstInt = -1;
                secondInt = -1;

                line = scanner.nextLine();
                stringLength = line.length();
                for (int i = 0; i < stringLength; i++) {
                    char aktuellesZeichen = line.charAt(i);
                    if (Character.isDigit(aktuellesZeichen)) {
                        if (firstInt == -1) {
                            firstInt = Character.getNumericValue(aktuellesZeichen);
                        } else {
                            secondInt = Character.getNumericValue(aktuellesZeichen);
                        }
                    }
                }
                if (secondInt == -1) {
                    zwischenErgebnis = firstInt + "" + firstInt;
                } else {
                    zwischenErgebnis = firstInt + "" + secondInt;
                }
                endErgebnis += Integer.parseInt(zwischenErgebnis);
            }
            System.out.println(endErgebnis);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}