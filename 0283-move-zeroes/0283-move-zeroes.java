class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0; // position for non-zero
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                i++;
            }
        }
    }
}