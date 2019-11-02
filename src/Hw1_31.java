// CLASS: Hw1_31
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

import java.util.ArrayList;

public class Hw1_31 {

    public Hw1_31() {
    }

    public static ArrayList<Integer> ex3_1() {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        while (count < 2) {
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
            count++;
        }
        return list;
    }
}
