import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int input = sc.nextInt();
        int num;
        for (int i = 0; i < input; i++) {
            num = rand.nextInt(i);
            if (num <= i) {
                list.add(0, num);
            }
            else {
                list.add(i, num);
            }
        }
        System.out.println(list);
    }
}
