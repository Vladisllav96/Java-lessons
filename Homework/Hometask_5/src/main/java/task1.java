/**
 * Создать программу, которая производит сортировку произвольного массива
 * целых чисел методом пузырьковой сортировки.
 */
public class task1 {

    public static void main(String[] args) {

        int [] arr = {3,6,2,5,8,7,10,11,9,1,2,12};
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = i ; j < arr.length ; j++){
                if( arr[i] > arr[j] ){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;

                }
            }
        }
        System.out.println ( "Отсортированный массив : ");
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}

