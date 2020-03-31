package easy;

public class AngryProfessor {

  // https://www.hackerrank.com/challenges/angry-professor/problem
  // Complete the angryProfessor function below.
  static String angryProfessor(int k, int[] a) {

    int onTimeStudentCount = 0;
    String result = "YES";
    for (int i = 0; i < a.length; i++) {
      if (a[i] <= 0) {
        onTimeStudentCount++;
      }
    }

    if (onTimeStudentCount >= k) {
      result = "NO";
    }

    return result;
  }

  public static void main(String[] args) {

    int[] arr = {-1, -3, -4, 5};
    String result = angryProfessor(3, arr);

    System.out.println(result);
  }
}
