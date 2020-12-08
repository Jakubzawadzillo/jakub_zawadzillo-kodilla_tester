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
            System.out.println(firstArray[i]);
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
        Rotation(substitutedArray, savedNumbArray, n, d);


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

    public static int [] Rotation(int [] substituted, int [] saved, int arrayLength, int shift)
    {
        for (int i= arrayLength-shift; i< arrayLength; i++)
        {
            substituted[i]=saved[i-arrayLength-shift];
        }
        for (int j=0; j<arrayLength ; j++)
        {
            System.out.println(substituted[j]);
        }
        return substituted;
    }

}

