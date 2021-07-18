package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/1845
public class Phoneketmon {

  public int solution(int[] nums) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (!list.contains(nums[i])) {
        list.add(nums[i]);
      }
    }

    if (list.size() < nums.length / 2) {
      return list.size();
    } else {
      return nums.length / 2;
    }

  }
}
