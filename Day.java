
package day;
import java.util.*;

public class Day {

    
    public static void main(String[] args) {
        String web;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the day:");
        web=s.next();
        if(web.startsWith("https:")&&(web.endsWith(".com")))
            System.out.println("hyper text transfer portal secure and belongs to comercial");
      else if(web.startsWith("ftp:")&&(web.endsWith(".com")))
            System.out.println("file trnsfer protocal belongs to comercial");
      else if(web.startsWith("https:")&&(web.endsWith(".org")))
            System.out.println("hyper text transfer portal secure and belongs to organization");
      else if(web.startsWith("ftp:")&&(web.endsWith(".org")))
            System.out.println("file transfer portal and belongs to organization");
      else if(web.startsWith("http:")&&(web.endsWith(".com")))
            System.out.println("hyper text transfer portal and belongs to commercial");
      else if(web.startsWith("http:")&&(web.endsWith(".org")))
            System.out.println("hyper text transfer portal and belongs to organization");
      else if(web.startsWith("http:")&&(web.endsWith(".net")))
            System.out.println("hyper text transfer portal and belongs to network");
      else if(web.startsWith("https:")&&(web.endsWith(".net")))
            System.out.println("hyper text transfer portal secure and belongs to network");
        else if(web.startsWith("ftp:")&&(web.endsWith(".net")))
            System.out.println("file text  portal and belongs to network");
        else
            System.out.println("invalid website");   
        
    }
    
}
