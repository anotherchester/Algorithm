package algorithm;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;

        for(int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]) {
                sorted = false;
                temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
    }
        return array;
    }
}
