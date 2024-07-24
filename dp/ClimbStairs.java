/**
* You are climbing a staircase. It takes n steps to reach the top.
* Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
* https://leetcode.com/problems/climbing-stairs/description/
*/
class climbStairs(){

  // Approach 1: Recursion
  // T:0(2^N), S:0(N)
  public int climbStairsUsingRecursion(int n){
     if(n==0||n==1) return 1;
     return climbStairsUsingRecursion(n-1)+climbStairsUsingRecursion(n-2);
  }

 // Approach 2: Using Memorization. Top to Bottom approach
 // T:0(N), S:0(N)(for stack space) + 0(N)(for array) = 0(N)
  public int climbStairs(int n) {
           int[] dp = new int[n+1];
           Arrays.fill(dp,-1);
           return climbStairs(n, dp);
   }
   public int climbStairs(int n,int[] dp) {
         if(n==0||n==1) return 1;
         if(dp[n]!=-1) return dp[n];

         return dp[n] = climbStairs(n-1, dp)+climbStairs(n-2, dp);  
    }

 // Approach 3: Tabulation. Bottom to up approach
  //T:0(N), S:0(N). Reduced recursive stack space.
  public int climbStairs(int n) {
           int[] dp = new int[n+1];
           dp[0]= 1;
           dp[1] = 1;
           for(int i=2;i<=n;i++){
              dp[i] = dp[i-1]+dp[i-2];
           }
         return dp[n];
      }

  // Approach 4: Iterative
  // T:0(N), S:0(1)
 public int climbStairs(int n) {
        if(n==0||n==1) return 1;
         int first = 1;
         int second = 1;
         for(int i=2;i<=n;i++){
           int third  = first +second;
           first = second;
           second = third;
         }

         return second;
    }
}

