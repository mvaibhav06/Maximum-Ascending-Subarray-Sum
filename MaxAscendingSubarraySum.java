public class MaxAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                sum += nums[i];
            }else{
                if(sum > max){
                    max = sum;
                }
                sum = nums[i];
            }
        }
        return Math.max(sum, max);
    }
}
