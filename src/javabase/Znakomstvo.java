package javabase;
//задание 1 от 29.01
import java.time.LocalTime;
public class Znakomstvo
{
        public static void main(String[] args)
        {
            LocalTime time = LocalTime.now();
            int hour = time.getHour();

            if (hour >= 4 && hour < 12)
            {
                System.out.println("доброе утро!");
            }
            else if (hour >= 12 && hour < 18)
            {
                System.out.println("добрый день!");
            }
            else if (hour >= 18 && hour < 23)
            {
                System.out.println("добрый вечер!");
            }
            else if (hour >= 23 && hour < 4)
            {
                System.out.println("доброй ночи!");
            }
        }
    }