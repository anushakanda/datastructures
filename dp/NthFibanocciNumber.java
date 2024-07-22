/**
*  Fibanocci series :0 Indexed: 0 ,1 ,1,2,3,5,8,13,...
*
* Approaches: Recursion -> Memorization -> Tabulation -> Iteration
* Time Complexity: 0(2^N) -> 0(N) -> 0(N) -> 0(N)
* Space Complexity: 0(N) -> 0(2N) +0(N)-> 0(1)
* Edge Cases:
* - Negative Integers, 0, 1, Very large numbers(overflow) , consider long or BigInteger
*/

public class NthFibanocciNumber{

  // Approach 1: Recursion
  // T:0(2^N), S:0(N)
  public static int fibonacciUsingRecursion(int n) {
      if (n <= 1) return n;
      return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // Approach 2: Using Memorization. Top to Bottom approach
  // T:0(N), S:0(N)(for stack space) + 0(N)(for array) = 0(N)
  public static int fibanacciUsingMemorization(int n,int[] dp){
    //dp is of size n+1 initialized with -1 values.
    if(n<=1) return n;
    if(dp[n]!= -1) return dp[n];
    return dp[n]= f(n-1,dp) + f(n-2,dp);
  }

  // Approach 3: Tabulation. Bottom to up approach
  //T:0(N), S:0(N). Reduced recursive stack space.
  public static int fibonacciUsingTabulation(int n) {
      if (n <= 1) return n;
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      dp[0]= 0;
      dp[1]= 1;
  
      for(int i=2; i<=n; i++){
          dp[i] = dp[i-1]+ dp[i-2];
      }
  }

  // Approach 4: Iterative
  // T:0(N), S:0(1)
  public static int fibanocciUsingIterative(int n){
    if (n <= 1) return n;
    int first = 0;
    int second = 1;
    int third;
    for(int i=2;i<n;i++){
      third = first + second;
      first = second;
      second = third;
    }

    return third;
  }

}
