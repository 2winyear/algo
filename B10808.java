import java.io.IOException;
import java.util.Scanner;



public class B10808 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char[] input = sc.nextLine().toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < input.length; i++) {
            count[(int) input[i] - 97] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            sb.append(count[i] + " ");
        }
        System.out.print(sb);
    }
}
