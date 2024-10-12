import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дію(1-Додавання, 2-віднімання, 3-множення, 4-ділення): ");
        int number = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int numb1 = scanner.nextInt();

        System.out.println("Введіть друге число: ");
        int numb2 = scanner.nextInt();
        int plus = numb1 + numb2;
        int minus = numb1 - numb2;
        int multiplication = numb1 * numb2;
        int division = numb1 / numb2;

        switch(number) {
            case 1:
                System.out.printf("Результат: " + plus);
                break;
            case 2:
                System.out.printf("Результат: " + minus);
                break;
            case 3:
                System.out.printf("Результат: " + multiplication);
                break;
            case 4:
                System.out.printf("Результат: " + division);
                break;
            default:
                System.out.printf("Невідоме число для розрахунків");
        }
    }
}