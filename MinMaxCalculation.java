import java.util.ArrayList;
import java.util.Collections;


public class MinMaxCalculation {

    public static void main(String[] args){
        double[] numbers = {10, 12, 16, 20, 25};
        calcMinMax(numbers);
    }

	public static void calcMinMax(double[] numbers) {
        double max = numbers[0];
        double min = numbers[0];
        for (int i  = 1; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}