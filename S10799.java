import java.util.Scanner;
import java.util.Stack;

public class S10799 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == ')') {
                int pop = stack.pop();
                
                if (pop == i) {
                    result += stack.size();
                } else {
                    result++;
                }
            } else {
                stack.push(i + 1);
            }
        }
        System.out.println(result);
    }
}
