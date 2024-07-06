import java.io.*;

/**
 * Carry 피하기
 * <p>
 * 1. Carry가 생기는지 판단하기
 * 2. 백트래킹으로 개수 세기
 */

public class Main {

    static int n;
    static int[] nums;
    static int result = Integer.MIN_VALUE;
    static int count = 0;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        backTracking(0, 0);
        System.out.println(result);
    }

    public static void backTracking(int start, int sum) {

        result = Math.max(result, count);

        if (start == n){
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (isNotCarry(sum, nums[i])) {
                visited[i] = true;
                sum += nums[i];
                count++;
                backTracking(i + 1, sum);
                count=0;
                visited[i] = false;
            }
        }
    }

    public static boolean isNotCarry(int a, int b) {

        while (a != 0 && b != 0) {
            int digit_a = a % 10;
            int digit_b = b % 10;

            if (digit_a + digit_b >= 10) return false;

            a /= 10;
            b /= 10;
        }

        return true;
    }
}