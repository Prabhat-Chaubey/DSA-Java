package strings;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,0,1};
        SortColors object = new SortColors();
        int[] answer = object.sortColors(nums);
        for(int x:answer){
//            System.out.println(x);
        }
        System.out.println(answer);
    }
    public int[] sortColors(int[] nums) {
        for(int i =0 ; i< nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println(nums[i]);
        }
        return nums;
    }
}
