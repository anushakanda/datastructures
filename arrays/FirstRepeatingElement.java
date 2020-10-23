/**
* Given an array of integers, find the first repeating element in it.
* 
* Solution 1:
* Use two nested loops. The outer loop picks an element one by one, the inner loop checks whether the element is repeated or not. 
* Once we find an element that repeats, we break the loops and print the element. Time Complexity of this solution is O(n2)
*
* Solution 2:
* We can Use Hashing to solve this in O(n) time on average. 
* The idea is to traverse the given array from right to left and update the minimum index whenever we find an element that has been visited on right side. 
*/

class FirstRepeatingElement{

   static void printFirstRepeating(int arr[]) { 
        // Initialize index of first repeating element 
        int min = -1; 
  
        // Creates an empty hashset 
        HashSet<Integer> set = new HashSet<>(); 
  
        // Traverse the input array from right to left 
        for (int i=arr.length-1; i>=0; i--) 
        { 
            // If element is already in hash set, update min 
            if (set.contains(arr[i])) 
                min = i; 
  
            else   // Else add element to hash set 
                set.add(arr[i]); 
        } 
  
        // Print the result 
        if (min != -1) 
          System.out.println("The first repeating element is " + arr[min]); 
        else
          System.out.println("There are no repeating elements"); 
    } 
  
    // Driver method to test above method 
    public static void main (String[] args) throws java.lang.Exception 
    { 
        int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
        printFirstRepeating(arr); 
    } 

}
