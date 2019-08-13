import java.lang.reflect.Array;

class Solution {
    public int numberOfArithmeticSlices(int[] A) {

        int size = A.length;
        int ref[] = new int[size];
        if(size == 0 || size < 3)
        {
            return 0;
        }
        for(int i = 0;i<size;i++)
        {
            ref[i] = findSeq(i,A);
        }
        int sum = 0;
        for(int i = 0;i< size;i++)
        {
            if(ref[i] != 0)
            {
                if(ref[i] >= 3)
                {
                    sum = sum +(ref[i] - 3) + 1;
                }
            }
        }
        return sum;
    }
    private  int seqLength = 0;
    private  int findSeq(int x, int[] mat)
    {
        if(x < mat.length-1) {
            int gd = Math.abs(mat[x] - mat[x + 1]);
            seqLength = 1;
            return sequ(x, gd, mat);
        }
        return 0;
    }
    private  int sequ(int x, int gd, int[] A)
    {
        if(x < A.length-1)
        {
            if(Math.abs(A[x] - A[x+1])!= gd)
            {
                return 0;
            }
            else
            {
                seqLength++;
                sequ(x+1,gd,A);
                return seqLength;
            }
        }
        else
        {
            return 0;
        }

    }
    public static void main(String args[])
    {
        int[] A = {1,2,3,4};
        System.out.println(new Solution().numberOfArithmeticSlices(A));
    }
}