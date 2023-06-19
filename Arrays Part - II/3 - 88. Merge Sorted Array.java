class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] nums11 = new int[m];

        for(int i=0; i<m; i++){
            nums11[i] = nums1[i];
        }

        int i = 0;

        int j = 0;

        int index = 0;

        while(i<nums11.length && j<nums2.length){
            if(nums11[i]<nums2[j]){
                nums1[index] = nums11[i];
                i++;
                index++;
            }
            else{
                nums1[index] = nums2[j];
                j++;
                index++;
            }
        }

        while(i<nums11.length){
            nums1[index] = nums11[i];
            i++;
            index++;
        }

        while(j<nums2.length){
            nums1[index] = nums2[j];
            j++;
            index++;
        }

    }

}
