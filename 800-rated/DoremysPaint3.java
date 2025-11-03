import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// retry
public class DoremysPaint3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            Map<Long, Long> map = new HashMap<>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                long curr = sc.nextLong();
                map.put(curr, map.getOrDefault(curr, 0L) + 1);
            }

            if (map.size() > 2) {
                System.out.println("No");
            } else {

                long freq1 = map.values().iterator().next();
                long freq2 = (long) map.values().toArray()[map.size() - 1];

                if ((freq1 == freq2) || (Math.abs(freq1 - freq2) == 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        }

        sc.close();
    }
}
