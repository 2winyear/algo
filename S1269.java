import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S1269 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main( String[] args ) throws Exception {
        st = new StringTokenizer(br.readLine());
        int arr1_size = Integer.parseInt(st.nextToken());
        int arr2_size = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> setA = new HashSet<>();
        for (int i = 0; i < arr1_size; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> setB = new HashSet<>();
        for (int i = 0; i < arr2_size; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setTemp = new HashSet<>();
		setTemp.addAll(setA);
		setA.removeAll(setB);
		setB.removeAll(setTemp);
		System.out.println(setA.size() + setB.size());
    }
}