// CLASS: Hw1_35
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

import java.util.ArrayList;

public class Hw1_35{

    public Hw1_35() {
    }

    public static ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        while (index < pLen) {
            list.add(pInitValue);
            index++;
        }
        return list;
    }
}