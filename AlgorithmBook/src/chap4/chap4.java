package chap4;

import java.util.ArrayList;
import java.util.List;

public class chap4 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      list.add(i%3);
    }

    int N = list.size();
    int majority = -1, majorityCount=0;
    for (int i = 0; i < N; i++) {
      // list에 등장하는 list[i]의 수를 센다.
      int V = list.get(i);
      int count = 0;
      for (int j = 0; j < N; j++) {
        if(list.get(j) == V) {
          count++;
        }
      }

      // 지금까지 본 최대 빈도보다 많이 출현했다면 답을 갱신
      if(count > majorityCount) {
        majorityCount = count;
        majority = V;
      }
    }

    System.out.println(majority);

  }
}
