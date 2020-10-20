/**
* Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is * always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
*
* Reference: https://www.geeksforgeeks.org/leaders-in-an-array/
**/
public class LeadersInArray{
   
   /**
   * Use two loops. The outer loop runs from 0 to length – 1 and one by one picks all elements from left to right. The inner loop compares the picked element to all    * the elements to its right side. If the picked element is greater than all the elements to its right side, then the picked element is the leader.
   * Time complexity :0(n*2)
   **/
   public int[] solution(int[] arr){
     List<Integer> leaders = new ArrayList<>();
     for(int outer=0;outer< arr.length;outer++){
       for(int inner = outer+1; inner < size; inner++){
          if(arr[outer]< arr[inner]){
            break;
          }
       }
       //The loop didn't break.
       if(inner == size){
          leaders.add(arr[outer]);
       }
     }
     return leaders.stream().mapToInt(i->i).toArray();
   }
   
   /**
   * Scan all the elements from right to left in an array and keep track of maximum till now. When maximum changes its value, print it.
   * Time Complexity : 0(n)
   */
   
   public int[] optimizedSolution(int[] arr){
    List<Integer> leaders = new ArrayList<>();
    int max_element_from_right = arr[arr.length-1];
    leaders.add(max_element);
    for(int index =  arr.length-2;index>=0;index--){
      int element = arr[index];
      if(element > max_element_from_right){
         max_element_from_right = element;  
         leaders.add(element);
      }
    }
    return leaders.stream().mapToInt(i->i).toArray();
   }
   
   
}
