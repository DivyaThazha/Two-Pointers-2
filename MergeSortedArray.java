class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length -1;
        int i = m -1;
        int j = n -1;
        while(i >=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index --;
        }

        while(i >= 0){
            nums1[index] = nums1[i];
            i--;
            index--;
        }

        while(j >= 0){
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }
}