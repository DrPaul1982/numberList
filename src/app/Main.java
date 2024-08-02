package app;

import java.util.Arrays;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        int[] numList = {12, 67, -99, -23, 87, 78, -3, 88, 11, 77, 18, -9, 16, 45, -34, 54, 66, -7, 21, 20};


        int sumOfNumNegative = 0;
        int countPaired = 0;
        int countUnPaired = 0;
        int min = 0;
        int max = 0;

        int indexOfMax = 0;
        int indexOfMin = 0;
        int firstNegIndex= -1;
        double sumAfterNegValue = 0;
        Locale.setDefault(Locale.US);

        int count = 0;


        for (int ind = 0; ind < numList.length; ind++) {
            int value = numList[ind];

            if (value < 0) {
                sumOfNumNegative += value;
            }

            if (value % 2 == 0) {
                countPaired++;
            }

            if (value % 2 != 0) {
                countUnPaired++;
            }

            if (min > value) {
                min = value;
                indexOfMin = ind;
            }

            if (max < value) {
                max = value;
                indexOfMax = ind;
            }

            if (firstNegIndex >= 0) {
                sumAfterNegValue += value;
                count++;
            }

            if (firstNegIndex < 0 && value < 0) {
                firstNegIndex = ind;
            }
        }


        double average = sumAfterNegValue / count;

        System.out.print("Елементи масиву: " + Arrays.toString(numList));
        System.out.println("\nСума вид'ємних чісел: " + sumOfNumNegative);
        System.out.println("Кількість парних чисел: " + countPaired);
        System.out.println("Кількість непарних чисел: " + countUnPaired);
        System.out.println("Найменший елемент: " + min + " (з індексом " + indexOfMin + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + indexOfMax + ")");
        if (firstNegIndex >= 0) {
            System.out.printf("Середнє арифметичне чисел після першого від'ємного чісла: %.2f", average);
        } else {
            System.out.println("not found");
        }
    }
}
