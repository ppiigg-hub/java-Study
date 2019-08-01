import java.util.Scanner;

public class Demo02 {
    //在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，
    // 在方法中从大到小依次打印三个变量。执行效果如下：
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");

        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();
        getNumber(a,b,c);

    }
    public static void getNumber(int a,int b,int c){
        int max = 0;
        int min = 0;
        if(a>b&&a>c){
            max = a;
        }else if(b>a&&b>c){
            max = b;
        }else{
            max = c;
        }
        if(a<b&&a<c){
            min = a;
        }else if(b<c&&b<a){
            min = b;
        }else{
            min =c;
        }
        int aa = a+b+c-max-min;
        System.out.println(max+" " +aa+" "+min);
    }
}
