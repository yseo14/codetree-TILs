import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();

        List<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.startsWith(T)) {
                words.add(word);
            }
        }

        Collections.sort(words);

        System.out.println(words.get(k - 1));
    }
}