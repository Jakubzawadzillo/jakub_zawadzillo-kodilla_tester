public class Person {

    private String name;
    private double age;
    private double height;

    public Person(double age, double height)
    {
        this.age = age;
        this.height = height;
    }

    public Person (String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public double getAge()
    {
        return age;
    }

    public double getHeight()
    {
        return height;
    }
}
