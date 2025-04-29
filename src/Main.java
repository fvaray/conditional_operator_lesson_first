//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1");
        System.out.println("Сколько лет человеку? Наберите воздаст, нажмите Enter.");
        int age = scanner.nextInt();

        if (age >= 18 ){
        System.out.println("он совершеннолетний");}
        else if (age <= 0){
            System.out.println("либо он младенец, либо еще не родился");        }
        else
        {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println(" ");

        System.out.println("Задача 2");
        System.out.println("Какая температура на улице? Наберите, нажмите Enter.");
        int temp = scanner.nextInt();
        if (temp < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else if(temp > 5)
        {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else
        {
            System.out.println("Решайте сами, на улице 5 градусов!");
        }
        System.out.println(" ");

        System.out.println("Задача 3");
        System.out.println("Какая была скорость? Наберите и нажмите Enter.");
        int speed = scanner.nextInt();
        if (speed <= 60)
        {
            System.out.println("превышения скорости нет, можно ездить спокойно.");
        }
        else
        {
            System.out.println("Скорость превышена, придется заплатить штраф");
        }
        System.out.println(" ");

        System.out.println("Задача 4");
        System.out.println("Сколько лет человеку? Наберите и нажмите Enter.");
        int ageHuman = 0;
        ageHuman = scanner.nextInt();
        if (ageHuman < 2)
        {
            System.out.println("ему лучше побыть еще с мамой :)");
        }
        else if (ageHuman >= 2 && ageHuman <= 6)
        {
            System.out.println("ему нужно ходить в детский сад.");
        }
        else if (ageHuman >= 7 && ageHuman <= 17)
        {
            System.out.println("ему нужно ходить в школу");
        }
        else if (ageHuman >= 18 && ageHuman <= 24)
        {
            System.out.println("его место в университете");
        }
        else if (ageHuman > 24)
        {
            System.out.println("ему пора ходить на работу");
        }
        System.out.println(" ");

        System.out.println("Задача 5");
        System.out.println("Сколько лет ребенку? Наберите и нажмите Enter.");
        int ageChild = scanner.nextInt();
        if (ageChild < 5)
        {
            System.out.println("<5 лет, ребенку нельзя кататься на аттракционе");
        }
        else if (ageChild >= 5 && ageChild < 14)
        {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else
        {
            System.out.println("он может кататься без сопровождения взрослого");
        }
        System.out.println(" ");

        System.out.println("Задача 6");
        int capacityСarriage = 102;
        int amountSeatPlaces = 60;
        int amountStandingPlaces = capacityСarriage - amountSeatPlaces;
        int cntFreeSeatPlaces = (int)(Math.random() * (amountSeatPlaces - 0 + 1));
        int cntFreeStandPlaces = (int)(Math.random() * (amountStandingPlaces - 0 + 1));

        System.out.printf("В вагоне осталось %d сидячих мест из %d и %d мест стоячих из %d, вместимость вагона %d мест,\n" +
                        " наберите 0 и Enter,если нужны сидячие, наберите 1 и Enter,\n" +
                        " если нужны стоячие места,если нужны оба типа мест, нажмите любой символ и Enter\n"
                ,cntFreeSeatPlaces,amountSeatPlaces,cntFreeStandPlaces,amountStandingPlaces,capacityСarriage);
        //System.out.printf("В вагоне %d %d %d %d",cntFreeSeatPlaces,amountSeatPlaces,cntFreeStandPlaces,);
        int requiredSeatOrStand = scanner.nextInt();
        if (requiredSeatOrStand == 0)
        {
            System.out.println("Вам нужны сидячие места, сколько мест вам требуется?, введите число и Enter");
            int requiredSeatPlaces = scanner.nextInt();
            if(requiredSeatPlaces < cntFreeSeatPlaces)
            {
                System.out.printf("Отлично! Сидячие места для вас есть, после вашего бронирования" +
                        " остается %d сидячих мест \n",  cntFreeSeatPlaces - requiredSeatPlaces);
            }
            else
            {
                System.out.printf("К сожалению, осталось только %d cидячих мест \n", cntFreeSeatPlaces);
            }
        }
        else if (requiredSeatOrStand == 1)
        {
            System.out.println("Вам нужны стоячие места, сколько мест вам требуется?, введите число и Enter");
            int requiredStandPlaces = scanner.nextInt();
            if(requiredStandPlaces <= cntFreeStandPlaces)
            {
                System.out.printf("Отлично! Стоячие места для вас есть, после вашего бронирования" +
                        " остается %d стоячих мест \n",  cntFreeStandPlaces - requiredStandPlaces);
            }
            else
            {
                System.out.printf("К сожалению, осталось только %d стоячих мест \n", cntFreeStandPlaces);
            }

        }
        else
        {
            System.out.println("Вам нужны и сидячие и стоячие места...");
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        int one;
        int two;
        int three;

        System.out.println("Программа вычисляет какое из 3х чисел наибольшее.");
        System.out.println("Введите первое число ");
        one = scanner.nextInt();
        System.out.println("Введите второе число ");
        two = scanner.nextInt();
        System.out.println("Введите третье число ");
        three = scanner.nextInt();

        if(one > two && one > three)
        {
            System.out.printf("One - максимальное число, которое равно %d \n", one);
        }
        else if(two > one && two > three)
        {
            System.out.printf("Two - максимальное число, которое равно %d \n", two);
        }
        else if(three > one && three > two)
        {
            System.out.printf("Three - максимальное число, которое равно %d \n", three);
        }
        else
        {
            int max = one;
            if (max <= two){
                max = two;
            }
            if (max <= three){
                max = three;
            }
            System.out.printf("Какие-то из чисел равны друг другу и равны %d \n", max);
        }
        System.out.println(" ");
    }
}