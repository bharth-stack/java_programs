package arrays;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int a[]={3,9,7,8,12,6,15,15,4,10},i,j,k=0,l,o=0,m=0,p=0;
           System.out.println(" enter the largest number u want");
           Scanner s=new Scanner (System.in);
           i=s.nextInt();
           for(j=0;j<i;j++)
           {
                          for(l=0;l<a.length;l++)
                          {                                                    
                                  if(a[l]>m)
                                  {
                                     m=a[l];
                                    
                                  }
                                  
                                         
                           }
                          for(o=0;o<a.length;o++)
                          {
                              if(a[o]==m)
                              {
                                  a[o]=0;
                              }
                          }
                     k=m;
                     m=0;
                    
                     
               
           }
        
        System.out.println(+k);
       


   }
    
}
