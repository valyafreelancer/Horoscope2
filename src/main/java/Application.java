import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        double x= input.nextDouble();

        System.out.println("Введите второе число");
        double y= input.nextDouble();

        String action = args [0];


        Scanner op = new Scanner(System.in);

        System.out.println("Введите операцию");
        args [0] = op.next();

        if (args [0].equals("+")) { // сложение
            System.out.println("Ответ: " + (x + y));
        } else if (args [0].equals("-")) { // вычетание
            System.out.println("Ответ: " + (x - y));
        } else if (args [0].equals("/")) { //деление
            System.out.println("Ответ " + (x/ y));
        } else if (args [0].equals("*")) { // умножение
            System.out.println("Ответ: " + (x * y));
        } else if (args [0].equals("%")) { // процент от числа
            System.out.println("Ответ: " + (x % y));
        } else if (args [0].equals("^")) { // возведение в степень
            System.out.println(Math.pow(x,y));
        } if(args[0].equals ("/") && y == 0)  // деление на ноль
            System.out.println ("Деление на ноль невозможно");

        }
    }
