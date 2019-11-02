// CLASS: Hw1_34
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

import java.util.ArrayList;

public class Hw1_34 {

    public Hw1_34 () {
    }

    public static Integer arrayListSum(ArrayList<Integer> plist) {
        int sum = 0;
        for (Integer element : plist) {
            sum += element;
        }
        return sum;
    }
}