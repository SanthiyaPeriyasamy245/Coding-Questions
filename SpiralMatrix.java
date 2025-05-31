class SpiralMatrix {
   
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
         ArrayList<Integer>answer=new ArrayList<>();
         
         int l=0;
         int top=0;
         int r=mat[0].length-1;
         int bottom=mat.length-1;
         while(l<=r && top<=bottom)
         {
             // left to right
             for(int i=l;i<=r;i++)
             {
                 answer.add(mat[top][i]);
             }
             
             top+=1;
             // top to bottom
             for(int i=top;i<=bottom;i++)
             {
                 answer.add(mat[i][r]);
             }
             r-=1;
             //right to left
             if(top<=bottom)
             {
             for(int i=r;i>=l;i--)
             {
                 answer.add(mat[bottom][i]);
             }
             bottom-=1;
             }
             // bottom to top
             if(l<=r)
             {
             for(int i=bottom;i>=top;i--)
             {
                 answer.add(mat[i][l]);
             }
             l+=1;
             }
         }
         return answer;
        
    }
}
