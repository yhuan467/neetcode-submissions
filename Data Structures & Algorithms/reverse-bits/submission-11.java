class Solution {
    public int reverseBits(int n) {
        int RNum = 0;
        for(int i=0; i<32; i++){
            RNum = RNum << 1; //shift left 0
            if((n&1)==1){
                RNum = (RNum | 1); //or1
            }
            n = (n >> 1);
        }
        return RNum;
    }
}
