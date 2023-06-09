package ArraysSection.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNValues = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return sumOfNValues - actualSum;
    }
}
