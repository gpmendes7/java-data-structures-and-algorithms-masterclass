package array;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInTheArray(0, 0, 10);
        System.out.println(Arrays.deepToString(sda.arr));

        System.out.println(sda.arr.length);
        System.out.println(sda.arr[0].length);
    }
}
