import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        double x;
        double y;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        x = input.nextInt();

        System.out.println("Введите второе число");
        y = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Введите операцию");
        operation = op.next();

        if (operation.equals("+")) { // сложение
            System.out.println("Ответ: " + (x + y));
        } else if (operation.equals("-")) { // вычетание
            System.out.println("Ответ: " + (x - y));
        } else if (operation.equals("/")) { //деление
            System.out.println("Ответ " + (x/ y));
        } else if (operation.equals("*")) { // умножение
            System.out.println("Ответ: " + (x * y));
        } else if (operation.equals("%")) { // процент от числа
            System.out.println("Ответ: " + (x % y));
        } else if (operation.equals("^")) { // возведение в степень
            System.out.println(Math.pow(x,y));

        }
    }
    }
