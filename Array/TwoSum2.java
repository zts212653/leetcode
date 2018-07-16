// O(n) 不用hashmap 用两个指针。 array easy #167
class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int indexLeft = 0;
        int indexRight = numbers.length-1;
        int[] ans = new int[2];


        while(true){
            if(numbers[indexLeft]+numbers[indexRight]>target){
                indexRight--;
            }else if(numbers[indexLeft]+numbers[indexRight]<target){
                indexLeft++;

            }else{
                ans[0] = indexLeft+1;
                ans[1] = indexRight+1;
                return ans;
            }

        }

    }
}