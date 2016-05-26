/*
 * Given string A representative a positive integer which has N 
 * digits, remove any k digits of the number, the remaining digits 
 * are arranged according to the original order to become a new 
 * positive integer.

Find the smallest integer after remove k digits.

N <= 240 and k <= N,

Example
Given an integer A = "178542", k = 4

return a string "12"
 */
public class DeleteDigits {

    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        String result = "";
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < A.length && k > 0; ++i) {
            if (i == 0) {
                stack.push(A.charAt(i) - '0');
            } else {
                
            }
        }
    }

}