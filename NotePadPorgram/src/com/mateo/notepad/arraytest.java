package src.com.mateo.notepad;


/**
 * Write a description of class arraytest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arraytest{
    public static void main(String[] args){
     
        double[] nums = new double[]{22.5,18.2,35.0,21.4,46.9}; // initialize temp array
        double sum = 0;
        double average = 0.0;
        for (int x=nums.length-3; x<=nums.length-1; x++){ // start from last element
            sum = sum + nums[x];
        }
        //System.out.println(sum);
        average = sum/3; // sum of the last three elements divided by 3
        System.out.println(average);
    }
}