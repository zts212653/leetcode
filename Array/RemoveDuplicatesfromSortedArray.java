// array easy #26
class RemoveDuplicatesfromSortedArray{

    public int removeDuplicates(int[] nums) {
        // When new num occur add
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
                System.out.println(index);

            }
        }
        return index;
    }
}