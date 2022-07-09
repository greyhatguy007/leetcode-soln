public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
            if (left.containsKey(nums[i])){
                if (i - left.get(nums[i])<= k){
                    return true;
                }
            }
            left.put(nums[i], i);
        }//for i
        return false;
    }
}