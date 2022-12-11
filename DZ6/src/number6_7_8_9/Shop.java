package number6_7_8_9;

public class Shop implements Printable{
    String name;
    Shop(String name)
    {
        this.name=name;
    }
    public void print() {
        System.out.println("Журнал: "+ name);
    }
}
