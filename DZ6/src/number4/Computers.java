package number4;

public class Computers implements Priceable{
    String name;
    int price;
    Computers(String name, int price)
    {
        this.name=name;
        this.price=price;
    }
    public void getPrice() {
        System.out.println(name+", price: $"+price);
    }
}
