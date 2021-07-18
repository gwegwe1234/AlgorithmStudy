package level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/72410
public class NewId {

  public static void main(String args[]) {
    solution("...!@BaT#*..y.abcdefghijklm");
  }

  public static String solution(String new_id) {

    List<Character> list = new LinkedList<>();
    int size = 0;

    for (int i = 0; i < new_id.length(); i++) {
      list.add(new_id.charAt(i));
    }

    // 1단계
    for (int i = 0; i < list.size(); i++) {
      if (Character.isLetter(list.get(i))) {
        list.set(i, list.get(i).toString().toLowerCase().charAt(0));
      }
    }

    // 2단계
    List<Character> arrayList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (Character.isLetterOrDigit(list.get(i)) || list.get(i) == '-' || list.get(i) == '_'
          || list.get(i) == '.') {
        arrayList.add(list.get(i));
      }
    }

    // 3단계
    List<Character> newArrayList = new ArrayList<>();
    newArrayList.add(arrayList.get(0));
    for (int i = 1; i < arrayList.size(); i++) {

      if (newArrayList.get(newArrayList.size() - 1) == '.') {
        if (arrayList.get(i) != '.') {
          newArrayList.add(arrayList.get(i));
        }
      } else {
        newArrayList.add(arrayList.get(i));
      }

    }

    // 4단계
    if (newArrayList.get(0) == '.') {
      newArrayList.remove(0);
    }

    if (!newArrayList.isEmpty()) {
      if (newArrayList.get(newArrayList.size() - 1) == '.') {
        newArrayList.remove(newArrayList.size() - 1);
      }
    }

    // 5단계
    if (newArrayList.isEmpty()) {
      newArrayList.add('a');
    }

    // 6단계
    List<Character> modifiedArrayList = new ArrayList<>();
    if (newArrayList.size() > 15) {
      for (int i = 0; i < 15; i++) {
        modifiedArrayList.add(newArrayList.get(i));
      }
    } else {
      modifiedArrayList = newArrayList;
    }

    if (modifiedArrayList.get(modifiedArrayList.size() - 1) == '.') {
      modifiedArrayList.remove(modifiedArrayList.size() - 1);
    }

    // 7단계
    size = modifiedArrayList.size();
    while (modifiedArrayList.size() < 3) {
      modifiedArrayList.add(modifiedArrayList.get(size - 1));
    }

    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < modifiedArrayList.size(); i++) {
      sb.append(modifiedArrayList.get(i));
    }

    return sb.toString();
  }
}
