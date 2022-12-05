package algorithms_4th;

public class Exa1_1_9 {
  public static void main(String[] args) {
    int N1 = 111;
    int N2 = 9;
    int N3 = 7;

    System.out.println(N3);
    String result = "";
    while (N3 > 0) {
      String mod = (N3 % 2 == 1) ? "1" : "0";

      result = mod + result;
      N3 = N3 >> 1;
    }
    System.out.println(result);

    System.out.println(N2);
    result = "";
    while (N2 > 0) {
      String mod = (N2 % 2 == 1) ? "1" : "0";

      result = mod + result;
      N2 = N2 >> 1;
    }
    System.out.println(result);


    System.out.println(N1);
    result = "";
    while (N1 > 0) {
      String mod = (N1 % 2 == 1) ? "1" : "0";

      result = mod + result;
      N1 = N1 >> 1;
    }
    System.out.println(result);

    /**
     * 给个赞
     */
    int N4 = 456;
    System.out.println(N4);
    result = "";
    for(int n = N4; n > 0; n /= 2) {
      result = (n % 2) + result;
    }
    System.out.println(result);
  }

}
