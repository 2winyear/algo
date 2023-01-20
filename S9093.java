import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S9093 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        solution_sy();
        // solution_jh();
    }

    public static void solution_sy() throws IOException {
        Stack <Character> stack = new Stack<Character>();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String input = st.nextToken();
                for (int j = 0; j < input.length(); j++) {
                    stack.push(input.charAt(j));
                }
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void solution_jh() throws IOException {
        StringBuilder sb = new StringBuilder();
        int inputCount = Integer.parseInt(br.readLine());

        while (inputCount-- > 0) {
            String[] words = br.readLine().split(" ");
            
            for (String word: words) {
                for (int i = word.length(); i-- > 0;) {
                    sb.append(word.charAt(i));
                }
                sb.append(' ');
            }
            sb.deleteCharAt(sb.length() - 1).append('\n');
        }
        System.out.print(sb);
    }
}
