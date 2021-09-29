package againbasic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenDwarves {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    List<Integer> dwarvesHeight = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < 9; i++) {
      int height = sc.nextInt();
      dwarvesHeight.add(height);
      sum += height;
    }

    List<Integer> resultList = new ArrayList<>();

    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 9; j++) {
        if (sum - dwarvesHeight.get(i) - dwarvesHeight.get(j) == 100) {
          for (int k = 0; k < 9; k++) {
            if (k != i && k != j) {
              resultList.add(dwarvesHeight.get(k));
            }
          }
          break;
        }
      }
      if (resultList.size() != 0) {
        break;
      }
    }

    Collections.sort(resultList);

    for (int i = 0; i < resultList.size(); i++) {
      System.out.println(resultList.get(i));
    }

    sc.close();
  }
}
