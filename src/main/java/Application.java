import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        System.out.println("Введите первое число");
        double x = input.nextDouble();

        System.out.println("Введите второе число");
        double y = input.nextDouble();


        System.out.println("Введите операцию");
        String action = input.next();

        switch (action) {
            case "+":
                System.out.println("Ответ: " + (x + y));
                break;
            case "-":
                System.out.println("Ответ: " + (x - y));
                break;
            case "/":
                System.out.println("Ответ: " + (x / y));
                if (y == 0) {
                    throw new IllegalArgumentException("Деление на ноль невозможно!");
                }
                break;
            case "*":
                System.out.println("Ответ: " + (x * y));
                break;
            case "%":
                System.out.println("Ответ: " + (x % y));
                break;
            case "^":
                System.out.println("Ответ: " + Math.pow(x,y));
                break;
            case "":
                System.out.println("Ошибка!");
                break;


        }
    }

    }
