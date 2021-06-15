package searching.algorithms;
import java.util.*;


/**
 *
 * @author mzcho
 */
public class SearchingAlgorithms {
        
    /** Searches through an array for a specific element (divide and conquer).
     * @param arr - The array to be searched
     * @param searchValue - The element to be searched for.
     * @return - A boolean true if element is found or false if not found.
     */
    public static boolean binarySearch(int[] arr, int searchValue) {
        
        if(arr.length == 1) {
            if (arr[0] == searchValue) return true;
            
            else return false;
        }
        
        int mid = Math.round((int)arr.length/2f);
        int[] tempArray = {};
        
        if(arr[mid] > searchValue) {
            tempArray = Arrays.copyOfRange(arr, 0, mid);
            return binarySearch(tempArray, searchValue);
        }
        
        else if (arr[mid] < searchValue) {
            tempArray = Arrays.copyOfRange(arr, mid, arr.length);
            return binarySearch(tempArray, searchValue);
        }
        
        else return true;
    }
    
    
    /**
     * Searches through an array for a specific element (sequentially).
     * @param arr - The array to be searched.
     * @param searchValue -  The specific element to be searched for.
     * @return - A boolean true if element located or false if not found.
     */
    public static boolean linearSearch(int[] arr, int searchValue) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue)
                return true;
        }
        return false;
    }
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr ={0, 3, 5, 8, 10, 20 }; //Declaring array
        boolean result = linearSearch(arr, 61);
        System.out.println(result);
        
        boolean result2;
        
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
            result2 = binarySearch(arr, arr[i]);
            
            if (result2 == true) {
                System.out.println("Found!");
            }
            else System.out.println("Not Found!");
        }
        
        for (int i =0; i <= 20; i++) {
            System.out.println(i);
            result2 = binarySearch(arr, i);
            
            if (result2 == true) {
                System.out.println("Found!");
            }
            else System.out.println("Not Found!");
        }
    }
}