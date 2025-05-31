class Celebrity {
    public int celebrity(int mat[][]) {
       
       
       int max_count=0;
       int celebrity=-1;
       boolean action=true;
       for(int i=0;i<mat.length;i++)
       {
           action=true;
           for(int j=0;j<mat.length;j++)
           {
              
               if((i!=j && mat[i][j]!=0)|| mat[j][i]!=1 )
               {
                   action=false;
                   break;
               }
           }
           if(action)
           {
               return i;
           }
       }
       
       return celebrity;
        
    }
}