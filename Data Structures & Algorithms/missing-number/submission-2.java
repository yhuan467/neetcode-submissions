class Solution {
    public int missingNumber(int[] nums) {
        //如果長度不對 那就是幾個missing? 
        int missingNum = 0;
        for(int i=0; i<=n; i++){
            if(nums[i] != i){
                missingNum = i;
            }
        }
        return null;
    }
}
