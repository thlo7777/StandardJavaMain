import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* How to catch up an exception */
        CatchupExeception catchupExeception = new CatchupExeception();

        Readable readable = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(readable);
        while (isGameOver()) {
            String inputStr = scanner.next();
            System.out.println("display input string: " + inputStr);
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
}