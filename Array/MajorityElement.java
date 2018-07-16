// easy array #169 major> 1/2
class MajorityElement {
    public int majorityElement(int[] nums) {
        // 这是一个十分天才的想法啊，不需要用hashmap 让runtime = O（n） 有点像投票？一样的+1 不一样的-1
        int major = nums[0];
        int count = 1;
        for (int i = 1;i<nums.length;i++){
            if(count==0){
                major = nums[i];
                count++;
            }else if(major == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;



    }
}