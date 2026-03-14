import java.util.Scanner;

public class java_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size (n):");
            int n = sc.nextInt();
        int size = 2 * n - 1;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;
                int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(value + " ");
            }
            System.out.println();
        }
        }
    }
}
