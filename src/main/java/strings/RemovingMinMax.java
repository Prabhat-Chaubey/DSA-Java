package strings;

import java.util.Arrays;
import java.util.OptionalInt;

import static java.lang.Math.min;

public class RemovingMinMax {
    public static void main(String[] args) {
        RemovingMinMax object = new RemovingMinMax();
        int[] nums = {2,10,7,5,4,1,8,6};
        int answer = object.minimumDeletions(nums);
        System.out.println(answer);


    }
    public int minimumDeletions(int[] nums) {
        //wehyave to find the minimum and the maximus with index
        OptionalInt minimum = Arrays.stream(nums).min();
        OptionalInt maximum = Arrays.stream(nums).max();
        int answer  =0 ;
        int min = minimum.getAsInt();
        int max = maximum.getAsInt();
        System.out.println(min);
        System.out.println(max);
        int locationofMinmum = 0;
        int locationofMaximum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==min){
                locationofMinmum = i;
            }
            if(nums[i] == max){
                locationofMaximum = i;
            }
        }
        int formax = min(locationofMaximum+1,nums.length-locationofMaximum);
        System.out.println(formax);
        int formin = min(locationofMinmum+1,nums.length-locationofMinmum);
        System.out.println(formin);

        if(formax < nums.length && formin <nums.length){
            answer = min(formax,formin) + Math.abs(formax-formin);
            System.out.println("both are small");
        }else if(formax > nums.length && formin >nums.length){
                answer = min(formax,formin) + Math.abs(formax-formin);
            System.out.println("both are big");
        }else{
            answer  = formax + formin;
            System.out.println("its mixed");
        }
        return answer;
    }
}
