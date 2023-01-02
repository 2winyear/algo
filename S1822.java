import java.io.*;
import java.util.*;

public class S1822 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int input;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeSet<Integer> setA = new TreeSet<Integer>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            input = Integer.parseInt(st.nextToken());
            if (setA.contains(input)) {
                setA.remove(input);
            }
        }

        System.out.println(setA.size());
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
