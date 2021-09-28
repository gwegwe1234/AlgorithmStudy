package level1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12982
public class Budget {

  public int solution(int[] d, int budget) {
    int answer = 0;

    Arrays.sort(d);

    for (int i = 0; i < d.length; i++) {
      if (d[i] > budget) {
        break;
      }

      budget = budget - d[i];
      answer++;

    }

    return answer;
  }

}
