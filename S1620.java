import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S1620 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> pocketmonMap = new HashMap<String, String>();
        String[] names = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String inputName = br.readLine();
            pocketmonMap.put(inputName, Integer.toString(i));
            names[i] = inputName;
        }
        String[] ans = new String[M];
        for (int i = 0; i < M; i++) {
            ans[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            String input = ans[i];
            if (pocketmonMap.get(input) != null) { //key값 들어왔을때
                System.out.println(pocketmonMap.get(input)); //value
            } else {
                System.out.println(names[Integer.parseInt(input)]);
            }
        }
    }
}

