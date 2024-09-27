package array;

public class Main17 {

    public static void main(String[] args) {
        Main17 main = new Main17();
        int[] customArray = {1, 3, 4, 5};
        main.spofArray(customArray);
    }

    void spofArray(int[] array) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
}
