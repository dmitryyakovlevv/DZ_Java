package namber7;

public class Book
{
    private String author;
    private String name;
    private String year;
    public Book( String name,String author, String year )
    {
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public String getName() {return name;}
    public String getAuthor() {return author;}
    public String getYear() {return year;}

}