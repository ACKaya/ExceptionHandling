import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int b=0;
        try{
            int a=scan.nextInt();
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Program Sonlandi");
        }


    }
}
