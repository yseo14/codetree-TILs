import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        String s,t;
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        t = br.readLine();

        String temp = s;
        s = t;
        t = temp;

        System.out.println(s+"\n"+t);
        
    }
}