// CLASS: C
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

public class C {
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

    public C(int pX) {
        setX(pX);
    }

    public C() {
        mX = -1;
    }
}
