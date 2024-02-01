package mergesort;

/**
 *
 * @author 20024094
 */

public class MergeSort { 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    public void merge(int arr[], int left, int middle, int right) { 
        // Find sizes of two subarrays to be merged 
        int seq1 = middle - left + 1; 
        int seq2 = right - middle; 
  
        // Create temp arrays for left Side as L[] and right side as R[]
        int L[] = new int[seq1]; 
        int R[] = new int[seq2]; 
  
        // Copy data to temp arrays from left side and Right side represented by L and R
        for (int i = 0; i < seq1; ++i) 
            L[i] = arr[left + i]; 
        for (int j = 0; j < seq2; ++j) 
            R[j] = arr[middle + 1 + j]; 
  
        // Merge the temp arrays 
        // Initial indexes of first and second subarrays 
        int i = 0;
        int j = 0; 
  
        // Initial index of merged subarray array 
        int k = left; 
        while (i < seq1 && j < seq2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copy remaining elements of L[] if any 
        while (i < seq1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Copy remaining elements of R[] if any 
        while (j < seq2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public void sort(int arr[], int left, int right) { 
        if (left < right) { 
            // Find the middle point 
            int middle = (left + right) / 2; 
  
            // Sort first and second halves 
            sort(arr, left, middle); 
            sort(arr, middle + 1, right); 
  
            // Merge the sorted halves 
            merge(arr, left, middle, right); 
        } 
    } 
  
    // A utility function to print array of size n 
    public static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
        System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) { 
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        // Calling of Merge Sort 
        MergeSort obj = new MergeSort(); 
        obj.sort(arr, 0, arr.length - 1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
}