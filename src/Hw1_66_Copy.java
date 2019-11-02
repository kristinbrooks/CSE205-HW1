// CLASS: Hw1_66
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

public class Hw1_66_Copy {

    public static void main(String[] pArgs) {
        C_Copy cObj1 = new C_Copy();
        C_Copy cObj2 = new C_Copy(10);

        System.out.println("X1: " + cObj1.getX());
        System.out.println("X2: " + cObj2.getX());
        System.out.println("Y: " + cObj2.getY());
        System.out.println();

        // added for 6.8 testing
//        int a1 = C_Copy.mX;
//        int a2 = C_Copy.my;
//        int a3 = C_Copy.A;
//        int a4 = C_Copy.B;
//        cObj1.C_Copy(20);
        int a5 = cObj1.getX();
        System.out.println("X1: " + a5);
        cObj1.setX(20);
        System.out.println("X1: " + cObj1.getX());
        cObj2.setX(cObj1.getX());
        System.out.println("X2: " + cObj2.getX());
//        int a6 = C_Copy.getX();
//        C_Copy.setX(20);
        int a7 = cObj1.getY();
        System.out.println("Y: " + a7);
        cObj1.setY(20);
        System.out.println("Y: " + cObj1.getY());
//        int a8 = C_Copy.getY();
//        C_Copy.setY(20);

        System.out.println();
        System.out.println("X1: " + cObj1.getX());
        System.out.println("X2: " + cObj2.getX());
        System.out.println("Y: " + cObj2.getY());
        System.out.println();

        //added for 6.9 testing
        cObj1.f();
//        cObj1.g();

        System.out.println();
        System.out.println("X1: " + cObj1.getX());
        System.out.println("X2: " + cObj2.getX());
        System.out.println("Y: " + cObj2.getY());
        System.out.println();

    }

    public Hw1_66_Copy () {
    }
}