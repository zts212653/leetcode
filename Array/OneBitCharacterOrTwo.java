// Array esay 717
// 判断解码的最后一位是单还是双，思路是看除了最后一位之外的最后一个0落在哪儿
// 如果那个0 落在倒数第一（除开最后一位的倒数第一）这是倒数的奇数，那么最后一位
// 若是0解码肯定是 one bit 反之如果在偶数则可能是two bit
class OneBitCharacterOrTwo {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if (len==1){
            return true;
        }else{
            int temp =len-2;
            while(temp>=0){
                if(bits[temp]==0){
                    break;
                }
                temp--;
            }


            return (len-1-temp)%2==0? false:true;
        }




    }





}