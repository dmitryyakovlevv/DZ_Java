package number7;

public class Student extends learner
{
    String id;

    Student(String fio, String id)
    {
        this.fio=fio;
        this.id=id;
    }

    void getStudent()
    {
        System.out.println(fio+": "+id);
    }
}
