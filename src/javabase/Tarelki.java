package javabase;
//задание 1 от 25.01
import java.util.Scanner;
    public class Tarelki
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("введите количество тарелок: ");
            int dishes = scanner.nextInt();

            System.out.print("введите количество моющего средства: ");
            double sredstvo = scanner.nextDouble();

            if (sredstvo < dishes * 0.5)
            {
                System.out.println("недостаточно моющего средства для мытья всех тарелок.");
                return;
            }

            for (int i = 1; i <= dishes; i++)
            {
                sredstvo -= 0.5;
                System.out.println("осталось моющего средства после мытья " + i + " тарелки: " + sredstvo);
            }
        }
    }
