import java.util.Arrays;

@SuppressWarnings("unused")
public class Array {
    public static void main(String[] args) {
        // declaring an array of integers
        int[] arr;
        
        // allocating memory
        arr = new int[10];
        
        // initializing elements
        arr[0] = 1;
        
        // data entry
        for(int i = 0; i<10; i++){
            arr[i] = i+1;
        }
        
        // looping
        for(int i = 0; i<arr.length ; i++){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
        
        System.err.println("\n\n\n\n\n\n\n");
        
        // array initalization
        int[] scores = {96,87,34,24,34,76,76,87,98};
        
        // enhanced loop -> for each
        for(int score:scores){
            System.err.println("Score: " + score);
        }
        
        // Different data types
        double[] temperatures = {20.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        
        // reading temperatures array
        for(double temp:temperatures){
            System.err.println("Temperature: " + temp);
        }
        
        System.err.println("\n\n\n\n\n\n\n");
        
        // multidimensional arrays
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        // printing matrix
        for(int[] row:matrix){
            for(int element:row){
                System.err.println(element);
            }
        }
        
        System.err.println("\n\n\n");
        // matrix/array calculations
        int sum = 0;
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int[] row:matrix){
            for(int value:row){
                sum+=value;
                if(value>max) max = value; // shorthand if
                if(value<min) min = value;
            }
        }
        double average = (double) sum / (matrix.length * matrix[0].length);
        
        System.err.println("Sum: " + sum);
        System.err.println("max: " + max);
        System.err.println("min: " + min);
        System.err.println("average: " + average);
        
        
        System.err.println("\n\n\n\n\n");
        
        
        // copying arrays:
        // array copy method syntax:
        // public static void arraycopy(object src , int srcPos , object dest , int destPos , int length);
        // where:
        // object src -> source array
        // srcPos -> starting position in src array
        //  dest -> destination array
        // destPos -> starting position in destination array
        // length -> no of elements to be copied
        
        // ex-> 
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"};
        
        
        
        // using System class
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for(String copy: copyTo){
            System.out.print(copy + " ");
        }
        
        System.err.println("\n\n");
        
        // using Array Class
        String[] copied = Arrays.copyOfRange(copyFrom, 2, 9);
        for(String copy: copied){
            System.out.print(copy + " ");
        }
        
        
        // copyOfRange is  a method of the arrays class there are more such methods for arrays:
        
        // 1. equals method - checks if two arrays are equal (we can use arrays copyTo and copied)
        System.err.println("\n\n");
        boolean isEqual = Arrays.equals(copyTo, copied);
        System.out.println(isEqual);
        


        // 2. fill -> single command to fill an array instead of looping
        System.err.println("\n\n");
        int[] numArr = new int[9];
        Arrays.fill(numArr, 25);
        Arrays.fill(copied, "Hello");
        for(int num:numArr){
            System.out.print(num+ " ");
        }
        
        System.err.println("\n");
        for(String word:copied){
            System.out.print(word+ " ");
        }
        
        
        
        // 3. sort -> sequential sorting
        System.err.println("\n\n");
        int[] toSort = {4,2,6,3,7,3,8,12,897,234,467,14,765,134,43};
        Arrays.sort(toSort);
        for(int num:toSort){
            System.out.print(num+ " ");
        }
        
        // 4. parallelsort -> uses multiple core for faster sorting
        System.err.println("\n\n");
        toSort = new int[]{4,2,6,3,7,3,8,12,897,234,467,14,765,134,43};
        Arrays.parallelSort(toSort);
        for(int num:toSort){
            System.out.print(num+ " ");
        }
        
        // 5. Binary Search -> uses binary search with O(log N) complexity but the arrays must be sorted
        System.err.println("\n\n");
        int index = Arrays.binarySearch(toSort, 12);
        System.out.println("index of 12 in sorted array: " + index);
        
        // 6. stream -> tells the comp wehat to do instead of how to do , links to modern funcitonal java programming
        
        // ex - printing an array ->
        scores = new int[]{85, 92, 78, 95, 88};
        Arrays.stream(scores).forEach(s->System.out.print(s + " "));
        
        // ex - total of scores above 80
        System.err.println("\n");
        sum = Arrays.stream(scores)
                    .filter(s -> s>80)
                    .sum();
        System.out.println("sum of scores above 80: " + sum);
    }
}
