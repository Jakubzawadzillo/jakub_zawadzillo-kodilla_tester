public class LeapYear
{
    private static boolean leapYearCheck (int year)
    {
        if (year%4 != 0 ||year%4 == 0 && year%100 == 0 && year%400 != 0 )
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)
    {
        int yearInput= 1993;
        leapYearCheck(yearInput);
    }
}
