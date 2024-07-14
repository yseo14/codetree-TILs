import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] array = new int[N];
        int[] sortedArray = new int[N];
        Integer[] originalIndexes = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            sortedArray[i] = array[i];
            originalIndexes[i] = i;
        }
        
        Arrays.sort(originalIndexes, (a, b) -> Integer.compare(array[a], array[b]));
        
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[originalIndexes[i]] = i + 1;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}