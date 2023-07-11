package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main14 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        for (int i = 0; i < stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }
        for (String letter : stringList) {
            System.out.println(letter);
        }
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);
        }
    }
}
