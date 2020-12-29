import java.util.Random;

public class TestGrades
{
    public static void main(String[] args)
    {
        //Grades
        Grades grades= new Grades();
        addValue(grades);
        grades.printAll();
        grades.printCurrent();
        grades.average();
    }


    public static void addValue(Grades grades)
    {
        Random random = new Random(System.currentTimeMillis());
        for (int i=0; i<10; i++)
        {
            grades.add(random.nextInt(5-1)+1);
        }
    }

}
