package level1;

// https://programmers.co.kr/learn/courses/30/lessons/42840
public class MockExam {

  public int[] solution(int[] answers) {

    int firstSum = 0;
    int secondSum = 0;
    int thirdSum = 0;

    for (int i = 0; i < answers.length; i++) {
      if ((i + 1) % 5 == 0) {
        if (answers[i] == 5) {
          firstSum += 1;
        }
      } else if ((i + 1) % 5 == 1) {
        if (answers[i] == 1) {
          firstSum += 1;
        }
      } else if ((i + 1) % 5 == 2) {
        if (answers[i] == 2) {
          firstSum += 1;
        }
      } else if ((i + 1) % 5 == 3) {
        if (answers[i] == 3) {
          firstSum += 1;
        }
      } else if ((i + 1) % 5 == 4) {
        if (answers[i] == 4) {
          firstSum += 1;
        }
      }
    }

    for (int i = 0; i < answers.length; i++) {
      if ((i + 1) % 8 == 0) {
        if (answers[i] == 5) {
          secondSum += 1;
        }
      } else if ((i + 1) % 8 == 1 || (i + 1) % 8 == 3 || (i + 1) % 8 == 5 || (i + 1) % 8 == 7) {
        if (answers[i] == 2) {
          secondSum += 1;
        }
      } else if ((i + 1) % 8 == 2) {
        if (answers[i] == 1) {
          secondSum += 1;
        }
      } else if ((i + 1) % 8 == 4) {
        if (answers[i] == 3) {
          secondSum += 1;
        }
      } else if ((i + 1) % 8 == 6) {
        if (answers[i] == 4) {
          secondSum += 1;
        }
      }
    }

    for (int i = 0; i < answers.length; i++) {
      if ((i + 1) % 10 == 0 || (i + 1) % 10 == 9) {
        if (answers[i] == 5) {
          thirdSum += 1;
        }
      } else if ((i + 1) % 10 == 1 || (i + 1) % 10 == 2) {
        if (answers[i] == 3) {
          thirdSum += 1;
        }
      } else if ((i + 1) % 10 == 3 || (i + 1) % 10 == 4) {
        if (answers[i] == 1) {
          thirdSum += 1;
        }
      }else if ((i + 1) % 10 == 5 || (i + 1) % 10 == 6) {
        if (answers[i] == 2) {
          thirdSum += 1;
        }
      }else if ((i + 1) % 10 == 7 || (i + 1) % 10 == 8) {
        if (answers[i] == 4) {
          thirdSum += 1;
        }
      }
    }

    if (firstSum > secondSum && firstSum > thirdSum) {
      return new int[]{1};
    } else if (secondSum > firstSum && secondSum > thirdSum) {
      return new int[]{2};
    } else if (thirdSum > secondSum && thirdSum > firstSum) {
      return new int[]{3};
    } else if (firstSum == secondSum && firstSum > thirdSum) {
      return new int[]{1,2};
    } else if (firstSum == thirdSum && firstSum > secondSum) {
      return new int[]{1,3};
    } else if (secondSum == thirdSum && secondSum > firstSum) {
      return new int[]{2,3};
    } else {
      return new int[]{1,2,3};
    }



  }
}
