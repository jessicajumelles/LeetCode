class Solution {
    public int pivotIndex(int[] nums) {
        
        //declare variable needed
        int leftSum=0;
        int totalSum=0;
        int rightSum = 0;
        
        //Get the total sum
        for(int i=0; i<nums.length; i++) {
            
            totalSum += nums[i];
        }
        
        /*get values for right and lef
            right = total - left - nums[i] 
            if left == right return i
            left = left + num[i]
            if no index exist return -1
            */
        for(int i=0; i<nums.length; i++) {
            
            rightSum = totalSum - leftSum - nums[i];
            
            if(leftSum == rightSum) {
                return i;
            }
            
            leftSum+=nums[i];
        }
        
        return -1;
        
        
        
    }
}