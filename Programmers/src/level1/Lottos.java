package level1;

// https://programmers.co.kr/learn/courses/30/lessons/77484
public class Lottos {

  public int[] solution(int[] lottos, int[] win_nums) {
    int cnt = 0;
    int zeroNum = 0;

    for (int win_num : win_nums) {
      for (int i = 0; i < lottos.length; i++) {
        if (lottos[i] == win_num) {
          cnt++;
          break;
        }
      }
    }

    for (int i = 0; i < lottos.length; i++) {
      if (lottos[i] == 0) {
        zeroNum++;
      }
    }

    int minimum = 0;
    int maximum = 0;

    if (cnt + zeroNum <= 1) {
      minimum = 6;
      maximum = 6;
    } else {
      if (cnt == 0 || cnt == 1) {
        minimum = 6;
        maximum = 7 - (cnt + zeroNum);
      } else {
        minimum = 7 - cnt;
        maximum = 7 - (cnt + zeroNum);
      }
    }

    int[] answer = {maximum, minimum};

    return answer;
  }
}
