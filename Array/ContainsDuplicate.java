// # 217 esay array
/*
for(int i: nums)
===
===

for{int i ; i < arr.length() ; i++ }{
   i = arr[i];
}

===
===
就想python 的for item in list
item 代表list里的元素。
 */
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;


    }
}