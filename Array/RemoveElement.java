// Array easy #27
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
}