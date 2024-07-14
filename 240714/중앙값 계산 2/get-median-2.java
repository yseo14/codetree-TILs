import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers.add(num);
            
            if (i % 2 == 1) {
                List<Integer> temp = new ArrayList<>(numbers);
                Collections.sort(temp);
                int median = temp.get(temp.size() / 2);
                System.out.print(median + " ");
            }
        }
    }
}