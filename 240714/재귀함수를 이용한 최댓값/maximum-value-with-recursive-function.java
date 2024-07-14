import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = findMax(array, n);
        System.out.println(max);
    }

    // 재귀함수를 사용하여 배열의 최댓값 찾기
    public static int findMax(int[] array, int n) {
        // 기본 사례: 배열의 크기가 1인 경우 그 원소가 최댓값
        if (n == 1) {
            return array[0];
        }

        // 배열의 나머지 부분에서의 최댓값
        int maxOfRest = findMax(array, n - 1);

        // 현재 원소와 나머지 부분의 최댓값 비교
        return Math.max(array[n - 1], maxOfRest);
    }
}