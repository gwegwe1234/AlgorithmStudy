package againbasic1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class WordReverse2 {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String sentence = br.readLine();
    Stack<Character> stack = new Stack<>();
    boolean isTag = false;

    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == '<') {
        while (!stack.isEmpty()) {
          bw.write(stack.pop());
        }
        bw.write('<');
        isTag = true;
      } else if (sentence.charAt(i) == '>') {
        isTag = false;
        bw.write('>');
      } else if (isTag) {
        bw.write(sentence.charAt(i));
      } else {
        if (sentence.charAt(i) == ' ') {
          while (!stack.isEmpty()) {
            bw.write(stack.pop());
          }
          bw.write(' ');
        } else {
          stack.push(sentence.charAt(i));
        }
      }
    }

    while (!stack.isEmpty()) {
      bw.write(stack.pop());
    }

    bw.flush();
    bw.close();
  }
}
