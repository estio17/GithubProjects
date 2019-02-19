package template;

import java.lang.reflect.Array;
import java.util.Arrays;

public class example{

    public static  boolean isPresent(int n, int [] numbers){
        for (int i:numbers) {
            if (n == i){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args){
        int [] numbers1 = new int[8];
        int [] numbers2 = new int[]{8,7,6,5,4,3,2,1};

        for (int i=0; i< numbers1.length;i++){
            numbers1[i]= i;
        }
        /*for (int i=numbers2.length; i > 0 ;i--){
            numbers2[i]= i;
        }*/

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        for (int num: numbers2) {
            if (!isPresent(num,numbers1)){
                System.out.println("missing number: " + num);
                break;
            }
        }

    }

}
