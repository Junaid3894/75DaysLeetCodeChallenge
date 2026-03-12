class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indI=-1;
        int indJ=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    indI=i;
                    indJ=j;
                    break;
                }
                    
            }
        }
        return new int[]{indI,indJ};
    }
}