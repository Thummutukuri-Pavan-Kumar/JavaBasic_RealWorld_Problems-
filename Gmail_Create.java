import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the First_Name : ");
    String First_Name = sc.nextLine();
    System.out.println("ENter the Last_Name : ");
    String Last_Name = sc.nextLine();
    System.out.println("ENter the Domain : ");
    String Domain = sc.nextLine();
    String mail_south = First_Name.charAt(0)+"."+First_Name+Last_Name+Domain+"@gmail.com";
    String mail_north = Last_Name.charAt(0)+"."+Last_Name+First_Name+Domain+"@gmail.com";
    System.out.println("The South_Style_Email is :" +mail_south);
    System.out.println("The North_Style_Email is :" +mail_north);
    sc.close();
}
}
