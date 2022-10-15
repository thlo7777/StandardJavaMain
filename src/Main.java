import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    enum inputType {KeyNumber, KeyString, QuitGame, inValid}
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* How to catch up an exception */
        CatchupExeception catchupExeception = new CatchupExeception();

        Readable readable = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(readable);
        while (isGameOver()) {
            String inputStr = scanner.next();
            System.out.println("display input string: " + inputStr);
            if (checkInputKey(inputStr) == inputType.KeyNumber) {
                System.out.println("continue");
                int number = Integer.valueOf(inputStr);
                if (number >= 0) {
                    System.out.println("Positive number: " + Integer.valueOf(inputStr));
                } else {
                    System.out.println("Negtive number: " + Integer.valueOf(inputStr));
                }
                continue;
            }
            try {
                catchupExeception.throwExeception();
            } catch (IllegalStateException e) {
                System.out.println("catch a IllegalStateException");
                //e.printStackTrace();
            } /*finally {
                System.out.println("awlays execution these code");
            } */

        }
    }

    public static boolean isGameOver() {
        System.out.println("check game if it is over");
        return true;
    }

    public static inputType checkInputKey(String str) {
        if (str.equals("q") || str.equals("Q")) {
            return inputType.QuitGame; //quit
        }
        //Boolean strResult = str.matches("^[-+]?[0-9]+.?[0-9]*$"); //positive negtive number or +-float
        //Boolean strResult = str.matches("^[0-9]*[1-9][0-9]*$"); //positive number
        Boolean strResult = str.matches("^+?[1-9][0-9]*$"); //only non zero positive number

        if (strResult) {
            return inputType.KeyNumber; //only non zero positive number
        } else {
            if (str.equals('q') || str.equals('Q')) {
                return inputType.KeyString; //string
            }
        }
        return inputType.inValid;
    }
}