package number2;

public class Phone
{
    int weight;
    String model;
    String number;
    Phone(int weight, String model, String number)
    {
        this(number, model);
        this.weight=weight;
    }

    Phone (String model, String number)
    {
        this.number = number;
        this.model = model;
    }

    Phone()
    {

    }

    String getInfo ()
    {
        return "Model: " + model + "\n" + "Number: " + number + "\n" + "Weight: " + weight;
    }

    void receiveCall (String name)
    {
        System.out.println("Звонит " + name);
    }

    void receiveCall (String name, String smdNumber)
    {
        System.out.println("Звонит " + name + " с номера " + smdNumber);
    }

    String getNumber ()
    {
        return number;
    }

    void sendMessage (String... numbers)
    {
        System.out.println("Numbers: ");
        for (String number : numbers)
        {
            System.out.println(number);
        }
    }
}
