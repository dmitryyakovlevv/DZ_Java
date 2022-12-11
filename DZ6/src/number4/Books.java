package number4;

public class Books implements Priceable{
    String name;
    int price;
    Books(String name, int price)
    {
        this.name=name;
        this.price=price;
    }
    public void getPrice() {
        System.out.println(name+", price: $"+price);
    }
}
