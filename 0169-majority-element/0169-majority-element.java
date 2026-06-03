class Solution {
    public int majorityElement(int[] nums) {
        //int freq =0;
        for(int i = 0; i<nums.length; i++){
            int freq = 1;
            for(int j = i+1 ; j<nums.length; j++){
                if(nums[i] == nums[j])
                    freq++;
                
            }
            if(freq > nums.length/2)
                return nums[i];
        }
        return -1;
    }
}