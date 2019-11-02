// CLASS: C_Copy
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

public class C_Copy {
    private int mX;
    private static int mY = 0;
    final private static int A = 100;
    final private static int B = 200;

    public int getX(){
        return mX;
    }

    public void setX(int pX) {
        mX = pX;
    }

    public int getY(){
        return mY;
    }

    public void setY(int pY) {
        mY = pY;
    }

    // added for 6.9 testing
    public void f() {
        mX = 0;
        mY = 0;
    }

    // added for 6.9 testing
//    public static void g() {
//        mX = 0;
//        mY = 0;
//    }

    public C_Copy(int pX) {
        setX(pX);
    }

    public C_Copy() {
        mX = -1;
    }
}
