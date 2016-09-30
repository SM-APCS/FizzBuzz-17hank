/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Kaden Han
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<101; i++)
            
           // For numbers 1 through 100
        {
            if (i%15==0)
            {
                System.out.println("FizzBuzz");
                // prints FizzBuzz if its divisible by 15
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
                // prints Buzz if its divisible by 5
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
                // prints Fizz if its divisible by 3
            
            }
            else
            {
                System.out.println(i);
                // prints the number if its not divisible by 5 or 3
            }
        }
    }
    
}
