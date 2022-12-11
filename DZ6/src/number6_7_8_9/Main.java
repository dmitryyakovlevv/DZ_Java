package number6_7_8_9;

public class Main {
    public static void main (String args []) {
        Book b1=new Book("Java study");
        Shop s=new Shop("Sport");
        Book b2=new Book("Python study");
        Printable[] BS={b1,s,b2};
        for (Printable bs : BS) {
            if (bs instanceof  Book) {
                bs.print();
            }
            else if (bs instanceof  Shop) {
                bs.print();
            }
        }
    }
}
