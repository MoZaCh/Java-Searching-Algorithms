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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
