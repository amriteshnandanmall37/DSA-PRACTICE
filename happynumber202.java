class Solution {
    public boolean isHappy(int n) {

        return digit2sum(n);
    }
    public boolean digit2sum(int x)
    {
        int sum=0;
        while(x!=0)
        {
            sum+=(x%10)*(x%10);
            x/=10;
        }
        if(sum==1)
        return true;
        if(sum==4||sum==16||sum==37||sum==58||sum==89||sum==145||sum==42||sum==20)
        return false;
        return digit2sum(sum);
    }
}