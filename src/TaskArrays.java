import java.util.Arrays;
import java.util.Random;

public class TaskArrays {
    //Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
    // отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
    //2 4 6 … 18 20
    //2
    //4
    /* public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Array = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Array[b] = i;
                System.out.print(Array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    } */

    //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
    // а затем этот же массив выведите на экран тоже в строку,
    // но в обратном порядке (99 97 95 93 … 7 5 3 1).
    /* public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        int[] Array = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Array[b] = i;
                System.out.print(Array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    } */

    //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    public static void main(String[] args) {
        int b = 0;
        int[] Array = new int[15];
        for (int i = 0; i < Array.length; i++) {
            Random random = new Random();
            Array[i] = random.nextInt(10);
            System.out.print(Array[i] + " ");
            if (Array[i] > 0 & Array[i] % 2 == 0) b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + b + " четных числа(ел)");
    }
}
