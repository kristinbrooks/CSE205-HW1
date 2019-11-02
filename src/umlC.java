public class umlC {
    public static final int CONST1 = 100;
    private int mX;
    private double mY;
    private String mZ;
    public umlC() { this(0, 0, ""); }
    public umlC(int pX, double pY, String pZ) { setX(pX); setY(pY); setZ(pZ); }
    public int getX() { return mX; }
    public double getY() { return mY; }
    private String getZ() { return mZ; }
    public void setX(int pX) { mX = pX; }
    public void setY(double pY) { mY = pY; }
    private void setZ(String pZ) { mZ = pZ; }
}