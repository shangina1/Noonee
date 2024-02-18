package javabase;
//задание 3 от 18.01
import java.util.Scanner;
public class ValKoshelock {

        public static void main(String[] args)
        {
            double dollars = 100;
            double euros = 80;
            double yens = 10000;
            double rubles = 5000;

            System.out.println("Ваш текущий кошелек:");
            System.out.println("Доллары: " + dollars);
            System.out.println("Евро: " + euros);
            System.out.println("Иены: " + yens);
            System.out.println("Рубли: " + rubles);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Куда вы планируете отправиться? (Швеция / Китай)");
            String destination = scanner.nextLine();
            if (destination.equalsIgnoreCase("Швеция"))
            {
                euros -= 80;
                double crowns = 700;
                System.out.println("Вы получили " + crowns + " шведских крон");
            }
            else if (destination.equalsIgnoreCase("Китай"))
            {
                yens -= 10000;
                double yuan = 700;
                System.out.println("Вы получили " + yuan + " юаней");
            }
            else
            {
                System.out.println("Неправильно выбрана страна!");
            }
            System.out.println("Обновленный кошелек:");
            System.out.println("Доллары: " + dollars);
            System.out.println("Евро: " + euros);
            System.out.println("Иены: " + yens);
            System.out.println("Рубли: " + rubles);
        }
    }
