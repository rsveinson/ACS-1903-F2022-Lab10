/**
 * ACS-1903 Lab 10 Q8
 * @author (your name and student number)
 */

import java.util.ArrayList;
import java.util.Collections;

public class InventoryCheckKey{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();        
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        Collections.addAll(names, "pen", "pencil", "scissors", "eraser", "notebook");
        Collections.addAll(prices, 1.25, 0.99, 2.59, 0.50, 1.00);
        Collections.addAll(quantities, 10, 0, 0, 5, 3);
        
        // add your code here
        ArrayList<Integer> order = new ArrayList<>();
        
        for(int i = 0; i < quantities.size(); i++){
            if(quantities.get(i) == 0){
                order.add(i);
            }// end add a 0 quantity
        }// end look for orders
        
        for(int i = 0; i < order.size(); i++){
            System.out.print(names.get(order.get(i)) + " $");
            System.out.println(prices.get(order.get(i)));
        }
    }
}
