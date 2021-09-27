package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/86051
public class SumWithoutNumbers {

  public static void main(String args[]) {

  }

  public int solution(int[] numbers) {

    List<Integer> list = new ArrayList<>();
    int sum = 0;

    boolean flag = true;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < numbers.length; j++) {
        flag = true;
        if (numbers[j] == i) {
          flag = false;
          break;
        }
      }

      if (flag) {
        list.add(i);
      }
    }

    for (Integer n : list) {
      sum += n;
    }

    return sum;
  }
}
