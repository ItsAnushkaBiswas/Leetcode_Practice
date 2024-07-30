class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0; i<nums.length; i++){
            int num1 = nums[i];
            int num2 = target - num1;
            if(hm.containsKey(num2)){
                int[] arr = {hm.get(num2),i};
                return arr;
            }
            hm.put(nums[i],i);
        }
        return null;
        
    }
}