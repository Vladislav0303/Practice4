import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num;
        }

        int reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }

        if (isNegative) {
            reversedNum = -reversedNum;
        }

        System.out.printf("%010d%n", reversedNum);
        scanner.close();
    }
}


