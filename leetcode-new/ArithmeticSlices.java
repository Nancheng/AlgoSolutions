/*
 *
 */
public class ArithMeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        for (int i = A.length - 3; i < A.length; ++i) {
            if (A[i] + A[i - 2] == 2 * A[i - 1]) {
                result++;
            }
        }
        return result;
    }

}
