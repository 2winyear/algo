import java.util.*;
import java.io.*;



public class S9012 {
    public static void main(String argc[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean testPass;
        
        for (int i = 0; i < N; i++) {
            Stack <Character> stack = new Stack<Character>();
            String input = br.readLine();
            testPass = true;

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }
                else if (stack.empty()) {
                    testPass = false;
                    break ;
                } else {
                    stack.pop();
                }
            }

            
            if (stack.empty() && testPass) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}
