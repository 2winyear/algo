import java.util.*;
import java.io.*;

public class S2075 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                priorityQueue.add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 1; i < N; i++) {
            priorityQueue.poll();
        }
        System.out.println(priorityQueue.poll());
    }
}
