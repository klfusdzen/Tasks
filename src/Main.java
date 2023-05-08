import java.util.Scanner;

public class Main {
    //С помощью класса Scanner ввести целое число.
    //Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”, иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
    //Используем оператор if-else.

     /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int input = scanner.nextInt();
        if (input >= 0 && input <= 10) {
            System.out.println("Положительное число меньше 10 или ноль");
        } else if (input < 0 && input > 10){
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    } */

    //Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    /* public static void main(String[] args) {
        for (int i = 1000; i < 9999; i += 3) {
            System.out.print(i + " ");
        }
    } */

    //Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            sum = sum + input % 10;
            input /= 10;
        }
        System.out.println("Сумма всех чисел введенного числа равна " + sum);
    }
}
