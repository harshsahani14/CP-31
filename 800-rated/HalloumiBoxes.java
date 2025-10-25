import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HalloumiBoxes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                list.add(a);
            }

            List<Integer> copyList = new ArrayList<>(list);
            Collections.sort(copyList);

            if (copyList.equals(list) || k > 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            t--;
        }

    }
}