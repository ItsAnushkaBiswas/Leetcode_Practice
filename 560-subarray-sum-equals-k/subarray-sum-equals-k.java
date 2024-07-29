class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> arry_sums = new HashMap();
        arry_sums.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(arry_sums.containsKey(sum-k)){
                result += arry_sums.get(sum-k);
            }
            arry_sums.put(sum, arry_sums.getOrDefault(sum,0)+1);
        }
        return result;
    }
}