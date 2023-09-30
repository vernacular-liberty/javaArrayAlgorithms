//import
import java.util.Arrays;

public class ArrayAlgorithmsTesters extends ArrayAlgorithms{

    /**
     * Prints a statement to indicate if function passed the test
     * @param isFunctional if the function works
     */
    public static void passTest(Boolean isFunctional){
        if (isFunctional){
            System.out.println("Passed unit test ✅");

        } else {
            System.out.println("Did not pass unit test ❌");

        }
    }
   
    /**
     * Tests the copy function
     */
    public static void testCopy(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        int[] copyArray = copy(array);
        Boolean isFunctional = false;

        if (Helpers.length(array) == Helpers.length(copyArray)){
            isFunctional = true;
        }

        for (int i = 0; i < Helpers.length(array); i++){
            if (array[i] != copyArray[i]){
                isFunctional = false;
            }
        }

        System.out.println("1. Testing: copy");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(copyArray));
        passTest(isFunctional);
        System.out.println("");

    }
    
    /**
     * Test the addAll function
     */
    public static void testAddAll(){
        int[] array = Helpers.createArray(10);
        int sum = addAll(array);
        Boolean isFunctional;

        System.out.println("2. Testing: addAll");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + sum);

        if (sum == 45){
            isFunctional = true;

        } else {
            isFunctional = false;
        }

        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * tests the addAllRec function
     */
    public static void testAddAllRec(){
        int[] array = Helpers.createArray(10);
        int sum = addAllRecW(array);
        Boolean isFunctional;

        System.out.println("3. Testing: addAllRec");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + sum);

        if (sum == 45){
            isFunctional = true;

        } else {
            isFunctional = false;
        }

        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the addArrays function
     */
    public static void testAddArrays(){
        int[] arrayOne = {1, 2, 3, 4, 5, 6};
        int[] arrayTwo = {4, 5, 10, 2, 5, 9};
        Boolean isFunctional = true;
        int[] output = addArrays(arrayOne, arrayTwo);

        for (int i = 0 ; i < Helpers.length(arrayOne); i ++){
            if (arrayOne[i] + arrayTwo[i] != output[i]){
                isFunctional = false;
          
            }
        }

        System.out.println("4. Testing: addArrays");
        System.out.println("Input: " + Arrays.toString(arrayOne) + " & " + Arrays.toString(arrayTwo));
        System.out.println("Output: " + Arrays.toString(output));
        passTest(isFunctional);
        System.out.println("");

    }

    /**
     * Tests multiplyAll function
     */
    public static void testMultiplyAll(){
        //int[] array = createArray(10);
        int[] array = {1, 5, 8, 9};
        int product = multiplyAll(array);
        Boolean isFunctional;

        //0 or 360
        if (product == 360){
            isFunctional = true;

        } else {
            isFunctional = false;
        }

        System.out.println("5. Testing: multiplyAll");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + product);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests multiplyAllRec function
     */
    public static void testMultiplyAllRec(){
        //int[] array = createArray(10);
        int[] array = {1, 5, 8, 9};
        int product = multiplyAllRecW(array);
        Boolean isFunctional;

        //0 or 360
        if (product == 360){
            isFunctional = true;

        } else {
            isFunctional = false;
        }

        System.out.println("6. Testing: multiplyAllRec");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + product);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests findAverage functions
     */
    public static void testFindAverage(){
        //int[] array = createArray(10);
        int[] array = {1, 5, 8, 9};
        double average = findAverage(array);
        Boolean isFunctional;

        //4 or 5
        if (average == 5){
            isFunctional = true;

        } else {
            isFunctional = false;
        }
        System.out.println("7. Testing: findAverage");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + average);
        passTest(isFunctional);
        System.out.println("");

    }

    /**
     * Tests swap function
     */
    public static void testSwap(){
        int[] array = Helpers.createArray(5);
        int indexOne = 0;
        int indexTwo = 3;
        int[] expectedOutput = {3, 1, 2, 0, 4};
        Boolean isFunctional = true;

        System.out.println("8. Testing: swap");
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Input indexes: "+  indexOne + " & " + indexTwo);
        
        array = swap(array, indexOne, indexTwo);

        for (int i = 0; i < Helpers.length(array); i++){
            if (array[i] != expectedOutput[i]){
                isFunctional = false;
            }
        }

        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests isElement function
     */
    public static void testIsElement(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        //int value = array[0];
        int value = 20;
        Boolean isFunctional = true;
        Boolean isElement = isElement(array, value);

        for(int element: array){
            if(element == value && isElement == false){
                isFunctional = false;
            } 
        }

        System.out.println("9. Testing: isElement");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Input Value: " + value);
        System.out.println("Output: " + isElement);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests isElementRec function
     */
    public static void testIsElementRec(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        //int value = array[0];
        int value = 20;
        Boolean isFunctional = true;
        Boolean isElement = isElementRecW(array, value);

        for(int element: array){
            if(element == value && isElement == false){
                isFunctional = false;
            } 
        }

        System.out.println("10. Testing: isElementRec");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Input Value: " + value);
        System.out.println("Output: " + isElement);
        passTest(isFunctional);
        System.out.println("");
    }


    /**
     * Tests indexOf function
     */
    public static void testIndexOf(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        int value = 4;
        //int value = array[2];
        Boolean isFunctional = true;

        int index = indexOf(array, value);

        if (index == -1 && isElement(array, value)){
            isFunctional = false;
        }

        if (index >= 0){
            if(array[index] != value){
                isFunctional = false;
            }
        }
        
        System.out.println("11. Testing: indexOf");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Input Value: " + value);
        System.out.println("Output: " + index);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the binarySearch function
     */
    public static void testBinarySearch(){
        //int[] array = Helpers.createArray(10);
        int[] array = Helpers.createArray(100);
        //int[] array = Helpers.randomArray(20, 10);
        int value = array[5];
        Boolean isFunctional = true;

        int index = binarySearchW(array, value);

        if (index == -1 && isElement(array, value)){
            isFunctional = false;
        }

        if (index >= 0){
            if(array[index] != value){
                isFunctional = false;
            }
        }
        
        System.out.println("12. Testing: binarySearch");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Input Value: " + value);
        System.out.println("Output: " + index);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the findMin function
     */
    public static void testFindMin(){
        int[] array = {2, 3, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;

        int min = findMin(array);
        
        if(isElement(array, min) == false){
            isFunctional = false;
        }

        for (int element: array){
            if(element < min){
                isFunctional = false;
            }
        }

        System.out.println("13. Testing: findMin");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + min);  
        passTest(isFunctional);      
        System.out.println("");
    }

    /**
     * Tests findMinRec function
     */
    public static void testFindMinRec(){
        //int[] array = {2, 3, 5};
        int[] array = Helpers.createArray(100);
        //int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;

        int min = findMinRecW(array);
        
        if(isElement(array, min) == false){
            isFunctional = false;
        }

        for (int element: array){
            if(element < min){
                isFunctional = false;
            }
        }

        System.out.println("14. Testing: findMinRec");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + min);  
        passTest(isFunctional);      
        System.out.println("");
    }

    /**
     * Tests the findMinIndex function.
     */
    public static void testFindMinIndex(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;
        int min = findMin(array);

        int index = findMinIndex(array);

        if (min >= 0){
            if(array[index] != min){
                isFunctional = false;
            }
        }

        System.out.println("15. Testing: findMinIndex");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + index);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Test the findMax function
     */
    public static void testFindMax(){
        //int[] array = {2, 3, 5};
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;

        int max = findMax(array);
        
        if(isElement(array, max) == false){
            isFunctional = false;
        }

        for (int element: array){
            if(element > max){
                isFunctional = false;
            }
        }

        System.out.println("16. Testing: findMax");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + max);  
        passTest(isFunctional);      
        System.out.println("");
    }

    /**
     * Tests the findMaxRec function
     */
    public static void testFindMaxRec(){
        //int[] array = {2, 3, 5};
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;

        int max = findMaxRecW(array);
        
        if(isElement(array, max) == false){
            isFunctional = false;
        }

        for (int element: array){
            if(element > max){
                isFunctional = false;
            }
        }

        System.out.println("17. Testing: findMaxRec");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + max);  
        passTest(isFunctional);      
        System.out.println("");
    }

    /**
     * Tests the findMaxIndex function.
     */
    public static void testFindMaxIndex(){
        //int[] array = createArray(10);
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;
        int max = findMax(array);

        int index = findMaxIndex(array);

        if (max >= 0){
            if(array[index] != max){
                isFunctional = false;
            }
        }
        
        System.out.println("18. Testing: findMaxIndex");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + index);
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the returnReverse function.
     */
    public static void testReturnReverse(){
        //int[] array = {1, 2, 3, 4};
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;
        int[] reverseArray = returnReverse(array);
        int n = Helpers.length(array)-1;

        for (int i = 0; i < n; i++){
            if (reverseArray[i] != array[n]){
                isFunctional = false;

            }
            n -= 1;
        }

        System.out.println("19. Testing: returnReverse");
        System.out.println("Input Array:" + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(reverseArray));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the reverse function
     */
    public static void testReverse(){
        //int[] array = {1, 2, 3, 4};
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;
        
        System.out.println("20. Testing: reverse ");
        System.out.println("Input Array:" + Arrays.toString(array));
        reverse(array);
        System.out.println("Output: " + Arrays.toString(array));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the reverseRec function
     */
    public static void testReverseRec(){
        //int[] array = {1, 2, 3, 4};
        //int[] array = createArray(100);
        int[] array = Helpers.randomArray(20, 10);
        Boolean isFunctional = true;
        
        System.out.println("21. Testing: reverseRec ");
        System.out.println("Input Array:" + Arrays.toString(array));
        reverseRecW(array);
        System.out.println("Output: " + Arrays.toString(array));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the intersection function
     */
    public static void testIntersection(){
        int[] arrayOne = {0, 2, 3, 4, 5, 6, 10, 13, 12};
        int[] arrayTwo = {4, 5, 10, 2, 5, 0, 10, 12, 0};
        Boolean isFunctional = true;
        int[] intersectionArray = intersection(arrayOne, arrayTwo);

        for(int i = 0; i < Helpers.length(intersectionArray); i++){
            if(isElement(arrayOne, intersectionArray[i]) == false || isElement(arrayTwo, intersectionArray[i]) == false){
                isFunctional = false;
   
            }
        }

        System.out.println("22. Testing: intersection");
        System.out.println("Input Arrays:" + Arrays.toString(arrayOne) + " & " + Arrays.toString(arrayTwo));
        System.out.println("Output: " + Arrays.toString(intersectionArray));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the union function
     */
    public static void testUnion(){
        int[] arrayOne = {0, 2, 2, 4, 5, 6};
        int[] arrayTwo = {4, 5, 10, 2, 5, 0};
        Boolean isFunctional = true;
        int[] unionArray = union(arrayOne, arrayTwo);

        for(int i = 0; i < Helpers.length(unionArray); i++){
            if (isElement(arrayOne, unionArray[i]) || isElement(arrayTwo, unionArray[i])){

            } else {
                isFunctional = false;
            }
        }

        System.out.println("23. Testing: union");
        System.out.println("Input Arrays: " + Arrays.toString(arrayOne) + " & " + Arrays.toString(arrayTwo));
        System.out.println("Output: " + Arrays.toString(unionArray));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the zeroEliminator function
     */
    public static void testZeroEliminator(){
        int[] array = {1, 0, 3, 0, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;
        Boolean hasZero = false;

        int[] newArray = Helpers.zeroEliminator(array, hasZero);

        System.out.println("24. Testing: zeroEliminator");
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(newArray));
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests the selectionSort function
     */
    public static void testSelectionSortAscend(){
        int[] array = {1, 0, 3, 0, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;
        System.out.println("25. Testing: selectionSortAscend");
        System.out.println("Input: " + Arrays.toString(array));
        array = selectionSortAscend(array);
        System.out.println("Output: " + Arrays.toString(array));
        if(findMin(array) != array[0] && findMax(array) != array[Helpers.length(array)]){
            isFunctional = false;
        }
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests selectionSortAscendRec function
     */
    public static void testSelectionSortAscendRec(){
        int[] array = {1, 0, 3, 0, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;

        System.out.println("26. Testing: selectionSortAscendRec");
        System.out.println("Input: " + Arrays.toString(array));
        array = selectionSortAscendRecW(array);
        System.out.println("Output: " + Arrays.toString(array));

        if(findMin(array) != array[0] && findMax(array) != array[Helpers.length(array)]){
            isFunctional = false;
        }
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests selectionSortDescend function
     */
    public static void testSelectionSortDescend(){
        int[] array = {1, 0, 3, 0, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;
        System.out.println("27. Testing: selectionSortDescend");
        System.out.println("Input: " + Arrays.toString(array));
        array = selectionSortDescend(array);
        System.out.println("Output: " + Arrays.toString(array));
        if(findMax(array) != array[0] && findMin(array) != array[Helpers.length(array)-1]){
            isFunctional = false;
        }
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests selectionSorDescendRec function
     */
    public static void testSelectionSortDescendRec(){
        int[] array = {1, 0, 3, 0, 5};
        //int[] array = createArray(100);
        //int[] array = randomArray(20, 10);
        Boolean isFunctional = true;
        System.out.println("28. Testing: selectionSortDescendRec");
        System.out.println("Input: " + Arrays.toString(array));
        array = selectionSortDescendRecW(array);
        System.out.println("Output: " + Arrays.toString(array));
        if(findMax(array) != array[0] && findMin(array) != array[Helpers.length(array)-1]){
            isFunctional = false;
        }
        passTest(isFunctional);
        System.out.println("");
    }

    /**
     * Tests sortAscend function
     */
    public static void testSortAscend(){
        int[] a = {50, 12, 33, 33, 33, 4,4,4,5,6,7,8,9,1,88,11,10};
        int[] sortedA = sortAscend(a, a.length);
        System.out.println("1. Testing: sortAscend");
        System.out.println("Input: " + Arrays.toString(a));
        System.out.println("Output: " + Arrays.toString(sortedA));
        passTest(true);
        System.out.println("");
    }

    public static void main(String[] args){
        testCopy();
        testAddAll();
        testAddAllRec();
        testAddArrays();
        testMultiplyAll();
        testMultiplyAllRec();
        testFindAverage();
        testSwap();
        testIsElement();
        testIsElementRec();
        testIndexOf();
        testBinarySearch();
        testFindMin();
        testFindMinRec();
        testFindMinIndex();
        testFindMax();
        testFindMaxRec();
        testFindMaxIndex();
        testReturnReverse();
        testReverse();
        testReverseRec();
        testIntersection();
        testUnion();
        testZeroEliminator();
        testSelectionSortAscend();
        testSelectionSortAscendRec();
        testSelectionSortDescend();
        testSelectionSortDescendRec();
        testSortAscend();
    }
}
