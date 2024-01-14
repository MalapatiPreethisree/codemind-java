import java.util.Scanner;
public class Pp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Float a=sc.nextFloat();
Float b=sc.nextFloat();
System.out.printf("%.2f",((b-a)/a)*100);
}
}