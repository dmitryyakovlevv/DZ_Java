package number6_7_8_9;

public class Book implements Printable{
    String name;
    Book(String name)
    {
        this.name=name;
    }
    public void print() {
        System.out.println("Книга: "+ name);
    }
}
