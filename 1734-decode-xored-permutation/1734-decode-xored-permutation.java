class Solution {
    public int[] decode(int[] encoded) {
        int[] perm = new int[encoded.length+1];
        int x=0;
        for(int i=1;i<=perm.length;i++)
            x=x^i;
        for(int i=0;i<encoded.length;i+=2)
            x=x^encoded[i];
        perm[perm.length-1]=x;
        for(int i=perm.length-2;i>=0;i--)
        {
            perm[i]=perm[i+1]^encoded[i];
        }
        return perm;
    }
}