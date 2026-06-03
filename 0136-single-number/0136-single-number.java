class Solution {
    public int singleNumber(int[] nums) {
        int freq;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            freq = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i] == nums[j] && i !=j) {
                    freq++;
                }

            }
            if (freq == 0)
                return nums[i];

        }
        return -1;
    }
}