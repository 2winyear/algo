import java.util.*;

public class S11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        TreeSet<String> set = new TreeSet<String>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.substring(i, str.length()));
        }

        set.forEach((e) -> {
            System.out.println(e);
        });
    }
}
