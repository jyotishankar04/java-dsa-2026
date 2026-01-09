import java.util.Scanner;

class PatternPrinter {
    // ! Pattern 1
    public void pattern1(int n) {
        System.out.println("");
        System.out.println("Pattern 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 2
    public void pattern2(int n) {
        System.out.println("");
        System.out.println("Pattern 2: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 3
    public void pattern3(int n) {
        System.out.println("");
        System.out.println("Pattern 3: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ! Pattern 4
    public void pattern4(int n) {
        System.out.println("");
        System.out.println("Pattern 4: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // ! Pattern 5
    public void pattern5(int n) {
        System.out.println("");
        System.out.println("Pattern 5: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 6
    public void pattern6(int n) {
        System.out.println("");
        System.out.println("Pattern 6: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ! Pattern 7
    public void pattern7(int n) {
        System.out.println("");
        System.out.println("Pattern 7: ");
        for (int i = 0; i < n; i++) {

            // This loop will print the spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Inner loop will print asterisks
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 8
    public void pattern8(int n) {
        System.out.println("");
        System.out.println("Pattern 8: ");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j <= i) {
                    System.out.print(" ");
                }
                if (j > i && j < (2 * n - i)) {
                    System.out.print("*");
                }
                if (j >= (2 * n - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // ! Pattern 9 - Combination of the pattern 7 and 8
    public void pattern9(int n) {
        System.out.println("");
        System.out.println("Pattern 9: ");
        // The Upper Part
        for (int i = 0; i < n; i++) {

            // This loop will print the spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Inner loop will print asterisks
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // The lower part
        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j <= i) {
                    System.out.print(" ");
                }
                if (j > i && j < (2 * n - i)) {
                    System.out.print("*");
                }
                if (j >= (2 * n - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // ! Pattern 10
    public void pattern10(int n) {
        System.out.println("");
        System.out.println("Pattern 10: ");
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i;
            if (i >= n)
                // We use i - 2 because we start counting
                // from the top of the pattern and we need
                // to count the lines below the middle
                // of the pattern. The top and bottom lines
                // of the pattern have one less star than
                // the middle line.
                stars = 2 * n - i - 2;

            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ! Pattern 11
    public void pattern11(int n) {
        System.out.println("");
        System.out.println("Pattern 11: ");
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter = (counter == 1) ? (counter - 1) : (counter + 1);
            }
            System.out.println();
        }
    }

    // ! Pattern 12
    public void pattern12(int n) {
        System.out.println("");
        System.out.println("Pattern 12: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < (2 * n - (2 * i + 1) - 1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
    
    // ! Pattern 13
    public void pattern13(int n) {
        System.out.println("");
        System.out.println("Pattern 13: ");
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter++;
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
        printer.pattern5(n);
        printer.pattern6(n);
        printer.pattern7(n);
        printer.pattern8(n);
        printer.pattern9(n);
        printer.pattern10(n);
        printer.pattern11(n);
        printer.pattern12(n);
        printer.pattern13(n);

        sc.close();
    }
}