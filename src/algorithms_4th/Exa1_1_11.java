package algorithms_4th;

import java.util.Random;

public class Exa1_1_11 {
  public static void main(String[] args) {

    Random r1 = new Random();
    boolean[][] arrBool = new boolean[5][3];
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 3; j++) {
        arrBool[i][j] = r1.nextBoolean();
      }
    }

    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.println("row: " + i + " col: " + j + " value: " + (arrBool[i][j] ? "*" : "_"));
      }
    }
  }

}
