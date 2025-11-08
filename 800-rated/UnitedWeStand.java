import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class UnitedWeStand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int max = Arrays.stream(a).max().getAsInt();

            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] != max) {
                    b.add(a[i]);
                } else {
                    c.add(a[i]);
                }
            }

            if (b.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());

                for (int i = 0; i < b.size(); i++) {
                    System.out.print(b.get(i) + " ");
                }

                for (int i = 0; i < c.size(); i++) {
                    System.out.print(c.get(i) + " ");
                }

            }
        }

        sc.close();
    }
}
