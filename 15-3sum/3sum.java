class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //First sorting the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i<=nums.length-2;i++){
            // check if the next elements are not same to avoid duplicate sol
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> ans = new ArrayList();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    result.add(ans);
                    j++;
                //skip duplicates
                while(nums[j]==nums[j-1]&&j<k)
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return result;
        
    }
}