// Array #1 Esay
//O(n^2)  O(n) 可以用hash map
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //int[] temp= {0,1};
        //return temp;
        int[] temp = {0};
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int t = target - nums[i];
            for(int j =0;j<nums.length;j++){
                if(nums[j] == t && j!=i){
                    int[] result = {i,j};
                    return result;
                }
            }
        }

        return temp;
    }
}