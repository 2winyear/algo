import java.util.ArrayList;
import java.util.Scanner;

public class B9933 {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            String reverse = new StringBuffer(s).reverse().toString();
            if (list.contains(reverse) || s.equals(reverse)) {
                System.out.println(s.length() + " " + s.charAt(s.length()/2));
                return;
            } else {
                list.add(s);
            }
        }
    }
}