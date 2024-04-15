public boolean sameFirstLast(int[] nums) {
  boolean areTheyEqual;
  
  if(nums.length >= 1 && nums[0] == nums[nums.length-1]){
    areTheyEqual = true;
  } else {
    areTheyEqual = false;
  }
  return areTheyEqual;
}
