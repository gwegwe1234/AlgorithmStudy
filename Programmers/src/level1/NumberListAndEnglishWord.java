package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/81301
public class NumberListAndEnglishWord {

  public static void main(String args[]) {
    solution("2three45sixseven");
  }

  public static int solution(String s) {

    StringBuffer resultSb = new StringBuffer();
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        list.add(s.charAt(i));

        StringBuffer tempSb = new StringBuffer();

        for (int j = 0; j < list.size(); j++) {
          tempSb.append(list.get(j));
        }

        if (tempSb.toString().equals("zero")) {
          resultSb.append('0');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("one")) {
          resultSb.append('1');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("two")) {
          resultSb.append('2');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("three")) {
          resultSb.append('3');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("four")) {
          resultSb.append('4');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("five")) {
          resultSb.append('5');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("six")) {
          resultSb.append('6');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("seven")) {
          resultSb.append('7');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("eight")) {
          resultSb.append('8');
          list = new ArrayList<>();
        } else if (tempSb.toString().equals("nine")) {
          resultSb.append('9');
          list = new ArrayList<>();
        }
      } else {
        resultSb.append(s.charAt(i));
      }


    }

    return Integer.valueOf(resultSb.toString());
  }
}
