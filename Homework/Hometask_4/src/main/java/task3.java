/**
 * Created by Владислав on 10.11.2015.
 * Создать программу, которая проверяет варианты переполнения
 * граничных значений для всехтипов данных.
 */
public class task3 {

    public static void main(String[] args) {

        int x = 2147483647;
        //byte y = (byte) 128;
        byte y = 127;
        //byte c = y +1;
        short z = (short) 342324;

        int i = 130;
        byte b = (byte) i;
        i = (int) 13.456;

        char s = 43;
        float x1 = 3.5f;
        double z1 = 1.0;
        //long q = -922372036854775808;

        System.out.println("Число: "+x);
        System.out.println("Число: "+y);
        System.out.println("Число: "+z);
        System.out.println("Число: "+s);



    }
}
