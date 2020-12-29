import java.util.Arrays;
public class arrayRotation
{
    public static void main(String[] args) {
        // Array Rotation Code;;

        //Array Declaration and Values input
        int[] firstArray = new int[7];
        for (int i = 0; i < 7; i++)
        {
            firstArray[i] = i + 1;
        }
        // n- array length and d- rotation value shift declaration
        int n = firstArray.length;
        int d = 2;

        // Array Rotate
        arrayRotate(firstArray, d);
        int savedNumbArray[]= arrayRotate(firstArray, d);

        // originalArraySubstitution
        arraySubstitution(firstArray, d, n);
        int substitutedArray[]= arraySubstitution(firstArray, d, n);

        //Rotation
        for (int i=0; i<d; i++)
        {
            substitutedArray[i+n-d] = savedNumbArray[i];
        }

        //Array After rotation
        for (int j=0; j<n; j++)
        {
            System.out.println(substitutedArray[j]);
        }


    }
    public static int [] arrayRotate(int[] toRotate, int shift) {
        int[] tempArray = new int[shift];
        for (int i = 0; i < shift; i++) {
            tempArray[i] = toRotate[i];
        }
        return tempArray;
    }

    public static int [] arraySubstitution(int[] toRotate, int shift, int arrayLength)
    {
        for (int i=0; i<arrayLength-shift; i++)
        {
            toRotate[i]=toRotate[i+shift];
        }
        return toRotate;
    }

}

