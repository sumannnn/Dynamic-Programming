class Solution {
    int pairlength = 0;
    public int findLongestChain(int[][] pairs) {

        int totalPair = pairs.length;

        if(totalPair == 0)
            return 0;
        int[][] sortedPair = new Solution().returnSortedArray(pairs);
        int len = 0;
        for(int i = 0;i< totalPair;i++)
        {
            for(int j = i+1;j<totalPair;j++)
            {
                pairlength = 0;
                len = Math.max(len,go(i,j,sortedPair));
            }
        }
        return len+1;

    }
    private int[][] returnSortedArray(int[][] pairs)
    {
        for(int i = 0;i<pairs.length-1;i++)
        {
            if(pairs[i][0] > pairs[i+1][0])
            {
                int temp = pairs[i][0];
                pairs[i][0] = pairs[i+1][0];
                pairs[i+1][0] = temp;
            }
        }
        return pairs;
    }
    private int go(int i,int j, int[][] pairs)
    {
        if(i < pairs.length && j < pairs.length) {
            if (pairs[i][1] < pairs[j][0]) {
                pairlength++;
                go(i + 1, j + 1, pairs);
                return pairlength;
            } else
                return 0;
        }
        else
            return 0;
    }
    public static void main(String args[])
    {
        int[][] pairs = {{1,2}, {2,3}, {3,4}};
        System.out.println(new Solution().findLongestChain(pairs));
    }
}