package level1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42576
public class NonFinishedMarathonUser {

  public static void main(String args[]) {
    System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
  }

  public static String solution(String[] participant, String[] completion) {
    // 시간초과 에러
//    String answer = "";
//
//    for (int i = 0; i < participant.length; i++) {
//      for (int j = 0; j < completion.length; j++) {
//        if (participant[i].equals(completion[j])) {
//          participant[i] = null;
//          completion[j] = null;
//          break;
//        }
//      }
//    }
//
//    for (int i = 0; i < participant.length; i++) {
//      if (participant[i] != null) {
//        answer = participant[i];
//      }
//    }
//
//    return answer;

    Arrays.sort(participant);
    Arrays.sort(completion);

    for (int i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }
    return participant[participant.length - 1];
  }
}
