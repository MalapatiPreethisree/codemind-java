import java.util.Scanner;
public class Weight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.printf("%d",(z-y)/x);
    }
}