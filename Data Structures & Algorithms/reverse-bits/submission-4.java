class Solution {
    public int reverseBits(int n) {
        int RNum = 0;
        if(n != 0){
            if((n&1)==1){
                RNum = RNum << 1; //carry 1
                RNum = RNum | 1;
            }
            RNum = RNum << 1; //shift left 0
            n = n >> 1;
        }
        return RNum;
    }
}
