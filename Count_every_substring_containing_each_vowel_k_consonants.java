class Solution {
    //Brute Force Tc=O(N^3)
    //SC=O(length of string)
    boolean containsv(String word)
    {
        boolean b[]=new boolean[5];
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='a')
            b[0]=true;
            else if(word.charAt(i)=='e')
            b[1]=true;
            else if(word.charAt(i)=='i')
            b[2]=true;
            else if(word.charAt(i)=='o')
            b[3]=true;
            else if(word.charAt(i)=='u')
            b[4]=true;

        }
        for(int i=0;i<5;i++)
        {
          if(b[i]==false)
          return false;
        }
        return true;
   
       
       
    }
    boolean kcount(String word,int k)
    {
        int countc=0;
          for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u')
            countc++;
        }
        if(countc==k)
        return true;
        else
        return false;

    }
    public int countOfSubstrings(String word, int k) {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            String sub="";
            for(int j=i;j<word.length();j++)
            {
            sub+=String.valueOf(word.charAt(j));
            if(containsv(sub)&&kcount(sub,k))
            {
                count++;
            }
            }
        }
        return count;
        
    }
}
