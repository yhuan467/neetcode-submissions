class Solution {
    public int hammingWeight(int n) {
         //用and 然後看有多少個true 1 return

        int count = 0;

        while(n != 0){
            if((n&1)==1){
                count++;
            }
            n = n >> 1;//shift right 1 bit
        }

        return count;
    }
}
