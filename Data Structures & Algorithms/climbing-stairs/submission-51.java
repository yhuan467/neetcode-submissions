class Solution {
    public int climbStairs(int n) {
        int one = 1; //第0階方法數
        int two = 1; //第1階方法數

        for(int i = 1; i< n; i++){
            int temp = one;
            one = one + two; //前兩階方法數相加就是n階的方法數
            two = temp;
        }

        return one;
    }
}
