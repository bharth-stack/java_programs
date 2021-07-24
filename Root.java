import java.lang.*;
import java.util.*;
class Root
{
public static void main(String args[])
{
int a,b,c;
double area1,area2;
Scanner s=new Scanner(System.in);
System.out.println("enter base=");
a=s.nextInt();
System.out.println("enter height=");
b=s.nextInt();
System.out.println("enter length=");
c=s.nextInt();
area1=Math.sqrt((b*b)-4*(a*c));
area1=(-b)+area1;
area1=area1/(2*a);
area2=Math.sqrt((b*b)-4*(a*c));
area2=(-b)-area2;
area2=area2/(2*a);

System.out.println("roots are="+area1);
System.out.println("roots are="+area2);
}
}