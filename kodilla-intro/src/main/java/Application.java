public class Application {

    public static void main(String[] args)
    {
        Person jakub = new Person("Jakub", 28.0, 186.5);
        Person noname = new Person(21.0, 190.2);

        Person[] array = {jakub, noname};
        checkIf(array);

    }

    public static void checkIf(Person[] persons)
    {
        for(int i=0; i < 2; i++)
        {
            if (persons[i].getName() != null)
            {
                if (persons[i].getAge() > 30 && persons[i].getHeight() > 160)
                {
                    System.out.println("User is older than 30 and higher than 160");
                }
                else
                {
                    System.out.println("User is 30 or younger or 160cm or shorter");
                }
            }
        }
    }



}
