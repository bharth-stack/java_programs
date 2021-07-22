
package remove.symbols;


public class RemoveSymbols {

    public static void main(String[] args) {
      String str="a!bb.c.d.e.g";
      String l=str.replace("[^a-bA-Z0-9]","");
      System.out.println(l);  }
    
}
