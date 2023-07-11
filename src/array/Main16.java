package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Main16 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        stringList.remove(0);
        stringList.remove("D");
        System.out.println(stringList);
    }
}
