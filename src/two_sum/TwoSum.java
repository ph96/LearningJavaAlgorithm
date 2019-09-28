package two_sum;

/**
 *
 */
public class TwoSum {
    /**
     *  返回随机整数数组nums中两数之和为目标值target的索引值</br>
     *  如果未找到任意两数之和为目标值target则返回null
     * @param nums  随机整数数组
     * @param target  目标值
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    //System.out.println("["+i+","+j+"]");
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
