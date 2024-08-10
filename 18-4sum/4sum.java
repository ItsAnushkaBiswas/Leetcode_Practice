class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++) {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<nums.length-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1])
                    continue;
                int k = j+1, l = nums.length-1;
                while(k<l) {
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[l]);
                        result.add(ans);
                        k++;
                        while(k<l && nums[k] == nums[k-1]) {
                            k++;
                        }
                    } else if(sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result;
    }
}