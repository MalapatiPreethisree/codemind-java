import java.util.Scanner;
public class ConcertOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int res=4*x;
        String c=res<=1000? "YES": "NO";
        System.out.println(c);
        
    }
}