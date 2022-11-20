package number7;

public class Main
{
    public static void main(String[] args)
    {
        learner student1=new Student("Alex","Student");
        learner schoolboy1=new Schoolboy("Michel","Schoolboy");
        learner student2=new Student("Dmitry","Student");

        learner[] learners={student1,schoolboy1,student2};

        System.out.println("Students: ");
        for(learner learn: learners)
        {
            if(learn instanceof Student)
            {
                ((Student) learn).getStudent();
            }
        }

        System.out.println(" ");

        System.out.println("Schoolboys: ");
        for(learner learn: learners)
        {
            if(learn instanceof Schoolboy)
            {
                ((Schoolboy) learn).getSchoolboy();
            }
        }
    }
}
