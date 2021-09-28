package level1;

public class ReverseTernaryNumber {

  public static void main(String args[]) {

  }

  public int solution(int n) {

    StringBuilder sb = new StringBuilder();

    while (n != 0) {
      sb.append(n % 3);
      n = n / 3;
    }

    Long resultTenary = Long.valueOf(sb.toString());

    int index = 0;
    int answer = 0;

    while (resultTenary != 0) {
      Long lastNum = resultTenary % 10;
      answer = answer + (int) (lastNum * (int) Math.pow(3, index++));
      resultTenary = resultTenary / 10;
    }

    return answer;
  }
}
