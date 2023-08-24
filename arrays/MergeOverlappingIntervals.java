/**
* Given a collection of intervals, merge all overlapping intervals.
* Example Input
* Input 1:
* [1,3],[2,6],[8,10],[15,18]
* Example Output
* Output 1:
* [1,6],[8,10],[15,18]
/**

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
       Collections.sort(intervals,(i1,i2)-> i1.start-i2.start );
       ArrayList<Interval> mergedIntervals = new ArrayList<>();
       Interval currentInterval = intervals.get(0);
       for(int index=1;index<=intervals.size()-1;index++){
            Interval next = intervals.get(index);
           if(currentInterval.end>=next.start){
               currentInterval.end = Math.max(currentInterval.end,next.end);
           } else{
               mergedIntervals.add(currentInterval);
               currentInterval = next;
           }
       }
       mergedIntervals.add(currentInterval);
       
       return mergedIntervals;
    }
}
