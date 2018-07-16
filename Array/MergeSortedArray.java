// merge sort里merge的部分 Easy, #88
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        //O(nlogn)
        for (int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        //System.arraycopy(nums1, 0, nums1, 0, m+n);

        Arrays.sort(nums1);
        //return nums1;
        */

        // O(n)

        int index = m+n-1;
        m--;
        n--;

        while(n>=0){
            // copy nums2 if nums2 > nums1 or nums1 finish
            if (m<0||nums2[n]> nums1[m]){
                nums1[index--] = nums2[n--];
            }else{
                nums1[index--] = nums1[m--];
            }

        }

    }
}