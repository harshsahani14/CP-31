import java.util.Scanner;

public class LineTrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] positions = new int[n + 2];

            positions[0] = 0;

            for (int i = 1; i < n + 1; i++) {
                positions[i] = sc.nextInt();
            }

            positions[n + 1] = x + (x - positions[n]);

            int result = 0;

            for (int i = 0; i < n + 1; i++) {
                result = Math.max(result, Math.abs(positions[i + 1] - positions[i]));
            }

            System.out.println(result);

            t--;
        }
    }
}
