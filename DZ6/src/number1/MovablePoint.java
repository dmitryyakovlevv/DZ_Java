package number1;

public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void moveUp() {
        y+=1;
    }

    public void moveDown() {
        y-=1;
    }

    public void moveLeft() {
        x-=1;
    }

    public void moveRight() {
        x+=1;
    }

    public String toString() {
        return "x="+ x +", y="+ y +", xSpeed="+xSpeed +", ySpeed="+ ySpeed;
    }
}
