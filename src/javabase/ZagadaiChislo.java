package javabase;
//задание 2 от 29.01
import java.util.Scanner;
public class ZagadaiChislo
{
    public static void main(String[] args)
    {
        int secretNumber = (int) (Math.random() * 9) + 1;
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("компьютер загадал число от 1 до 9. у вас есть 3 попытки.");

        while (attempts > 0)
        {
            System.out.print("введите ваше число: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber)
            {
                System.out.println("вы угадали число!");
                break;
            }
            else if (guess < secretNumber)
            {
                System.out.println("загаданное число больше.");
            }
            else
            {
                System.out.println("загаданное число меньше.");
            }
            attempts--;
        }
            if (attempts == 0)
            {
                System.out.println("вы проиграли. агаданное число было: " + secretNumber);
            }
            scanner.close();
        }
    }
