/**
 * ACS-1903 Lab 10 Q8
 * @author (your name and student number)
 */
import java.util.ArrayList;
import java.util.Collections;

public class FindRangeKey{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // try some other numbers to ensuer that your solution works
        // for all posssible valid data
        numbers.add(89);
        numbers.add(-66687);
        numbers.add(8675309);  
        numbers.add(32);
        numbers.add(-149);
        numbers.add(5903);
        numbers.add(49); 
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int range = 0;
        
        for(Integer i : numbers){
            largest = Math.max(largest, i);
            smallest = Math.min(smallest, i);
        }
        
        range = largest - smallest;
        System.out.println("The range of values is " + range);
        
        // enter your code here
        
    }
}