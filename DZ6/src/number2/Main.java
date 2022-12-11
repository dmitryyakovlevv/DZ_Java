package number2;

public class Main {
    public static void main (String args []) {
        Movable mr = new MovableRectangle(0,1,0,1,2,2);
        mr.Check();
        mr.moveUp();
        mr.moveDown();
        mr.moveLeft();
        mr.moveRight();
    }
}
