public class Grades
{
    private int[] grades;
    private int size;

    public Grades()
    {
        this.grades= new int[10];
        this.size=0;
    }

    public void add(int value)
    {
        if(this.size == 10)
        {
            return;
        }

        this.grades[this.size] = value;
        this.size++;
    }

    public void printCurrent()
    {
        System.out.println(this.grades[this.size-1]);
    }

    public void printAll()
    {
        for (int j=0; j<10; j++)
        {
            System.out.println(this.grades[j]);
        }
    }
    public void average()
    {
        double sum=0.0;
        for (int i=0; i<10; i++)
        {
            sum= (sum + this.grades[this.size-1]);
        }
        double average= sum/this.size;
        System.out.println(sum);
        System.out.println(average);
    }

}
