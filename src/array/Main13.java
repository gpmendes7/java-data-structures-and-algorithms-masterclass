package array;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main13 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add(2, "C");
        System.out.println(stringList);
        System.out.println(stringList.get(2));
        System.out.println(stringList.get(0));
    }


}
