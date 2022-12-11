package number3;

public class animals implements Nameable{
    String name;

    animals(String name){
        this.name=name;
    }

    public void getName() {
        System.out.println("Animal. "+"Имя объекта: "+name);
    }
}
