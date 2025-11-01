import java.util.Scanner;

public class HowMuchDaytonaCost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();

                if (curr == k) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            t--;
        }
    }
}
