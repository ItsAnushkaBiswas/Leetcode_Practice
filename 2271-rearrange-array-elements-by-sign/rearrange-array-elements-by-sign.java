class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[]= new int[nums.length];
        int posindex=0, negindex=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                result[posindex]=nums[i];
                posindex=posindex+2;;
            }
            else{
                result[negindex]=nums[i];
                negindex=negindex+2;
            }
        }
        return result;    
    }
}