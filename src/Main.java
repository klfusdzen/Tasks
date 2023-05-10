import java.util.Scanner;

//Циклы
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
    /*  public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            sum = sum + input % 10;
            input /= 10;
        }
        System.out.println("Сумма всех чисел введенного числа равна " + sum);
    } */

    //Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    /* public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 55; i++, j += 2) {
            System.out.print(j + " ");
        }
    } */

    //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
    /* public static void main(String[] args) {
        for (int i = 1, j = 2; i <= 20; i++, j *= 2){
            System.out.print(j + " ");
        }
    } */

    //Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000
    public static void main(String[] args) {
        for (int a = 2; a < 10000; a = 2 * a - 1) {
            System.out.print(a + " ");
        }
    }
}
