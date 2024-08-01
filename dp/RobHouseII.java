/**
* https://www.naukri.com/code360/problems/house-robber_839733
*
* Mr. X is a professional robber planning to rob houses along a street. Each house has a certain amount of money hidden.
* All houses along this street are arranged in a circle. That means the first house is the neighbour of the last one. 
* Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses are broken into on the same night.
*/

public static long houseRobber(int[] valueInHouse) {
		// Write your code here.
		int n = valueInHouse.length;
		if(n==1) return valueInHouse[0];
		
		//Cannot rob first house
		int[] withoutFirstHouse = Arrays.copyOfRange(valueInHouse, 1, n);
		long robLastHouse = houseRobber(n-2,withoutFirstHouse);

		//Cannot rob last house
		int[] withoutLastHouse = Arrays.copyOfRange(valueInHouse, 0, n-1);
    long robFirstHouse = houseRobber(n-2,withoutLastHouse);

    return Math.max(robLastHouse, robFirstHouse);
	}	

	static long houseRobber(int index,int[] valueInHouse){

		int n = valueInHouse.length;
		if(index==0) return valueInHouse[0];
		if(index<0 ) return 0;
		long robHouse = valueInHouse[index]+houseRobber(index-2,valueInHouse);
		long noRobHouse = 0+houseRobber(index-1, valueInHouse);

		return Math.max(robHouse,noRobHouse);
	}
