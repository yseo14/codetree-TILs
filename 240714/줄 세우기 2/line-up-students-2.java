import java.io.*;
import java.util.*;

public class Main {
    static class Student {
        int height;
        int weight;
        int index;

        Student(int height, int weight, int index) {
            this.height = height;
            this.weight = weight;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            students[i] = new Student(height, weight, i + 1);
        }
        
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.height != s2.height) {
                    return s1.height - s2.height; // 키 오름차순
                } else {
                    return s2.weight - s1.weight; // 몸무게 내림차순
                }
            }
        });
        
        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.index);
        }
    }
}