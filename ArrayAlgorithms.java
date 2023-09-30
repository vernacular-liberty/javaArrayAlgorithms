import java.util.Arrays;

public class ArrayAlgorithms{
    /**
     * Copies the original array
     * @param array array to copy
     * @return copied array
     */
    public static int[] copy(int[] array){
        int n = Helpers.length(array);
        int[] copyArray = new int[n];

        for (int i = 0; i < n; i++){
            copyArray[i] = array[i];
        }

        return copyArray;
    }

    /**
     * Sum of all elements
     * @param array array to add values
     * @return sum of values
     */
    public static int addAll(int[] array){
        int sum = 0;

        for (int i = 0; i < Helpers.length(array); i++){
            sum += array[i];
        }

        return sum;
    }

    /**
     * Recursive algorithm to generate the sum of all elements in array
     * @param array array of integers to be added together
     * @param n the length of the array
     * @return sum of values
     */
    public static int addAllRec(int[] array, int n){
        if(n <= 0){
            return 0;
        }
        return addAllRec(array, n - 1) + array[n];
    }

    /**
     * Wrapper for addAll function
     * @param array array of ints to add
     * @return sum of values in array
     */
    public static int addAllRecW(int[] array){
        return addAllRec(array, Helpers.length(array)-1);
    }


    /**
     * Combines corresponding elements in two arrays to create one array
     * @param arrayOne array one
     * @param arrayTwo array two
     * @return combined array
     */
    public static int[] addArrays(int[] arrayOne, int[] arrayTwo){
        int n = Helpers.length(arrayOne);
        int[] addedArray = new int[n];

        for (int i = 0; i < n; i++){
            addedArray[i] = arrayOne[i] + arrayTwo[i];

        }

        return addedArray;
    }

    /**
     * Multiplies each element in array together
     * @param array input array
     * @return product of all elements in input array
     */
    public static int multiplyAll(int[] array){
        int product = array[0];

        for (int i = 1; i < Helpers.length(array); i ++){
            product *= array[i];
        }
        return product;
    }

    /**
     * Recursive function that multiplies each element in array together
     * @param array array of integers to be added together
     * @param n the length of the array
     * @return
     */
    public static int multiplyAllRec(int[] array, int n){
        if (n <= 0){
            return 1;
        }
        return multiplyAllRec(array, n - 1) * array[n];
    }

    /**
     * Wrapper for multiplyAllRec function
     * @param array array of ints to find the product of
     * @return product of all elements in array
     */
    public static int multiplyAllRecW(int[] array){
        return multiplyAllRec(array, Helpers.length(array)-1);
    }

    /**
     * Finds the average of elements on array
     * @param array input array
     * @return mean average
     */
    public static int findAverage(int[] array){
        int n = Helpers.length(array);
        int average = addAll(array)/n;
        return average;
    }

    /**
     * Swaps two elements on an array
     * @param array input array
     * @param indexOne
     * @param indexTwo
     * @return
     */
    public static int[] swap(int[] array, int indexOne, int indexTwo){
        int x = array[indexOne];
        int y = array[indexTwo];
        array[indexTwo] = x;
        array[indexOne] = y;
        return array;
    }

