import java.lang.*;
import java.util.*;
class AreaOfTriangle
{
public static void main(String args[])
{
float a,b,c,d;
Scanner s=new Scanner(System.in);
System.out.println("enter base=");
a=s.nextFloat();
System.out.println("enter height=");
b=s.nextFloat();
c=a*b/2;

System.out.println(" area="+c);
}
}