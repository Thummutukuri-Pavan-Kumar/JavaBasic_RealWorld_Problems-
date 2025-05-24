import java.util.*;
public class Main
  {
    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the loan amount: " );
      long loan = sc.nextLong();
      System.out.println("Enter the Rate of Interest(in %): " );
      double ROI = sc.nextDouble();
      System.out.println("Enter the loan tenure(in years): " );
      int tenure = sc.nextInt();
      double amount = loan*Math.pow((1+ROI/100),tenure);
      long amount_as_int = (long) amount;
      System.out.println("Amount to be paid to the Bank is : "+amount_as_int);
      sc.close();
    }
  }
