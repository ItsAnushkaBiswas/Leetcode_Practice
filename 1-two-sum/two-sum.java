class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twosum = new HashMap();
        for(int i=0; i<nums.length; i++){
            int num1 = nums[i];
            int num2 = target - num1;
            if(twosum.containsKey(num2)){
                int[] arr = {twosum.get(num2),i};
                return arr;
            }
            twosum.put(nums[i],i);
        }
        return null;
        
    }
}