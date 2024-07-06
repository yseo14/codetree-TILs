import java.io.*;

public class Main {
    static int n;
    static int[] nums;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        backTracking(0, 0, 0);
        System.out.println(result);
    }

    public static void backTracking(int start, int sum, int count) {
        result = Math.max(result, count);

        for (int i = start; i < nums.length; i++) {
            if (isNotCarry(sum, nums[i])) {
                backTracking(i + 1, sum + nums[i], count + 1);
            }
        }
    }

    public static boolean isNotCarry(int a, int b) {
        while (a != 0 || b != 0) {
            int digit_a = a % 10;
            int digit_b = b % 10;

            if (digit_a + digit_b >= 10) {
                return false;
            }

            a /= 10;
            b /= 10;
        }
        return true;
    }
}