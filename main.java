public boolean firstLast6(int[] nums) {
  int length = nums.length;
  boolean isItSix;
  int firstNum = nums[0];
  int lastNum = nums[nums.length-1];
  if(nums[0] != 6 && nums[nums.length-1] != 6) {
    isItSix = false;
  } else {
    isItSix = true;
  }
  return isItSix;
}
// Checks if first or last number is six.
