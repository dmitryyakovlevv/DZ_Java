package number2;

public class MovableRectangle implements Movable{
    int x1,x2;
    int y1,y2;
    int xSpeed;
    int ySpeed;
    MovablePoint topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
    MovablePoint bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void Check() {
       int tx=topLeft.getxSpeed();
       int ty=topLeft.getySpeed();
       int bx=bottomRight.getxSpeed();
       int by=bottomRight.getySpeed();

       if (tx==bx && ty==by) {
           System.out.println("Скорости равны");
       }
       else {
           System.out.println("Скорости не равны");
       }
    }
    public void moveUp() {
        System.out.println("Движение вверх:");
        MovablePoint topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        topLeft.moveUp();
        System.out.println("Движение вверх нижней левой точки:");
        System.out.println(topLeft.toString());
        MovablePoint bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
        bottomRight.moveUp();
        System.out.println("Движение вверх верхней правой точки:");
        System.out.println(bottomRight.toString());
    }

    public void moveDown() {
        System.out.println("Движение вниз:");
        MovablePoint topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        topLeft.moveDown();
        System.out.println("Движение вниз нижней левой точки:");
        System.out.println(topLeft.toString());
        MovablePoint bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
        bottomRight.moveDown();
        System.out.println("Движение вниз верхней правой точки:");
        System.out.println(bottomRight.toString());
    }

    public void moveLeft() {
        System.out.println("Движение влево:");
        MovablePoint topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        topLeft.moveLeft();
        System.out.println("Движение влево нижней левой точки:");
        System.out.println(topLeft.toString());
        MovablePoint bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
        bottomRight.moveLeft();
        System.out.println("Движение влево верхней правой точки:");
        System.out.println(bottomRight.toString());
    }

    public void moveRight() {
        System.out.println("Движение вправо:");
        MovablePoint topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        topLeft.moveRight();
        System.out.println("Движение вправо нижней левой точки:");
        System.out.println(topLeft.toString());
        MovablePoint bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
        bottomRight.moveRight();
        System.out.println("Движение вправо верхней правой точки:");
        System.out.println(bottomRight.toString());
    }
}
