import java.lang.*;
import java.util.*;
class AreaOfTriangleTwo
{
public static void main(String args[])
{
int a,b,c;
float d;
double area;
Scanner s=new Scanner(System.in);
System.out.println("enter base=");
a=s.nextInt();
System.out.println("enter height=");
b=s.nextInt();
System.out.println("enter length=");
c=s.nextInt();
d=0.5f*(a+b+c);
area=Math.sqrt(d*(d-a)*(d-b)*(d-c));
System.out.println(" area="+d);
System.out.println(" area="+area);
}
}