/**
 * Created by Владислав on 10.11.2015.
 * Создать программу, которая меняет значения двух целочисленных
 * переменных местами, не используя третью переменную.
 */
public class task1 {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        System.out.println("Заданые числа: a=3,b=5");

        b = a - b;
        a = a - b;
        b = a + b;
        System.out.println("a="+a+" b="+b);
    }
}
