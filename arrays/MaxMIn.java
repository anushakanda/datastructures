/**
* Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
* NOTE: You should make minimum number of comparisons.
**/

public class MaxMin{

  /**
  * Linear Approach:
  * Time complexity :0(n)
  * Comparisons: 2n-2
  **/
  public int solve(int[] A){
     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;
        for(int i = 0;i< A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }
        return max+min;
  }
  
  
  
  }
