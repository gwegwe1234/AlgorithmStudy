public class MiniMaxSum {

  // https://www.hackerrank.com/challenges/mini-max-sum/problem
  // Complete the miniMaxSum function below.
  static void miniMaxSum(int[] arr) {

    long maxNum = arr[0];
    long minNum = arr[0];
    long totalSum = 0;

    for (int i= 0; i < arr.length; i++) {
      if (minNum > arr[i]) {
        minNum = arr[i];
      }

      if (maxNum < arr[i]) {
        maxNum = arr[i];
      }

      totalSum += arr[i];
    }

    System.out.print(totalSum-maxNum);
    System.out.print(" ");
    System.out.print(totalSum-minNum);
  }

  public static void main(String[] args) {
    int[] arr = new int[5];

    arr[0] = 1000000000;
    arr[1] = 1000000000;
    arr[2] = 1000000000;
    arr[3] = 1000000000;
    arr[4] = 1000000000;

    miniMaxSum(arr);
  }
}
