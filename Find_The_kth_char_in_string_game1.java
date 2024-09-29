class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length()<k)
        {
            String temp="";
            for(int i=0;i<word.length();i++)
            {
                char c=word.charAt(i);
                char next=(char)(c+1);
                temp+=String.valueOf(next);
            }
            word+=temp;
        }
        return word.charAt(k-1);
        
    }
}
