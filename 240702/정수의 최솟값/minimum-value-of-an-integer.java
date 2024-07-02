import java.io.*;
import java.util.*;

public class Main {

    static int a,b,c;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(minimum(a,b,c));
    }

    public static int minimum(int a, int b, int c){
        int temp = Math.min(a,b);
        return Math.min(temp,c);
    }
}