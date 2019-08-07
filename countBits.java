public class countBits {

    public int[] countBits(int num) {

        final int temp[] = new int[num];
        for(int i = 0;i< num;i++)
        {
            temp[i] = countNumberofOne(i);
        }
        return temp;

    }
    public int countNumberofOne(int n)
    {
        int sum = 0;
        if(n == 0)
            return  0;
        else
        {
            while(n > 0)
            {
                if(n%2 != 0)
                    sum++;
                n /= 2;
            }
        }
        return sum;
    }
}
