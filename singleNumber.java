class Solution {
    public int singleNumber(int[] nums) {
        int num = nums[0]; //int variable with num[0] value
        for (int i = 1; i < nums.length; i++) {num ^= nums[i];} // Used XOR
        return num; //return Array
    
    }
}

