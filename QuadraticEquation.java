
package quadratic.equation;
import java.util.*;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first value: ");
        a=out.nextInt();
        System.out.println("Enter thesecond value: ");
        b=out.nextInt();
        System.out.println("Enter the third number: ");
        c=out.nextInt();
        
        double root1= (-b+Math.sqrt((b*b)-4*(a*c)))/(2*a);
        double root2=(-b-Math.sqrt((b*b)-4*(a*c)))/(2*a);
        System.out.println(a+"x2"+b+"x"+c);
        System.out.println("Roots of the equation are "+root1+" "+root2);

    }
    
}
