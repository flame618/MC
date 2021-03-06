class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < length; i++)
        {
            int cur = target - nums[i];
            if(map.containsKey(cur))
            {
                return new int[]{i, map.get(cur)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
