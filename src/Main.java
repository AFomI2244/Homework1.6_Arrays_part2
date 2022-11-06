import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1.6
        //Задача 1

        System.out.println("Домашнее задание 1.6");
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задача 2
        System.out.println("Задача 2");
        int maxSum = 0;
        int minSum = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println(String.format("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", minSum, maxSum));

        //Задача 3
        System.out.println("Задача 3");
        double sum2 = 0;
        for (int element : arr) {
            sum2 += element;
        }
        double meanSum = sum2 / arr.length;
        System.out.println(String.format("Средняя сумма трат за месяц составила %f рублей", meanSum));

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}