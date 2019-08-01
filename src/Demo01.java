import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入你需要的n阶乘法表" );
        int n = sc.nextInt();
        if(n<=1||n>=9){
            System.out.println("你输入的你不符合规则");
        }
        getC(n);



    }
    public static void getC(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*" + j +"="+i*j+"\t" );


            }
            System.out.println();
        }
    }


}
