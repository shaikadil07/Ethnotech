import java.util.*;
class Factorial{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the Number: ");
  int n=s.nextInt(),f=1;
  for(int i=1;i<=n;i++) f*=i;
  System.out.println("Factorial = "+f);
 }
}