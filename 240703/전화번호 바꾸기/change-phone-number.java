import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        num = br.readLine();

        String[] blocks = num.split("-");
        System.out.printf("%s-%s-%s",blocks[0],blocks[2],blocks[1]);

    }
}