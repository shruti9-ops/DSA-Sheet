26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       
       int p = 1;
       for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[p-1]){
                nums[p] = nums[i];
                p++;
            }
       } 
       return p;
    }
}
