package leetcode;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int cur_sum = 0;
        for(int i=0; i<nums.length; i++) {
            cur_sum = Integer.max(nums[i], cur_sum + nums[i]);
            answer = Integer.max(answer, cur_sum);
        }

        return answer;
    }
}
