/**
* https://www.naukri.com/code360/problems/frog-jump_3621012
*/

// Mistake: GreedyApproach won't work
// This fails for i/p:
//Eg: 30 10 60 10 60 50
//If we use greedy approach,o/p-> 60
//Actual answer is 40.
   public static int frogJump(int n, int heights[]) {
        int[] minTotalEnergy = new int[1];
        frogJump(n, heights, minTotalEnergy);
        return minTotalEnergy[0];
    }

    public static void frogJump(int n, int heights[], int[] minTotalEnergy) {
        if(n==1) {
            return;
        }
        if(n==2) {
            minTotalEnergy[0] = minTotalEnergy[0] + Math.abs(heights[1]-heights[0]);
            return;
        }
        int energyLost1 = Math.abs(heights[n-1]-heights[n-2]);
        int energyLost2 = Math.abs(heights[n-1]-heights[n-3]);
        
        if(energyLost1 <= energyLost2){
            minTotalEnergy[0] =  minTotalEnergy[0] + energyLost1;
            frogJump(n-1,heights,minTotalEnergy);
        }else{
            minTotalEnergy[0] =  minTotalEnergy[0] + energyLost2;
            frogJump(n-2, heights, minTotalEnergy);
        }
    }

 // Approach 1: BackTracking
// Find all possible ways and consider the minimum.
public static int frogJump(int n, int heights[]) {
        int minTotalEnergy = 0;
        List<Integer> allPossibleWays = new ArrayList<>();
        frogJump(n, heights, minTotalEnergy, allPossibleWays);
        return allPossibleWays.stream().min(Integer::compareTo).get();
    }

    public static void frogJump(int n, int heights[], int minTotalEnergy,List<Integer> allPossibleWays) {
        if(n==1) {
            allPossibleWays.add(minTotalEnergy);
            return;
        }
        if(n==2) {
            minTotalEnergy = minTotalEnergy + Math.abs(heights[1]-heights[0]);
            allPossibleWays.add(minTotalEnergy);
            return;
        }

        int energyLost1 = Math.abs(heights[n-1]-heights[n-2]);
        frogJump(n-1,heights,minTotalEnergy+energyLost1,allPossibleWays);

        int energyLost2 = Math.abs(heights[n-1]-heights[n-3]);
        frogJump(n-2, heights, minTotalEnergy+energyLost2,allPossibleWays);
    }

// Approach 2: Recursive
public static int frogJump(int n, int heights[]) {
        if(n==1) return 0;
        if(n==2) return Math.abs(heights[1]-heights[0]);      
        
        int step1Enrg = frogJump(n-1, heights)+Math.abs(heights[n-1]-heights[n-2]);
        int step2Enrg = frogJump(n-2, heights)+Math.abs(heights[n-1]-heights[n-3]);

        return Math.min(step1Enrg, step2Enrg);
    }

//Approach 3: Memorization
public static int frogJump(int n, int heights[]) {
       int[] dp = new int[n];
       Arrays.fill(dp,-1);
       frogJump(n, heights, dp);
       return dp[n-1];
    }

    public static int frogJump(int n, int heights[], int[] dp) {
        if(n==1) return dp[0] = 0;
        if(n==2) return dp[1] = Math.abs(heights[1]-heights[0]);  

        if(dp[n-1]!=-1) return dp[n-1];
        
        int step1Enrg = frogJump(n-1, heights)+Math.abs(heights[n-1]-heights[n-2]);
        int step2Enrg = frogJump(n-2, heights)+Math.abs(heights[n-1]-heights[n-3]);

        return dp[n-1] = Math.min(step1Enrg, step2Enrg);
    }

// Approach 4:Tabulation
public static int frogJump(int n, int heights[]) {
       int[] dp = new int[n];
       Arrays.fill(dp,-1);
       dp[0] = 0;
       dp[1] = Math.abs(heights[1]-heights[0]); 

       for(int i=2;i<n;i++){
           int first = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
           int second = dp[i-2]+Math.abs(heights[i]-heights[i-2]);
           dp[i] = Math.min(first,second);
       }
       return dp[n-1];
    }


