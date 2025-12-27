class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0; 
        int end = nums.length-1;
        while(start <= end){
            int i = start + (end - start)/2;
            if(target == nums[i]){
                return i;
            }else if(target > nums[i]){
                start = i+1;
            }else{
                end = i-1;
            }
        }
        return start;
    }
}