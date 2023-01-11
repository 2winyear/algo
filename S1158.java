import java.io.*;
import java.util.*;

public class S1158 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<Integer>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        System.out.print("<");
        while (que.size() != 0) {
            for (int i = 1; i < K; i++) {
                que.add(que.poll());
            }
            System.out.print(que.poll());
            if (!que.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
