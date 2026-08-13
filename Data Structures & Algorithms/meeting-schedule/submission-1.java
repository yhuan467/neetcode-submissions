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
        intervals = List.sort(intervals);

        //compared first list end and second list start
        for(int i=0; i < intervals.length; i++){
            if(List[i].end > List[i+1].start){
                return false;
            }
        }
        return true;
    }
}
