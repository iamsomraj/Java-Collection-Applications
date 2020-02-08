
// (((S^N%10)^M)%1000000007)
import java.math.BigInteger;
import java.util.*;

class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the S value: \n");
    String sString = sc.nextLine();
    System.out.println("\nEnter the N value: \n");
    String nString = sc.nextLine();
    System.out.println("\nEnter the M value: \n");
    String mString = sc.nextLine();
    BigInteger s = new BigInteger(sString);
    BigInteger n = new BigInteger(nString);
    BigInteger m = new BigInteger(mString);
    BigInteger res = s.pow(Integer.parseInt(nString));
    res = res.mod(BigInteger.valueOf(10));
    res = res.pow(Integer.parseInt(mString));
    res = res.mod(BigInteger.valueOf(1000000007));
    System.out.println("\n\n\nResult:\n\n"+res);


  }
}