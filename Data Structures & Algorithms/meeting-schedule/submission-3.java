/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //first sort the List based on their start
        //用一個lambda告訴它「依照start由小到大排序」。因為是直接在原list上排序,也不需要再賦值回去(不用 intervals = ...)
        intervals.sort((a,b) -> a.start - b.start);

        //compared first list end and second list start
        //.length -> array
        for(int i=0; i < intervals.size()-1; i++){
            if(intervals.get(i).end > intervals.get(i+1).start){
                return false;
            }
        }
        return true;
    }
}
