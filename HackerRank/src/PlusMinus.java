public class PlusMinus {

  // 문제 : https://www.hackerrank.com/challenges/plus-minus/problem
  static void plusMinus(int[] arr) {
    int positiveCnt = 0;
    int zeroCnt = 0;
    int negativeCnt = 0;

    for (int i =0; i < arr.length; i++) {
      if (arr[i] > 0) {
        positiveCnt++;
      } else if (arr[i] == 0) {
        zeroCnt++;
      } else {
        negativeCnt++;
      }
    }

    System.out.println(String.format("%.6f", (double)positiveCnt/arr.length));
    System.out.println(String.format("%.6f", (double)negativeCnt/arr.length));
    System.out.println(String.format("%.6f", (double)zeroCnt/arr.length));
  }

  public static void main(String[] args) {

    int[] arr = new int[5];

    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 0;
    arr[3] = -1;
    arr[4] = -1;

    plusMinus(arr);
  }
}
