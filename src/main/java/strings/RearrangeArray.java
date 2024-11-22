package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        RearrangeArray object = new RearrangeArray();
        int[] input = {3,1,-2,-5,2,-4};
        int[] answer = object.rearrangeArray(input);
        for(int x:answer){
            System.out.println(x);
        }
    }
    public int[] rearrangeArray(int[] nums) {
//        int[] positive = new int[nums.length/2];
        ArrayList<Integer> postive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int x:nums){
            if(x<0){
                negative.add(x);
            }else{
                postive.add(x);
            }
        }
        RearrangeArray object = new RearrangeArray();
        int[] answer = object.mergeit(postive,negative,nums);
        return answer;

    }
    private int[] mergeit(ArrayList<Integer> positive,ArrayList<Integer> negative,int[] nums){
        int size = nums.length;
        System.out.println("length of the array is "+size);
        int i=0;
        int j = 0;
        while (size>0){
            nums[j] = positive.get(i);
            System.out.println(nums[j]);
            j = j + 1;
            nums[j] = negative.get(i);
            System.out.println(nums[j]);
            j=j+1;
            i=i+1;
            size = size-2;
        }

        return nums;
    }

}
