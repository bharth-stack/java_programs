package ap.series;
import java.util.*;
public class APSeries {

    public static void main(String[] args) {
        int i,j,k,l;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the starting number=");
        i=s.nextInt();
        System.out.print("enter the differnce number=");
        j=s.nextInt();
        System.out.print("enter the repeatitions=");
        k=s.nextInt();
        
for(l=0;l<k;l++)
{
            System.out.print(i+",");
            i=i+j;
}
   }
    
}
