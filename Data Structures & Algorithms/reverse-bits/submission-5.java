class Solution {
    public int reverseBits(int n) {
        int RNum = 0;
        for(int i=0; i<32; i++){
            if((n&1)==1){
                RNum = RNum << 1; //shift left 0
                RNum = RNum | 1; //or1 
            }
            RNum = RNum << 1; //shift left 0
            n = n >> 1;
        }
        return RNum;
    }
}
