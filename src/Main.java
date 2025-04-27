//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет человеку? Наберите воздаст, нажмите Enter.");
        int Age = scanner.nextInt();

        if (Age >= 18 ){
        System.out.println("он совершеннолетний");}
        else if (Age <= 0){
            System.out.println("либо он младенец, либо еще не родился");        }
        else
        {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println(" ");

        System.out.println("Задача 2");
        System.out.println("Какая температура на улице? Наберите, нажмите Enter.");
        int Temp = scanner.nextInt();
        if (Temp < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else if(Temp > 5)
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
        int Speed = scanner.nextInt();
        if (Speed <= 60)
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
        int ageHuman = scanner.nextInt();
        if (ageHuman < 2)
        {
            System.out.println("ему лучше побыть еще с мамой :).");
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
    }
}