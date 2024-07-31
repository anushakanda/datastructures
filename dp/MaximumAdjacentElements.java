/**
* https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261
*
* You are given an array/list of ‘N’ integers. 
* You are supposed to return the maximum sum of the subsequence with the constraint that no two elements are adjacent in the given array/list.
* Note:
* A subsequence of an array/list is obtained by deleting some number of elements (can be zero) from the array/list, leaving the remaining elements in their original order.
**/
public class MaximumAdjacentElements{

  
  public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		return maximumNonAdjacentSumUsingRecursion(nums.size()-1,nums);

    int[] dp = new int[nums.size()];
		Arrays.fill(dp,-1);
		return maximumNonAdjacentSum(nums.size()-1,nums, dp);
	}

  //Approach1: Using recursion
  //pick no pick concept
  //T:0(2^n) 
	static int maximumNonAdjacentSumUsingRecursion(int index,ArrayList<Integer> nums){
    if(index==0) return nums.get(0);
		if(index<0) return 0;
  		  
    int pickSum = nums.get(index)+maximumNonAdjacentSum(index-2,nums);
		int nonPickSum = 0 + maximumNonAdjacentSum(index-1,nums);

		return Math.max(pickSum,nonPickSum);
	}

  // Approach 2: Using Memorization
  //
  static int maximumNonAdjacentSum(int index,ArrayList<Integer> nums, int[] dp){
    if(index==0) return dp[0] = nums.get(0);
		if(index<0) return 0;
		if(dp[index]!=-1) return dp[index];
  		int pickSum = nums.get(index)+maximumNonAdjacentSum(index-2,nums,dp);
		  int nonPickSum = 0 + maximumNonAdjacentSum(index-1,nums,dp);

		return dp[index] = Math.max(pickSum,nonPickSum);
	}

  // Approach 3: Tabulation
  // T:0(N), S:0(N)
  public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();

		if(n<=0) return 0;
		if(n==1) return nums.get(0);
		
		int[] dp = new int[n];
		Arrays.fill(dp,-1);
		 dp[0] = nums.get(0);
		 dp[1] = Math.max(dp[0], nums.get(1));
		for(int i=2;i<n;i++){
			dp[i] = Math.max(nums.get(i)+dp[i-2] ,0+dp[i-1]);
		}
		return dp[n-1];
	}

  // Approach 4: Space optimization
  public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();

		if(n<=0) return 0;
		if(n==1) return nums.get(0);
		
		 int prev2 = nums.get(0);
		 int prev1 = Math.max(prev2, nums.get(1));
		for(int i=2;i<n;i++){
			 int curr = Math.max(nums.get(i)+prev2 ,0+prev1);
			 prev2=prev1;
			 prev1=curr;
		}
		return prev1;
	}
}
