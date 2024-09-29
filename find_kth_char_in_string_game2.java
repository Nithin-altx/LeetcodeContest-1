class Solution {
    //Tc=O(logK*logk)
    //sc=log(logk)
    public char kthCharacter(long k, int[] op) {
        
        int type=0;
        long nextk=0;
        long len=1;
        int n=op.length;
        if(k==1)
        return'a';
        for(int i=0;i<n;i++)
        {
            len*=2;
            if(len>=k)
            {
                type=op[i];
                nextk=k-len/2;
                break;
            }
        }
        char res=kthCharacter(nextk,op);
        if(type==0)
        return res;
        if(res=='z')
        return 'a';
        return (char)(res+1);

        
    }
}
