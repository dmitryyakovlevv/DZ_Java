package number3;

public class Person
{
    String fullName;
    int age;

    Person (String fullName, int age)
    {
        this.fullName=fullName;
        this.age=age;
    }

    Person ()
    {

    }

    void move ()
    {
        System.out.println("Person " + fullName + " двигается");
    }

    void talk()
    {
        System.out.println("Person " + fullName + " говорит");
    }
}
