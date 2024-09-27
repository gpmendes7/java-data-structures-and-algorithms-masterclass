package array;

public class Main18 {

    public static void main(String[] args) {
        Main18 main = new Main18();
        int[] customArray = {1,3,4,5};
        main.printPairs(customArray);
    }

    void printPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

}
