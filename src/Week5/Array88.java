package Week5;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; //pointer for nums1 and pointed at the last value element
        int j = n-1; // pointer for nums2 and pointed at the last value element
        int k = m+n -1; //pointer for nums1 and pointed at the last element

        while(i >= 0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}