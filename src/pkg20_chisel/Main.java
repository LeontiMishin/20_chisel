
package pkg20_chisel;

import java.util.Random;


/**
 *
 * @author Leonti
 */
public class Main {

    public static void main(String[] args) {
    int i=0,p=0,v=1;
    double sum = 0.0;
    
    int[] nums;
    nums=new int[20];
    
    while(i<20){
        int max = 500, min = 1, t=1;
        Random random = new Random();
        int number = random.nextInt(max-min+1)+min;
        if (number % 2 == 1) {
            int number2 = number+t;
            System.out.println(number2);
            nums[p]=number2;
            sum+=number2;
        }else{
            System.out.println(number);  
            nums[p]=number;
            sum+=number;
    }
        i=i+1;
        p=p+1;
    }
        
        
    int min, max;
    min = max = nums[0];

    for (int n = 1; n < 10; n++) {
        if (nums[n] < min)
            min = nums[n];
        if(nums[n] > max){
            max = nums[n];
        }
    }
    System.out.println("min is: " + min + "; max is: " + max);
    
    
    double srednee=(sum-min-max)/18;
    System.out.println();
    System.out.println("srednee znachenie (bez min i max): "+srednee);
}
    
}
