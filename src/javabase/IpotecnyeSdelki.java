package javabase;
//задание 1 от 24.01
public class IpotecnyeSdelki {

        public static void main(String[] args) {
            String[] clients = {"Паспорт", "Водительское удостоверение", "Свидетельство о рождении"};

            if (clients.length != 3) {
                System.out.println("Ошибка! Неправильное количество участников сделки.");
            }
            else
            {
                System.out.println("Участники сделки и их удостоверения личности:");
                for (int i = 0; i < clients.length; i++)
                {
                    System.out.println("Участник " + (i+1) + ": " + clients[i]);
                }
                System.out.println("Документы успешно загружены!");
            }
        }
    }