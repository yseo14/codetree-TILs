import java.io.*;
import java.util.*;


public class Main {

    static int n;
    static int[][] map;
    static int data=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(data >9) data =1;
                map[i][j] = data;
                data++;
            }
        }

        for(int i = 0;i<n;i++){
            
            for(int j = 0;j<n;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}