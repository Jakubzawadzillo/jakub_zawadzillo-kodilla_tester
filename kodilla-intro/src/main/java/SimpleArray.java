public class SimpleArray
{
    public static void main(String[] args)
    {
        // Array Declaration
        String[] guitars = new String[5];
        guitars[0]= "Fender";
        guitars[1]= "Gibson";
        guitars[2]= "Ibanez";
        guitars[3]= "Fuhr";
        guitars[4]= "LTP";
        // Array's 3rd element extraction
        String guitar= guitars[3];
        System.out.println(guitar);
        // Number of Array's elements
        int numberOfElements= guitars.length;
        System.out.println(numberOfElements);
        // THE END
    }
}
