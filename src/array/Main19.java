package array;

import java.util.Arrays;

public class Main19 {

    public static void main(String[] args) {
        Main19 main = new Main19();
        int[] customArray = {1,3,4,5};
        main.reverse(customArray);
    }

    void reverse(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int other  = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
