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
    /* public static void main(String[] args) {
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
    } */

    //Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
    // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
    /* public static void main(String[] args) {
        int b = 0;
        int[] Array = new int[8];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 != 0) Array[i] = 0;
            System.out.print(Array[i] + " ");
        }
    } */

    //Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
    // выведите массивы на экран в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
    // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int[] Array1 = new int[5];
        System.out.println("1 массив:");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int) (Math.random() * 6);
            System.out.print(Array1[i] + " ");
            sum1 += (int) Array1[i] / Array1.length;
        }

        System.out.println("");
        System.out.println("2 массив:");
        int[] Array2 = new int[5];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = (int) (Math.random() * 6);
            System.out.print(Array2[i] + " ");
            sum2 += (int) Array2[i] / Array2.length;
        }

        System.out.println("");
        if (sum1 == sum2) System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (sum1 > sum2)
                System.out.println("Среднее арифметическое значение первого массива больше");
            else System.out.println("Среднее арифметическое значение второго массива больше");
        }
    }
}
