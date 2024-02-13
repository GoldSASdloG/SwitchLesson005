import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mayday;
        System.out.println("Введите день недели : 1-2-3-4-5-6-7 числом");
        Scanner in = new Scanner(System.in);
        mayday = in.nextInt();
        switch (mayday) {
            case 1:
                System.out.println("Понедельник!");
                break;
            case 2:
                System.out.println("Вторник!");
                break;
            case 3:
                System.out.println("Среда!");
                break;
            case 4:
                System.out.println("Четверг!");
                break;
            case 5:
                System.out.println("Пятница!");
                break;
            case 6:
                System.out.println("Суббота!");
                break;
            case 7:
                System.out.println("Воскресенье!");
                break;
            default:
                System.out.println("Такого дня недели не существует, введено не верно!");
                break;
        }
        System.out.println("Hello world!");
        System.out.println("Добро пожаловать вас приветствует кофемашина!");
        System.out.println("Размер стаканчиков кофе: 1-маленький, 2-средний, 3-большой");
        System.out.println("Пожалуйста сделайте свой выбор");
        Scanner kofe = new Scanner(System.in);
        String kofeSize = in.next();
        int cost = 0;
        switch (kofeSize) {
            case "3":
                cost += 20;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;
            default:
                System.out.println("Неверный выбор, пожалуйста выберете из 1-2-3");
                break;
        }
        if (cost != 0) {
            System.out.println("Внесите  " + cost + "  копеек");
            System.out.println("Спасибо!");


        }else {
            System.out.println("Пожалуйста повторите выбор!");
        }


    }
}