import java.util.*;
public class Main{
    public static void main(String []args){
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the n(Total teams) value : ");
      int n = sc.nextInt();
      float Total_Matches = n * (n-1)/2;
      System.out.println("The Total no.of Matches are: "+Total_Matches);
      sc.close();
    }
}
      
