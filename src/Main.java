import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //////////////////////// Exercise 1 ////////////////////////
        boolean clientOS = true;
        System.out.println("Exercise 1");
        if (clientOS) System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

        //////////////////////// Exercise 2 ////////////////////////
        int releaseYear = 2017;
        int oldRelease = 2015;
        System.out.println("\nExercise 2");
        if (clientOS) {
            if (releaseYear >= oldRelease) System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (releaseYear >= oldRelease) System.out.println("Установите версию приложения для iOS по ссылке");
        else System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        //////////////////////// Exercise 3 ////////////////////////
        int year = 2000;
        boolean check4 = year % 4 == 0;
        boolean check100 = !(year % 100 == 0);
        boolean check400 = year % 400 == 0;
        System.out.println("\nExercise 3");
        if (check4 && check100 || check400) System.out.println("Год " + year + " является високосным");
        else System.out.println("Год " + year + " не является високосным");

        //////////////////////// Exercise 4 ////////////////////////
        int deliveryDistance = 101;
        int shortDistance = 20;
        int rangeDistance = 40;
        int deliveryDays = 1 + (deliveryDistance - shortDistance) / rangeDistance;
        System.out.println("\nExercise 4");
        if (deliveryDistance <= shortDistance) System.out.println("Потребуется дней: 1");
        else if ((deliveryDistance - shortDistance) % rangeDistance == 0)
            System.out.println("Потребуется дней: " + deliveryDays);
        else System.out.println("Потребуется дней: " + (deliveryDays + 1));

        //////////////////////// Exercise 5 ////////////////////////
        int monthNumber = 11;
        System.out.println("\nExercise 5");
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Не верно указан месяц");

        }
    }
}