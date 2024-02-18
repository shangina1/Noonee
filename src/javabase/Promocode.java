package javabase;
//задание 2 от 25.01
import java.util.Scanner;
public class Promocode {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите цену товара:");
            double price = scanner.nextDouble();
            System.out.println("Введите промокод:");
            String promoCode = scanner.next();
            if (promoCode.equals("4525"))
            {
                price = price * 0.7;
            }
            else if (promoCode.equals("6424") || promoCode.equals("7012"))
            {
                price = price * 0.8;
            }
            else if (promoCode.equals("7647") || promoCode.equals("9011") || promoCode.equals("6612"))
            {
                price = price - (price * 0.1);
            }
            System.out.printf("Цена со скидкой: %.2f%n", price);
        }
    }

