package algorithms_4th;

public class Exa1_1_1 {
  public static void main(String[] args) {
    System.out.println("(0 + 15) / 2 = " + (0+15)/2);

    //整数不用以科学计数法显示
    System.out.println(-876543211);
    System.out.println(987654321);

    //整数部分位数大于等于8时开始以科学计数法显示
    System.out.println(7654321.011);
    System.out.println(87654321.11);
    System.out.println(-123456789.0);

    //整数位为0,当小数位以0开始连续出现大于等于3时开始以科学计数法显示
    System.out.println(0.001);
    System.out.println(0.0001);
    System.out.println(-0.0001);


    System.out.println("2.0E-6 * 100000000.1 = " + 0.000002 * 100000000.1);

    String result = true && false || true && true ? "true" : "false";
    System.out.println("true && false || true && true = " + result);
  }

}
