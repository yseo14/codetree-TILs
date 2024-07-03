public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = b;
        b = a;
        int temp2 = c;
        c = temp;
        a = temp2;
   
   
        System.out.println(a);
        System.out.println(b);   
        System.out.println(c);   

    }
}