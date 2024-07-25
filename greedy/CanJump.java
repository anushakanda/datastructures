/**
* https://leetcode.com/problems/jump-game/description/
*/

Approach 1: Recursion
public boolean canJump(int[] nums) {
    if(nums.length == 1) return true;
    return canJump(0, nums);
}

boolean canJump(int index,int[] nums){
    if(index==nums.length-1) return true;
    for(int i=0;i<nums[index];i++){
        if(canJump(index+i+1, nums)) return true;
    }

    return false;
}

Approach 
