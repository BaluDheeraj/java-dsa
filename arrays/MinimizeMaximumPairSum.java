class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length;
        int left=0;
        int right=k;
        int max=0;
        int localmax=0;
        while(left <right){
            localmax=nums[left]+nums[right-1];
            max=Math.max(max,localmax);
            left++;
            right--;


        }
        return max;
        
    }
}
