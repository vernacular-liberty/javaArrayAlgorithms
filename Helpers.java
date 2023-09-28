import java.util.Random;

public class Helpers{
     /**
     * Eliminates zeros representing null's in array
     * @param array array with null values to be eliminated
     * @return array without null values
     */
    public static int[] zeroEliminator(int[] array, Boolean hasZero){
        int n = 0;

        for (int i = 0; i < length(array); i++){
            if (array[i] != 0){
                n += 1;
            }
        }

        if (hasZero){
            n += 1;
        }

        //System.out.println("length: " + n);

        int[] newArray = new int[n];
        
        int count = 0;
        for (int j = 0; j < length(array); j++){
            if (array[j] != 0){
                newArray[count] = array[j];
                count +=1;
            }
        }

        return newArray;
    }

    /**
     * Finds the length of the array
     * @param array input array
     * @return int length of array
     */
    public static int length(int[] array){
        int n = 0;

        for (int element: array){
            n += 1;
        }

        return n;
    }

    /**
     * Creates an array of a chosen size whose values correspond with the index number
     * @param n size of array
     * @return created array
     */
    public static int[] createArray(int n){
        int[] array = new int[n];

        for (int i = 0; i< length(array); i++){
            array[i] = i;
        }

        return array;
    }

    /** 
     * Creates an integer array of a given where each element is between 0 and max 
     * @param size n for random array
     * @param max maximum value for element
     * @return random array
    */
    public static int[] randomArray(int size, int max){
        Random random = new Random();//initialize random number generator
        int[] array = new int[size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max);//generate a random integer in the range 0 to max
        }
        return array;
    }
}
