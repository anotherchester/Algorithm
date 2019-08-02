package algorithm;

public class Main2 {

    public static void main(String[] args) {

        int[] array = {7,2,9,45,11,23};
        int[] sortarray = BubbleSort.bubbleSort(array);
        for (int i = 0; i < sortarray.length; i++) {
            System.out.print(sortarray[i] + " ");
        }

    }
}
