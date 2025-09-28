import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int f=a-1;f>0;f--){
            for(int g=1;g<=f;g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
