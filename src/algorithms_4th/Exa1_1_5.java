package algorithms_4th;

import java.math.BigDecimal;

/**
 * 浮点数精度
 * 精度是由尾数决定的，为什么？由浮点数的值计算公式可知：当指数的最终值为负，虽然这个时候浮点数的值能表示更小，
 * 但这个时候仅仅能表示0~1（或-1~0）这个数段的小数，没有实际意义。所以精度主要是看尾数的值。
 *
 * float
 * float的尾数：23位，其范围为：0~2^23，而2^23 = 8388608 = 10^6.92 ，所以float的精度为6~7位，
 * 能保证6位为绝对精确，7位一般也是正确的，8位就不一定了（但不是说8位就绝对不对了），注意这里的6~7位是
 * 有效小数位（大的数你先需要转换成小数的指数形式，例如：8317637.5，其有效小数位：8.3176375E6，七位），
 * 而有效位（从第一个不为0的开始数）是7~8位，是包括整数位的，像8317637.5，你不转换，则要从有效位的角度来看，有8位有效位。
 *
 * double
 * 计算方式同float，double的尾数：52位，2^−52 =2.220446049250313E-16，最小是16位，但最小不是1.0E-16，
 * 所以精度是15~16，能保证15，一般16位。
 *
 */

public class Exa1_1_5 {
  public static void main(String[] args) {

    Double var1 = 0.000000000000000000000000000000000000000000000000000000001;
    Double var2 = 1.0000000000000001; //double 精度保证15位
    String result = var1 > 0 ? "true" : "false";
    System.out.println("var1 = " + var1);
    System.out.println("compare 0 : " + result);

    /* 精度不够，需要用相对精度计算 */
    BigDecimal data2 = new BigDecimal(var2);
    BigDecimal data3 = new BigDecimal(1);
    int com = data2.compareTo(data3);
    result =  com > 0 ? "true" : "false";
    System.out.println(var2 - 1);
    System.out.println("compare 1 : " + result);

    result = Double.doubleToLongBits(var2) > Double.doubleToLongBits(1) ? "true" : "false";

    System.out.println("compare double: " + result);


  }

}
