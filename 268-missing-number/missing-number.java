class Solution {
    public int missingNumber(int[] nums) {
        int miss=0;
        int n=nums.length;
      
    
        for(int i=0;i<nums.length;i++){
            miss+=nums[i]-i;
            
              
         
        }
        return  n -miss;    
    }
}