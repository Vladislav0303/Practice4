import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввведіть діапазон чисел від 1 до будь-якого простого числа :");
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++) {
            boolean value = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    value = false;
                    break;

                }
             }
            if (value) {
                System.out.print(i + " ");

            }
        }
    }
}



