class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numsH = new HashMap<> ();
        //look up the value more so put value first as key
        for(int i=0; i<nums.length; i++){
            numsH.put(nums[i], i);
        }

        //用減法去找
        int pairValue = 0;
        for(int i=0; i<nums.length; i++){
            pairValue = target - nums[i];
            if(numsH.containsKey(pairValue)){
                int[] 2SumKey = new int[]{numsH.get(pairValue),i};
                return(Arrays.sort(2SumKey));
            }
        }
        return new int[]{-1,-1};
    }
}
