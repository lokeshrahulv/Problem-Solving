# TOPIC: 
Max Consecutive Ones
# STATEMENT:
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:Input: nums = [1,1,0,1,1,1] Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:Input: nums = [1,0,1,1,0,1] Output: 2
# ALGORITHM:
## Step-1: Initialize variables:
-> maxCount = 0 → Stores the maximum number of consecutive 1s found so far.
-> currentCount = 0 → Tracks the count of consecutive 1s while traversing the array.

## Step-2: Traverse the array:
-> If the current element is 1, increment currentCount.
-> If the current element is 0, update maxCount (if currentCount is greater), then reset currentCount to 0.

## Step-3: Update maxCount at the end:
After finishing the loop, compare currentCount with maxCount (handles cases where the last element is 1).

## Step-4:
Return maxCount as the result.
# PROGRAM:
```
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
```
# OUTPUT:
