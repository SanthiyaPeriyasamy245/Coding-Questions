class  FindCelebrity {
    public int celebrity(int mat[][]) {
       
       
      int top=0;
      int bottom=mat.length-1;
      while(top<bottom)
      {
          if(mat[top][bottom]==1)
          {
              top+=1;
          }
          else if(mat[bottom][top]==1)
          {
              bottom-=1;
          }
          else{
              top+=1;
              bottom-=1;
          }
      }
      if(top>bottom) 
      {
          return -1;
          
      }
      for(int i=0;i<mat.length;i++)
      {
        
          if(i!=top && mat[top][i]!=0 || mat[i][top]!=1)
          {
         
              return -1;
          }
      }
      
      return top;
        
    }
}