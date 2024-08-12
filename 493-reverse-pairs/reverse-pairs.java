class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);   
    }
    private int mergeSort(int[] nums,int lo, int hi){
        if(lo>=hi) return 0;
        int count=0;
        int mid=lo+(hi-lo)/2;
        count += mergeSort(nums,lo,mid);
        count += mergeSort(nums,mid+1,hi);
        count += merge(nums,lo,mid,hi);
        return count;
    }
    private int merge(int[] nums, int lo, int mid, int hi){
        int count=0;
        int[] a=new int[hi-lo+1];
        int index=0;
        int p=lo, q=mid+1;
        while(p<=mid && q<=hi){
            if((long)nums[p]>(long)2*nums[q]){
                count += mid-p+1;
                q++;
            }
            else{
                p++;
            }
        }
        p=lo;
        q=mid+1;
        while(p<=mid && q<=hi){
            if(nums[p]>nums[q]){
                a[index++]=nums[q++];
            }
            else{
                a[index++]=nums[p++];
            }
        }
        while(p <= mid){
            a[index++]=nums[p++];
        }
        while(q <= hi){
            a[index++]=nums[q++];
        }
        System.arraycopy(a,0,nums,lo,hi-lo+1);
        return count;


    }
}