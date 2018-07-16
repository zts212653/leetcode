// O(n) #53 esay array
class MaxSubString {
    public int maxSubArray(int[] nums) {
        int state = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length;i++){
            state = Math.max(nums[i],nums[i]+state); // to see if need to use previous nums
            max = Math.max(max,state); // to see if use new state links to cover max
        }

        return max;

    }
}