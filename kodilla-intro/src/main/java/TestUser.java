public class TestUser
{
    public static void main(String[] args)
    {
        User kuba= new User("kubus",28);
        User asia= new User("asia", 25);
        User jola= new User("jola", 32);
        User bartek= new User("bartek", 22);
        User maciek= new User("maciek", 31);
        User lechu= new User("leszek", 21);
        User cyryl= new User("Cyryl", 9);

        User[] users={kuba, asia, jola, bartek, maciek, lechu, cyryl};
        System.out.println(averageAge(users));
        System.out.println(displayBelowAverage(averageAge(users), users));

    }

    public static float averageAge(User[] users)
    {
        int count=0;
        int sum=0;
        float average=0.0f;
        for (int i=0; i<7; i++)
        {
            sum= sum+ users[i].getAge();
            count=i;
        }
        average= sum/count;
        return average;
    }

    public static int displayBelowAverage(float average, User[] users)
    {
        for (int i=0; i<7; i++)
        {
            if (users[i].getAge() < average)
            {
               System.out.println(users[i].getName());
            }
        }
        return 0;
    }

}

