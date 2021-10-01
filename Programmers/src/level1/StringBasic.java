package level1;

import java.util.regex.Pattern;

// https://programmers.co.kr/learn/courses/30/lessons/12918
public class StringBasic {

  public boolean solution(String s) {

    return (s.length() == 4 || s.length() == 6) && Pattern.compile("-?\\d+(\\.\\d+)?").matcher(s).matches();
  }
}
