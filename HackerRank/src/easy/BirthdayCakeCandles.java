package easy;

public class BirthdayCakeCandles {

  // https://www.hackerrank.com/challenges/birthday-cake-candles/problem
  // Complete the birthdayCakeCandles function below.
  static int birthdayCakeCandles(int[] ar) {
    // max 값 찾고
    // max 갯수를 찾는다.
    int maxNum = ar[0];
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] > maxNum) {
        maxNum = ar[i];
      }
    }

    int result = 0;

    for (int i = 0; i < ar.length; i++) {
      if (ar[i] == maxNum) {
        result++;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    int arCount = (int)(Math.random()*10) + 1;

    int[] ar = new int[arCount];


    for (int i = 0; i < arCount; i++) {
      int arItem = (int)(Math.random()*10) + 1;
      ar[i] = arItem;
    }

    int result = birthdayCakeCandles(ar);
  }
}
