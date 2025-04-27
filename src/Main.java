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
    }
}