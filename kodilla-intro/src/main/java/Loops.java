public class Loops
{
    public static void main(String[] args)
    {
        // Array Declaration
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        // Loop and Array print
        for (int i = 0; i < 3; i++)
        {
            System.out.println(names[i]);
        }

        // Reverse Printing Method
        reversePrinting (names);
        //THE END
    }
    // reversePrinting Method Declaration
    public static void reversePrinting (String[] array)
    {
       for (int i= array.length - 1; i>=0; i--)
       {
           System.out.println(array[i]);
       }
    }

}
