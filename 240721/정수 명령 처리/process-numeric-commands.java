import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            
            if (command.startsWith("push")) {
                String[] parts = command.split(" ");
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
        
        scanner.close();
    }
}