import java.util.Scanner;
public class Capacity{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int s=sc.nextInt();
        int b= sc.nextInt();
        int c=2*t*s*b*512;
        System.out.println(c);
    }
}