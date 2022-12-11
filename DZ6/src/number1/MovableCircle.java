package number1;

public class MovableCircle implements Movable {
    int R;
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint center=new MovablePoint(0,0,2,2);
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int R) {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.R=R;
    }
    public void moveUp() {
        System.out.println("Движение вверх:");
        center.moveUp();
        System.out.println("Центр: "+center.toString());
        y+=1;
        System.out.println("Точка окружности: "+"x="+ x +", y="+ y +", xSpeed="+xSpeed +", ySpeed="+ ySpeed +", R="+R);
    }


    public void moveDown() {
        System.out.println("Движение вниз:");
        center.moveDown();
        System.out.println("Центр: "+center.toString());
        y-=1;
        System.out.println("Точка окружности: "+"x="+ x +", y="+ y +", xSpeed="+xSpeed +", ySpeed="+ ySpeed +", R="+R);
    }


    public void moveLeft() {
        System.out.println("Движение влево:");
        center.moveLeft();
        System.out.println("Центр: "+center.toString());
        x-=1;
        System.out.println("Точка окружности: "+"x="+ x +", y="+ y +", xSpeed="+xSpeed +", ySpeed="+ ySpeed +", R="+R);
    }


    public void moveRight() {
        System.out.println("Движение вправо:");
        center.moveRight();
        System.out.println("Центр: "+center.toString());
        x+=1;
        System.out.println("Точка окружности: "+"x="+ x +", y="+ y +", xSpeed="+xSpeed +", ySpeed="+ ySpeed +", R="+R);
    }
}
