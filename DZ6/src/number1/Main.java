package number1;

public class Main
{
    public static void main (String args []) {
        Movable mc = new MovableCircle(4,4,2,2,4);
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
    }
}
