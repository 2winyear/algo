import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G17298 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack <Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int[] result = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        for(int i = 0; i<N; i++) {
            if (result[i] == 0) {
                result[i] = -1;
            }
            sb.append(result[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}
