import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        double x;
        double y;
        String action = args [1];

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        x = input.nextInt();

        System.out.println("Введите второе число");
        y = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Введите операцию");
        args [1] = op.next();

        if (args [1].equals("+")) { // сложение
            System.out.println("Ответ: " + (x + y));
        } else if (args [1].equals("-")) { // вычетание
            System.out.println("Ответ: " + (x - y));
        } else if (args [1].equals("/")) { //деление
            System.out.println("Ответ " + (x/ y));
        } else if (args [1].equals("*")) { // умножение
            System.out.println("Ответ: " + (x * y));
        } else if (args [1].equals("%")) { // процент от числа
            System.out.println("Ответ: " + (x % y));
        } else if (args [1].equals("^")) { // возведение в степень
            System.out.println(Math.pow(x,y));

        }
    }
    }
