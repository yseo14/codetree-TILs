import java.io.*;
import java.util.*;


public class Main {
    static int n,m;
    static int result = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(n,m);
    }

    public static void func(int a,int b){

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}