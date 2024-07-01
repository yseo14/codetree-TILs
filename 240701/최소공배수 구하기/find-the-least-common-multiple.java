import java.io.*;
import java.util.*;


public class Main {
    static int n,m;
    static int result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        System.out.println(lcm(n,m));
    }

    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a %b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a,int b){
        int gcd = gcd(a,b);
        return a*b/gcd;
    }
}