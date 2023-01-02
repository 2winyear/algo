import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1302 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main (String argv[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()); 
            String name = st.nextToken();
            if (map.get(name) == null) {
                map.put(name, 1);
            } else {
                map.put(name, map.get(name) + 1);
            }
        }

        int max = 0;
        for (Object val: map.values().toArray()) {
            int value = ((int)val);
            max = Math.max(value, max);
        }

        final int maxval = max;
        map.forEach((key, val) -> {
            if (val == maxval) {
                System.out.println(key);
                System.exit(0);
            }
        });
    }
}
