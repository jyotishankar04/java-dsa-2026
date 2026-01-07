import java.util.Scanner;

class PatternPrinter {
    // ! Pattern 1
    public void pattern1(int n) {
        System.err.println("Pattern 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 2
    public void pattern2(int n) {
        System.err.println("Pattern 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 3
    public void pattern3(int n) {
        System.err.println("Pattern 3: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // ! Pattern 4
    public void pattern4(int n) {
        System.err.println("Pattern 4: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square pattern: ");
        int n = sc.nextInt();

        PatternPrinter printer = new PatternPrinter();
        printer.pattern1(n);
        printer.pattern2(n);
        printer.pattern3(n);
        printer.pattern4(n);
        sc.close();
    }
}