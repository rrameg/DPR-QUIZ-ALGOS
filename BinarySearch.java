
/**
 * Binary Search Example 
*/
public class BinarySearch
{
    private static int[] list = new int[]{1, 2, 3, 4, 5, 6}; // integer array list in order
    public static void main(String[] args)
    {
        if (binarySearch(list, 3))
        {
        
            System.out.println("Found 3");
        
        }
        if (!binarySearch(list, 8))
        {
        
            System.out.println("Did Not Find 8");
            
        }    
    }
    private static boolean binarySearch(final int[] array, final int search)
    {
        int first = 1;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while (first <= last)
        {
            if (array[middle] < search)
            {
                
                first = middle + 1;
                        
            }
            else if (array[middle] == search)
            {
                
                return true;
                
            }
            else
            {
                
                last = middle - 1;
                
            }
            middle = (first + last) / 2;
        }
        return false;    
    }
}



