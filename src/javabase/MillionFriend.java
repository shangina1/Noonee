package javabase;

import java.util.Scanner;
//задание 2 от 22.01
public class MillionFriend {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму сбережений: ");
        int vklad = scanner.nextInt();
        int years;
        for(years = 0; vklad < 1000000; years++)
        {
            vklad =  vklad+(vklad/10);
            System.out.println("\n Год " +years+" сумма сбережений = "+ vklad);
        }
        System.out.println("\n На счету будет миллион через "+years+" лет");
    }
}
