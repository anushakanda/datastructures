/**
* https://www.youtube.com/watch?v=Kmh3rhyEtB8.
* In this question, the frog is allowed to jump up to ‘K’ steps at a time. If K=4, the frog can jump 1,2,3, or 4 steps at every index.
**/

// Approach1: Recursive 
int frogJumpKTimes(int n, int k, int heights[]){
  if(n==1) return 0;

  int minEnergy = Integer.MAX_VALUE;
  for(int index = 1; index<=k;index++){
    if(n-index>1){
     int enegyForIndexStep = frogJumpKTimes(n-index, k, heights) + Math.abs(heights[n-index]-heights[n-1-index]);
      minEnergy = Math.min(minEnergy, energyForIndexStep);
    }
  }

  return minEnergy;
}

//Approaach2: Memorization
int frogJumpKTimes(int n, int k, int heights[],int[] dp){
  if(n==1) return dp[0] = 0;

  if(dp[n-1]!=-1) return dp[n-1];

  int minEnergy = Integer.MAX_VALUE;
  for(int index = 1; index<=k;index++){
    if(n-index>1){
     int enegyForIndexStep = frogJumpKTimes(n-index, k, heights) + Math.abs(heights[n-index]-heights[n-1-index]);
      minEnergy = Math.min(minEnergy, energyForIndexStep);
    }
  }

  return dp[n-1]=minEnergy;
}

// Approach 3: Tabulation
// Function to find the minimum cost to reach the end using at most 'k' jumps
static int solveUtil(int n, int[] height, int[] dp, int k) {
        dp[0] = 0;

        // Loop through the array to fill in the dp array
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            // Loop to try all possible jumps from '1' to 'k'
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1]; // The result is stored in the last element of dp
    }

    // Function to find the minimum cost to reach the end of the array
    static int solve(int n, int[] height, int k) {
        int[] dp = new int[n]; // Initialize a memoization array to store calculated results
        Arrays.fill(dp, -1);
        return solveUtil(n, height, dp, k);
    }
