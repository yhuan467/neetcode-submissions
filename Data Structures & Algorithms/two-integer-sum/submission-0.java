class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numsH = new HashMap<> ();
        for(int i=0; i<nums.length; i++){
            numsH.put(i, nums[i]);
        }

        //用減法去找
        int pairValue = 0
        for(int i=0; i<nums.length; i++){
            pairValue = target - nums[i];
            if(numsH.contains(pairValue)){
                return([numsH(pairValue),numsH(nums[i])]);
            }
        }
        return[0,0];
    }
}
