package mergesort;

/**
 *
 * @author 20024094
 */

public class Average {
    
    public Average() {
        
    }
    
    public static int avgArray(int arr[]) {
        int sum = 0; 
 
        for (int i = 0; i < arr.length; i++)  
        sum += arr[i]; 
 
        int average = sum / arr.length; 
        
        return average;
    }
    
}
