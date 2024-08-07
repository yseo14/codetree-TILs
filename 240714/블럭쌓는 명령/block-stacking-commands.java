import java.io.*;
import java.util.*;
/**
 * 블럭쌓기 명령
 * 다시풀기
 */
public class Main {

    static int n,k;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr= new int[n+1];

        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int Ai = Integer.parseInt(st.nextToken());
            int Bi = Integer.parseInt(st.nextToken());

            arr[Ai-1]++;
            if(Bi<n){
                arr[Bi]--;
            }
        }

        int[] result = new int[n];
        result[0] = arr[0];
        for(int i = 1;i<n;i++){
            result[i] = result[i-1]+arr[i];
        }
        Arrays.sort(result);
        int median = result[n / 2];
        System.out.println(median);
    }
}