    /**
     * Checks if a value is an element in the input array
     * @param array input array
     * @param value input value
     * @return boolean for if in array
     */
    public static Boolean isElement(int[] array, int value){
        for (int i = 0; i < Helpers.length(array); i++){
            if (value == array[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * Recursively searches a given array for a given value
     * @param array array of integers to search
     * @param value int to find
     * @param n length of the array
     * @return boolean for the array
     */
    public static boolean isElementRec(int[] array, int value, int n){
        if (n == 0){
            return false;
        }if (array[n] != value){
            return isElementRec(array, value, n - 1);
        } else {
            return true;
        }
    }

    public static boolean isElementRecW(int[] array, int value){
        return isElementRec(array, value, Helpers.length(array)-1);
    }

    /**
     * Finds the index of the value in array if value in array
     * @param array input array
     * @param value input value
     * @return int index of input value
     */
    public static int indexOf(int[] array, int value){
        int index = -1;

        for (int i = 0; i < Helpers.length(array); i++){

            if (value == array[i]){
                index = i;

            }
        }
        return index;
    }

    /**
     * Recursively checks for a specific value.
     * @param array given sorted array to search
     * @param value given value to search for
     * @param start the beginning index
     * @param end the length of the array
     * @return the index of the array
     */
    public static int binarySearch(int[] array, int value, int start, int end){
        int middle = start + (end - start) / 2;
        if(value == array[middle]){
            return middle;
        } else if(value < array[middle]){
            return binarySearch(array, value, start, middle+1);
        } else if(value > array[middle]){
            return binarySearch(array, value, middle - 1, end);
        } else {
            return -1;
        }
    }

    public static int binarySearchW(int[] array, int value){
        return binarySearch(array, value, 0, Helpers.length(array)-1);
    }

    /**
     * Finds the minimum value in array
     * @param array input array
     * @return minimum value in array
     */
    public static int findMin(int[] array){
        int min = array[0];

        for (int i = 0; i < Helpers.length(array); i++){
            if (array[i] < min){
                min = array[i];

            }

        }

        return min;
    }

    /**
     * Recursively finds the minimum value
     * @param array array of integers to search
     * @param n length of the array
     * @return int for the min value in the array
     */
    public static int findMinRec(int[] array, int n){
        if (n == Helpers.length(array) - 1) {
            return array[n];
        }        
        int min = findMinRec(array, n + 1);
        if (array[n] < min) {
            return array[n];
        } else {
            return min;
        }

    }

    /**
     * Wrapper for findMinRec function
     * @param array of integers to search for min
     * @return int representing the min
     */
    public static int findMinRecW(int[] array){
        return findMinRec(array, 0);
    }

    /**
     * finds the index of the minimum value
     * @param array input array
     * @return index of minimum value
     */
    public static int findMinIndex(int[] array){
        int min = findMin(array);
        return indexOf(array, min);
    }

    /**
     * finds the maximum value in array
     * @param array input array
     * @return maximum value in array
     */
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Recursively finds the maximum value
     * @param array array of integers to search
     * @param n length of the array
     * @return int for the max value in the array
     */
    public static int findMaxRec(int[] array, int n){
        if (n == Helpers.length(array) - 1) {
            return array[n];
        }
        int max = findMaxRec(array, n + 1);
        if (array[n] > max) {
            return array[n];
        } else {
            return max;
        }
    }

    /**
     * Wrapper for findMinRec function
     * @param array of integers to search for min
     * @return int representing the min
     */
    public static int findMaxRecW(int[] array){
        return findMaxRec(array, 0);
    }

    /**
     * finds the index of the minimum value
     * @param array input array
     * @return index of maximum value
     */
    public static int findMaxIndex(int[] array){
        int max = findMax(array);
        return indexOf(array, max);
    }


    /**
     * Reverses the values in the array
     * @param array
     * @return 
     */
    public static void reverse(int[] array){
        for(int i = 0; i < Helpers.length(array)/2; i++){
            int temp = array[i];
            array[i] = array[Helpers.length(array) - i - 1];
            array[Helpers.length(array) - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverseRec(int[] array, int start, int end) {
        // Base case: If start index is greater than or equal to end index, return
        if (start >= end) {
            return;
        }
        // Swap the elements at start and end indices
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        // Recursive case: Call the function with start index + 1 and end index - 1
        reverseRec(array, start + 1, end - 1);
    }

    public static void reverseRecW(int[] array){
        reverseRec(array, 0, Helpers.length(array)-1);
    }

    /**
     * Reverses the values in the array
     * @param array input array
     * @return reversed array
     */
    public static int[] returnReverse(int[] array){
        int[] reversedArray = new int[Helpers.length(array)];
        
        for(int i = 0; i < Helpers.length(array); i++){
            int temp = array[i];
            reversedArray[i] = array[Helpers.length(array) - i - 1];
            reversedArray[Helpers.length(array) - i - 1] = temp;

        }

        return reversedArray;
    }

    /**
     * Creates an array of the shared elements in arrayOne and arrayTwo
     * @param arrayOne input array one
     * @param arrayTwo input array two
     * @return new array of shared elements
     */
    public static int[] intersection(int[] arrayOne, int[] arrayTwo){
        int[] intersectionArray = new int[Helpers.length(arrayOne)];
        Boolean hasZero = false;
        
        for (int i = 0; i < arrayOne.length; i++){
            if (isElement(arrayOne, arrayTwo[i]) && isElement(intersectionArray, arrayTwo[i]) == false){
                intersectionArray[i] = arrayTwo[i];
            }
        }

        if (isElement(arrayOne, 0) && isElement(arrayTwo, 0)){
            hasZero = true;
        }

        intersectionArray = Helpers.zeroEliminator(intersectionArray, hasZero);

        return intersectionArray;
    }

    /**
     * creates array of all values with no duplicates
     * @param arrayOne input array one
     * @param arrayTwo input array two
     * @return newarray of all possible values
     */
    public static int[] union(int[] arrayOne, int[] arrayTwo){
        int[] unionArray = new int[Helpers.length(arrayOne) + Helpers.length(arrayTwo)];
        Boolean hasZero = false;

        for (int i = 0; i < Helpers.length(arrayOne); i++){
            if (isElement(unionArray, arrayOne[i]) == false){
                unionArray[i] = arrayOne[i];
            }
        }
        
        int count = 0;
        for (int j = Helpers.length(arrayOne); j < Helpers.length(unionArray); j++){
            if (isElement(unionArray, arrayTwo[count]) == false){
                unionArray[j] = arrayTwo[count];
            }
            count += 1;
        }

        if (isElement(arrayOne, 0) || isElement(arrayTwo, 0)){
            hasZero = true;
        }

        unionArray = Helpers.zeroEliminator(unionArray, hasZero);

        return unionArray;

    }

    /**
     * Sorts array in ascending order
     * @param array integer array to sort
     * @return sorted array
     */
    public static int[] selectionSortAscend(int[] array){
        for (int j = 0; j < Helpers.length(array)-1; j++){
            int min = j;
            for (int i = j + 1; i < Helpers.length(array); i++){
                if(array[i] < array[min]){
                    min = i;
                }
            }
            if (min != j){
                swap(array, j, min);
            }
        }
        return array;
    }

    /**
     * Sorts array recursively in ascending order
     * @param array integer array to get sorted
     * @param min current possible min value
     * @return sorted array
     */
    public static int[] selectionSortAscendRec(int[] array, int min){
        if (min == Helpers.length(array)){
            return array;
        }
        int newMin = min;
        for (int i = min + 1; i < Helpers.length(array); i++){
            if (array[i] < array[newMin]){
                newMin = i;
            }
        }
        if(newMin != min){
            array = swap(array, min, newMin);
        } 
        return selectionSortAscendRec(array, min + 1);
    }

    /**
     * Wrapper for the selectionSortAscendRec function
     * @param array integer array to sort
     * @return sorted array
     */
    public static int[] selectionSortAscendRecW(int[] array){
        return selectionSortAscendRec(array, 0);
    }

    /**
     * Sorts array in descending order
     * @param array integer array to sort
     * @return sorted array
     */
    public static int[] selectionSortDescend(int[] array){
        for (int j = 0; j < Helpers.length(array) - 1; j++){
            int max = j;
            for (int i = j + 1; i < Helpers.length(array); i++){
                if (array[i] > array[max]){
                    max = i;
                }
            }
            if (max != j){
                swap(array, j, max);
            }
        }
        return array;
    }

    /**
     * Sorts array in descending order recursively
     * @param array integer array to sort
     * @param max current possible maximum index
     * @return sorted array
     */
    public static int[] selectionSortDescendRec(int[] array, int max){
        if (max == Helpers.length(array)){
            return array;
        }
        int newMax = max;
        for (int i = max + 1; i < Helpers.length(array); i++){
            if (array[i] > array[newMax]){
                newMax = i;
            }
        }
        if(newMax != max){
            array = swap(array, max, newMax);
        } 
        return selectionSortDescendRec(array, max + 1);

    }

    /**
     * Wrapper for selectionSortDescendRec
     * @param array integer array to sort
     * @return sorted array
     */
    public static int[] selectionSortDescendRecW(int[] array){
        return selectionSortDescendRec(array, 0);

    }

    /**
     * Sorts values in ascending order without duplicate elements
     * @param a int array of values to sort
     * @param n int array length
     * @return sorted array of unique values
     */
    public static int[] sortAscend(int[] a, int n){
        int max = findMax(a);
        int[] countA = new int[max + 1]; 
        for (int i = 0; i < n; i++) { 
            countA[a[i]]++;
        }
        int[] sortedA = new int[n];
        int count = 0;
        for (int i = 1; i <= max; i++) { 
            if (countA[i] > 0) {
                sortedA[count] = i;
                count++;
            }
        }
        return sortedA;
    } 
}
