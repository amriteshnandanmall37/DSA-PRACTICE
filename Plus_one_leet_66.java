class Solution {
    void add(int[] digits,int index)
    {
        int d=digits[index]+1;
        if(d<10)
        {
            digits[index]=d;
            return;
        }
        digits[index]=0;
        add(digits,index-1);
    }
    public int[] plusOne(int[] digits) {
        boolean check9=true;
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]!=9)
            {
            check9=false;
            break;
            }
        }
        int start=0;
        int[] ans;
        if(check9)
        {
            ans=new int[digits.length+1];
            start=1;
        }
        else
        {
            ans=new int[digits.length];
        }
        int j=0;
        for(int i=start;i<ans.length;i++)
        {
            ans[i]=digits[j];
            j++;
        }
        add(ans,ans.length-1);
        return ans;
        
    }
}