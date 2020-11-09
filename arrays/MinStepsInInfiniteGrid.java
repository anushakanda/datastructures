
/*
* Given an infinite grid, initial cell position (x, y) and a sequence of other cell position which needs to be covered in the given order.
* The task is to find the minimum number of steps needed to travel to all those cells.
*
* Reference: https://medium.com/solvingalgo/how-to-solve-algorithmic-problems-minimum-number-of-steps-in-an-infinite-grid-f6cd3df17e3
*/

public class Solution {
    //A contains x points, B contains Y points
    public int coverPoints(int[] A, int[] B) {
        int x_currentPosition = A[0];
        int y_currentPosition = B[0];
        
        int minSteps = 0;
        for(int i = 1;i <A.length ; i++){
            int x_nextPosition = A[i];
            int y_nextPosition = B[i];
            minSteps  +=  Math.max(Math.abs(x_nextPosition - x_currentPosition),Math.abs(y_nextPosition-y_currentPosition));

            x_currentPosition = x_nextPosition;
            y_currentPosition = y_nextPosition;
            
        }
        
        return minSteps;
    }
}
