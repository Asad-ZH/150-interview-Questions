class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1, temp = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(temp != nums[i]) {
                temp = nums[i];
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}