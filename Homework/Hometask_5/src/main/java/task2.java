/**
 * Создать программу, которая увеличивает емкость произвольного массива
 * целых чисел на 3 элемента и заполняет добавленные ячейки значением “­1”
 */
public class task2 {
    public static void main(String[] args) {

        int [] arr = new int[6];
        for(int i=0; i<5; i++)
        {
            arr[i]=i;
            //System.out.print(arr[i]);
        }
        int []arr1 = new int[arr.length + 2];

        for( int k = 0; k < arr.length; k++ ){
            arr1[k] = arr[k];
            arr1[5]= -1;
            arr1[6]= -1;
            arr1[7]= -1;
            //здесь нужно как то добавить
        }
        for (int j = 0; j <arr1.length; j++){
            System.out.print(arr1[j]);
        }
    }
}
