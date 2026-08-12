class Solution {
    public int missingNumber(int[] nums) {
        //如果長度不對 那就是幾個missing? 
        int n = nums.length;
        for(int i=0; i<=n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return 0;
    }
}
