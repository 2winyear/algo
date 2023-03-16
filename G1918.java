import java.util.Scanner;
import java.util.Stack;

public class G1918 {
    static int priority(char temp) {
        if (temp == '+' || temp == '-') return 1;
        else if (temp == '(') return 0;
        else return 2;
    }
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        Stack <Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '+' || input[i] == '-' || input[i] == '*' || input[i] == '/') {
                while (!stack.isEmpty() && (priority(stack.peek()) >= priority(input[i]))) {
                    sb.append(stack.pop());
                }
                stack.push(input[i]);
            } else if (input[i] == '(') {
                stack.push(input[i]);
            } else if (input[i] == ')') {
                while (!stack.isEmpty()) {
                    char temp = stack.pop();
                    if (temp == '(') {
                        break ;
                    }
                    sb.append(temp);
                }
            } else {
                sb.append(input[i]);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
