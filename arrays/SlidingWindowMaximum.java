/**
* Given an array of integers A.  There is a sliding window of size B which 
* is moving from the very left of the array to the very right. 
* You can only see the w numbers in the window. Each time the sliding window moves 
* rightwards by one position. You have to find the maximum for each window. 
/**

public class SlidingWindowMaximum {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int start = 0;
        int end = B-1;
        ArrayList<Integer> output = new ArrayList<>();
        while(start+ B <= A.size() ){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<= end;i++){
            if(A.get(i) > max){
                max = A.get(i);
            }
        }
        output.add(max);
        start = start +1;
        end = end +1;
        }
        return output;
    }
}
