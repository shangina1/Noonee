package javabase;
//задание 1 от 18.01
import java.util.Arrays;
import java.util.Random;

    public class Massiv50 {
        public static void main(String[] args) {
            int[] lol = new int[50];

            Random random = new Random();
            for (int i = 0; i < lol.length; i++) {
                lol[i] =  1 + random.nextInt(50);
            }
            System.out.println("Массив: " + Arrays.toString(lol));

            int max = lol[0];
            for (int i = 1; i < lol.length; i++) {
                if (lol[i] > max) {
                    max = lol[i];
                }
            }
            System.out.println("макс элемент: " + max);

            int min = lol[0];
            for (int i = 1; i < lol.length; i++) {
                if (lol[i] < min) {
                    min = lol[i];
                }
            }
            System.out.println("мин элемент: " + min);

            double sum = 0;
            for (int num : lol) {
                sum += num;
            }
            double average = sum / lol.length;
            System.out.println("ср арифм: " + average);
        }
    }
