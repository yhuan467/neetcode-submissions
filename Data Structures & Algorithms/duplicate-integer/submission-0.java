class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int[] nums2 = Arrays.copyOf(nums,n);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums2[j]){
                    return true;
                }
            }
        }
        return false;
    }
}