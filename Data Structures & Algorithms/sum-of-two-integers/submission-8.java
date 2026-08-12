class Solution {
    public int getSum(int a, int b) {
        
        //change a b to binary -> no need to cuz every nums r binary
        //xor function but if its 11 then flip one of the next num

        while((a & b) != 0){
            int carry = (a&b) << 1;
            a = (a^b); //first xor
            b = carry; // 跟carry xor
        }
        
        return (a ^ b);
    }
}
