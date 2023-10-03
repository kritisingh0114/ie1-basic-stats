import java.util.ArrayList;
import java.util.Collections;


public class MinMaxCalculation extends Numbers {

    public static void main(String[] args){
        Numbers class_numbers = new Numbers();
        ArrayList<Double> arr_num = class_numbers.numbers;
        calcMinMax(arr_num);
    }

	public static void calcMinMax(ArrayList<Double> numbers) {
        double[] nums = BasicStats.getArrayDouble(numbers);
        double max = nums[0];
        double min = nums[0];
        for (int i  = 1; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
            }
            if (min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

//hey brucey
