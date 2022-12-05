package algorithms_4th;

public class Exa1_1_3 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    String result = (a == b && b == c) ? "equal" : "not equal";
    System.out.println(a + " " + b + " " + c + " " + result);
  }

}
