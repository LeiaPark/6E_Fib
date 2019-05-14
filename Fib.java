/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if( n == 1 || n == 2) { // base case
        	return 1; // base case solution
        }
        else { // recursive case solution
        	return fib_recurrence(n-1) + fib_recurrence(n-2);
        	// recursive abstraction & combination is above
        	// there is no leftovers
        }
    }
     /* These are class methods because there
      * is no need to store an instance variable
      * 
      * Q5. Around 45 is the highest index in the sequence 
      * for which the fib_recurrence is feasible
      */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long num1 = 1;
        long num2 = 1;
        int counter = 3;
        if( n == 1 || n == 2) {
        	return 1;
        }
        else {
        	while( counter <= n) {
        		long temp = num1 + num2;
        		num1 = num2;
        		num2 = temp;
        		counter++;
        	}
        	return num2;
        }
    }
    /* Time complexity:
       Consider the size of the problem to be linear.
       
       As the proxy for the time required, count n.
       
       Then cost of the the recurrence algorithm
       grows linearly 
       as the size of the problem increases,
       because every time you increase n by 1, 
       the time is increased by a constant.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5))/2;
        double psi = 1 - phi;
        return (Math.pow(phi, n) - Math.pow(psi, n))/Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be constant.
       
       As the proxy for the time required, count 1;
       
       Then cost of the the recurrence algorithm
       does not grow 
       as the size of the problem increases,
       because there is only one calculation required
       for any value of n.
     */
}
