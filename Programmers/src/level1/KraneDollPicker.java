package level1;

import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/64061
public class KraneDollPicker {

  public static void main(String args[]) {
    solution();
  }

  public static int solution() {

    int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}};
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    int result = 0;
    for (int i = 0; i < moves.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][moves[i] - 1] != 0) {
          if (stack.peek() != board[j][moves[i] - 1]) {
            stack.push(board[j][moves[i] - 1]);
          } else {
            result += 2;
            stack.pop();
          }

          board[j][moves[i] - 1] = 0;
          break;
        }
      }
    }
    return result;
  }

}
