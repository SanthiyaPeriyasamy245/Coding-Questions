class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int l=0;
       int h=0;
       while(h<s.length && l<g.length)
       {
        if(g[l]<=s[h])
        {
            l=l+1;
        }
        h=h+1;
       }
       return l; 
    }
}