import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class S1544 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> datas = new HashSet<String>();
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (!datas.contains(input)) {
                for (int j = 0; j < input.length(); j++) {
                    datas.add(input.substring(j) + input.substring(0, j));
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
