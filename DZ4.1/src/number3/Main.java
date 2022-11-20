package number3;

public class Main
{
    public static void main(String[] args)
    {
        Person p1= new Person();
        Person p2 = new Person("Alex B", 19);

        p1.move();
        p1.talk();

        p2.move();
        p2.talk();
    }
}
