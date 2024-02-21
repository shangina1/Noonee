package javabase;
//задание от 12.02
import java.util.Scanner;
public class FinancialPlanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите вашу зарплату: ");
        double salary = scanner.nextDouble();

        System.out.print("введите планируемые затраты на транспорт: ");
        double transportationCost = scanner.nextDouble();

        System.out.print("введите планируемые затраты на еду: ");
        double foodCost = scanner.nextDouble();

        System.out.print("введите сумму возможных сбережений: ");
        double savings = scanner.nextDouble();

        checkFinances(salary, transportationCost, foodCost, savings);

        scanner.close();
    }

    public static void checkFinances(double salary, double transportationCost, double foodCost, double savings)
    {
        double totalExpenses = transportationCost + foodCost;
        double balance = salary - totalExpenses - savings;

        if (balance > 0)
        {
            System.out.println("у вас излишек средств в размере: " + balance);
            System.out.println("рекомендация: пополните сбережения или инвестируйте.");
        }
        else if (balance < 0)
        {
            System.out.println("у вас недостаток средств в размере: " + Math.abs(balance));
            System.out.println("рекомендация: пересмотрите свои расходы или попробуйте увеличить заработок.");
        }
        else
        {
            System.out.println("вы не имеете дополнительных средств.");
            System.out.println("рекомендация: следите за бюджетом и планируйте свои траты.");
        }
    }
}
