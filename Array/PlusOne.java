// Easy #66 array
class PlusOne {
    public int[] plusOne(int[] digits) {
        //int temp = 1;

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1<10){
                digits[i] = digits[i]+1;
                return digits;
            }else{
                digits[i] = 0;
                if (i == 0){
                    int[] ans = new int[digits.length+1];
                    System.out.println(ans[1]);
                    ans[0] =  1; // only 999 would need add another digit and ini[] is all 0
                    return ans;

                }

            }

        }
        return digits;

    }
}