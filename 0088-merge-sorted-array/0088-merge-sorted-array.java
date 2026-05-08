class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i < nums2.length; i++){
                nums1[m+i] = nums2[i];
                
            
        }
        // now sort
        for(int i=0; i<nums1.length-1; i++){
            for(int j=i+1; j<nums1.length; j++){
                //Swapping
                if(nums1[i] > nums1[j]){
                int temp=nums1[i];
                nums1[i]=nums1[j];
                nums1[j]=temp;
                }
            }
        }
    }
}