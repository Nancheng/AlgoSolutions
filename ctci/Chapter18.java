public class Chapter18 {

    //18.1
    public int addAB(int A, int B) {
        while (B != 0) {
            int carrier = (A & B) << 1;
            A = A ^ B;
            B = carrier;
        }
        return A;
    }

    public int addAB(int A, int B) {
        if (B == 0) {
            return A;
        }
        return addAB(A ^ B, (A & B) << 1);
    }

    // 18.5
    public int getDistance(String[] article, int n, String x, String y) {

    }

}
