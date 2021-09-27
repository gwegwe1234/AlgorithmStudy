package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit {

  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;

    List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
    List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());

    for (int i = 0; i < lostList.size(); i++) {
      if (reserveList.contains(lostList.get(i))) {
        reserveList.remove(new Integer(lostList.get(i)));
        lostList.set(i, -1);
        answer++;
      }
    }

    for (int lostOne : lostList) {
      if (reserveList.contains(lostOne - 1)) {
        reserveList.remove(new Integer(lostOne - 1));
        answer++;
      } else if (reserveList.contains(lostOne + 1)) {
        reserveList.remove(new Integer(lostOne + 1));
        answer++;
      }
    }

    return answer;
  }
}
