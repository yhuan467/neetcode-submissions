class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> prevMap = new HashMap<> ();

        //先查再存
        //這樣就不用多比較重複了
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; //先減法出來
            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i); //再存
        }

        return new int[]{-1,-1};
    }
}
