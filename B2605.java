import java.util.LinkedList;
import java.util.Scanner;

public class B2605 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int input = sc.nextInt();
        int num;

        num = sc.nextInt();
        list.add(1);
        for (int i = 2; i <= input; i++) {
            num = sc.nextInt();
            if (num == 0) {
                list.add(i);
            }
            if (num >= 1) {
                list.add(list.size() - num, i);
            }
        }

        for (int i = 0; i < input; i++) { //리스트 출력은 0번째부터! 
			System.out.print(list.get(i) + " ");
		}
    }
}

