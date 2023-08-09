import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.4, -2.8, -4.6, 6.8, 8.2, 2.6, 4.8, 8.6, 1.6, 8.2, 4.8, 8.2, 4.1, 6.4, 2.1};
        boolean negativeFound = false;
        double sum = 0;
        int count = 0;
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }
        double average = sum / count;
        System.out.println("Средне арифметической положителних чисел первого отрицателного; " + average);


        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}