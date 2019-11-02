// general main for testing methods from homework 1, section 3

import java.util.*;

public class Main_hw1_3 {

    public static void main(String[] args) {

        System.out.print(ex3_1());
        System.out.println();
        System.out.println();

        ArrayList<Integer> list = ex3_1();

        int count = 0;
        for (Integer element : list) {
            if (element < 0) {
                count += 1;
            }
        }
        System.out.println("Count: " + count);
        System.out.println();

        System.out.println(arrayListSum(list));
        System.out.println();

        System.out.println(arrayListCreate(7, 13));
        System.out.println();
        System.out.println();

        ArrayList<String> pList = new ArrayList<>();
        pList.add("Anna");
        pList.add("Beau");
        pList.add("Chad");
        pList.add("Greg");
        pList.add("Jan");

        System.out.println("Original ArrayList: \n" + pList);
        System.out.println();
        System.out.println("Below are method tests:");

        insertName(pList, "Bridget");
        System.out.println(pList);

        insertName(pList, "Eric");
        System.out.println(pList);

        insertName(pList, "Adelaide");
        System.out.println(pList);

        insertName(pList, "Matilda");
        System.out.println(pList);

        insertName(pList, "Cyprian");
        System.out.println(pList);

        insertName(pList, "Anselm");
        System.out.println(pList);

        insertName(pList, "Arden");
        System.out.println(pList);

        insertName(pList, "Kristin");
        System.out.println(pList);

        System.out.println();

        System.out.println(list);

        arrayListRemove(list, -1);
        System.out.println(list);

        arrayListRemove(list, 2);
        System.out.println(list);

        arrayListRemove(list, 3);
        System.out.println(list);

    }

    public static ArrayList<Integer> ex3_1() {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        while (count < 2) {
            for (int i = 0; i < 5; i++) {
                list.add(i-1);
            }
            count++;
        }
        return list;
    }

    public static Integer arrayListSum(ArrayList<Integer> plist) {
        int sum = 0;
        for (Integer element : plist) {
            sum += element;
        }
        return sum;
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

    public static void insertName(ArrayList<String> pList, String pName) {
        int insertIndex = 0;
        for (int index = 0; index < pList.size(); index++) {
            if (pList.get(index).compareTo(pName) < 0) {
                insertIndex = index + 1;
            }
        }
        pList.add(insertIndex, pName);
    }

    // I used a for loop and decremented it after elements were removed.
    // Then I only needed an if statement and not an if/else statement.
    public static void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        for (int index = 0; index < pList.size(); index++) {
            if (pList.get(index) == pValue) {
                pList.remove(index);
                index--;
            }
        }
    }
}