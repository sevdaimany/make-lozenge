#include <stdio.h>

int main(){
  int n ,k;
  scanf("%d %d",&k,&n);
  for (int i = 0; i < n+1; i++)
  {
      for (int j = 0; j < n - i;j ++)
      {
          printf(" ");
      }
      
      if(i  < k){
          for (int j = 0; j < 2*i + 1; j++)
          {
              printf("*");
          }
          
      }
      else{
          for (int j = 0; j < k; j++)
          {
              printf("*");
          }
          
          for (int j = 0; j < 2*(i - k)+1; j++)
          {
              
          printf(" ");
          }
          
           for (int j = 0; j < k; j++)
          {
              printf("*");
          }
      }
      printf("\n");
  }

 for (int i = 0; i < n; i++)
 {
     for (int j = 0; j< i + 1; j++)
     {
         printf(" ");
     }

     if(i < n- k){
         for (int j = 0; j < k; j++)
         {
             printf("*");
         }
         
         for (int j = 0; j< 2*(n-i-k)-1; j++)
         {
             printf(" ");
         }
          for (int j = 0; j < k; j++)
         {
             printf("*");
         }
         
     }
     else{
         for (int j = 0; j < 2*(n - i)-1; j++)
         {
             printf("*");
         }
        
     }
     printf("\n");
     
 }
 
  
  
}