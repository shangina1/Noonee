package exam1;

import java.math.BigDecimal;
import java.util.Scanner; //исп д/считывания пользовательского ввода в консоль

public class FinancialCalculator
{
    private static final BigDecimal[] expenses = new BigDecimal[30];
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1 – Enter expenses for a specific day"); //расходы за опр день
            System.out.println("2 – Expenses for the month"); //траты за мес
            System.out.println("3 – The biggest expense for the month"); //самая б сумма расхода за мес
            System.out.println("4 – Currency converter"); //конвертер валюты
            System.out.println("0 – Exit"); //выход
            System.out.print("Select a menu item: ");
            choice = scanner.nextInt();

            switch(choice)
            {//методы
                case 1:
                    enterExpenses(scanner);
                    break;
                case 2:
                    showExpenses();
                    break;
                case 3:
                    showMaxExpense();
                    break;
                case 4:
                    currencyConverter();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
        while (true);
    }
    private static void enterExpenses(Scanner scanner)
    {
        System.out.print("Enter the day (from 1 to 30): ");
        int day = scanner.nextInt(); //считывает введённое целое число типа int
        if (day < 1 || day > 30)
        {
            System.out.println("Invalid day. Please enter a day between 1 and 30.");
            return;
        }
        System.out.print("Enter the amount of expenses for the current day: ");
        BigDecimal amount = scanner.nextBigDecimal();

        System.out.println("Do you want to enter expenses for another day? (1 – yes, 0 – back to menu): ");
        int continueChoice = scanner.nextInt();
        if (continueChoice == 1)
        {
            System.out.print("Enter the day (from 1 to 30): ");
            day = scanner.nextInt();
            if (day < 1 || day > 30)
            {
                System.out.println("Invalid day. Please enter a day between 1 and 30.");
                return;
            }
            System.out.print("Enter the amount of expenses for the current day: ");
            amount = scanner.nextBigDecimal(); //счит зн в BD и сохр в переменную amount

            if (expenses[day - 1] == null)
            {
                expenses[day - 1] = amount;
            }//было 0 трат -> присваивает сумму

            if (expenses[day - 1] != null)
            {
                System.out.println("There is already an entry for this day. Do you want to overwrite the amount? (yes/no)");
                String overwrite = scanner.next();
                if (overwrite.equals("yes"))
                {
                    expenses[day - 1] = amount;
                }
                if (overwrite.equals("no"))
                {
                    return;
                }
            }
        }
        if (continueChoice == 0);
        {
            return;
        }

    }

    private static void showExpenses()
    {
        for (int i = 0; i < expenses.length; i++)
        {
            if (expenses[i] != null)
            {
                System.out.println((i + 1) + " day – " + expenses[i] + " rub");
            }
        }
    }
    private static void showMaxExpense()
    {
        BigDecimal maxExpense = BigDecimal.ZERO; //представление числа 0 с высокой точностью
        int maxExpenseDay = 1;
        for (int i = 0; i < expenses.length; i++) //проверяет, явл ли эл-т не нулевым и б ли он текущего макс расхода
        {
            if (expenses[i] != null && expenses[i].compareTo(maxExpense) > 0)
            {
                maxExpense = expenses[i];
                maxExpenseDay = i;
            }
        }
        if (maxExpenseDay != 1)
        {
            System.out.println((maxExpenseDay + 1) + " day – " + maxExpense + " rub");
        }
    }
    private static void currencyConverter()
    {
        BigDecimal euroRate = new BigDecimal("0.012");
        BigDecimal dollarRate = new BigDecimal("0.014");
        BigDecimal yuanRate = new BigDecimal("0.091");

        BigDecimal totalExpenses = BigDecimal.ZERO;
        for (BigDecimal expense : expenses)
        {
            if (expense != null)
            {
                totalExpenses = totalExpenses.add(expense);
            }
        }
        BigDecimal expensesInEuro = totalExpenses.multiply(euroRate);
        BigDecimal expensesInDollars = totalExpenses.multiply(dollarRate);
        BigDecimal expensesInYuan = totalExpenses.multiply(yuanRate);

        System.out.println("Expenses for the month in euro: " + expensesInEuro);
        System.out.println("Expenses for the month in dollars: " + expensesInDollars);
        System.out.println("Expenses for the month in yuan: " + expensesInYuan);
    }
}