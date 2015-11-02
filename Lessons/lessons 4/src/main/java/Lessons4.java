/**
 * Created by UITshool on 02.11.2015.
 */
public class Lessons4 {

    public static void main(String[] args) {

        int a = 0x41;
        int b = 24;
        float c = 1.03f;

        double x = 938;
        int y = 246;
        int z = 2;
        int g = (int)((x/y)*Math.pow(10,(z+1)));
        int k = (int)(g-((int)(g/10)*10));
        if(k >=5){
            System.out.println((double)((int)(g/10)+1)/Math.pow(10.0,((double)z)));
        }
        else{
            System.out.println((double)((int)(g/10))/Math.pow(10.0,((double)z)));

        }
        /**System.out.println((char)a); //явное преобразования типов
        System.out.println(10.0/3);
        System.out.println((double)23);
        System.out.println();*/

    }
}
