public class robbingHouses {
    //[1,2,3,1]
    public int rob(int[] nums) {

        int n = nums.length;
        int pSum,cSum,ppSum;
        pSum = cSum = ppSum = 0;
        for (int i = 0;i<n;i++)
        {
            cSum = pSum;
            cSum = Integer.max(ppSum + nums[i], cSum);

            ppSum = pSum;
            pSum = cSum;
        }
        return cSum;

    }
}