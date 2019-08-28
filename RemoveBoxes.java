import java.util.ArrayList;
import java.util.Arrays;

class Solution546 {
    public int removeBoxes(int[] boxes) {

        final int l = boxes.length;
        if(boxes.length == 1)
        {
            return 1;
        }
        Arrays.sort(boxes);
        return go(boxes,0,0);

    }
    private int go(int[] box, int l,int total)
    {
        for(int i = l;i<box.length;i++)
        {
            int seq = 0;
            for(int j = i;j< box.length;j++)
            {
                if(j == box.length - 1)
                {
                    if(box[j] == box[j-1])
                    {
                        seq++;
                        return total + seq * seq;
                    }
                    else
                    {
                        return total + seq * seq + 1;
                    }
                }
                 if(box[i] == box[j])
                {
                    seq ++;
                }
                else
                {
                    return go(box,j,total + seq * seq);
                }
            }
        }
        return total;
    }
    public static void main(String args[])
    {
        int a[] = {1,2,1,2,1};
        int b[] = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        System.out.println(new Solution546().removeBoxes(a));
    }
}