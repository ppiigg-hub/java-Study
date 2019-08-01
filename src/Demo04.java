import java.util.Scanner;

public class Demo04 {
    //请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
    //四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于0的小数");
        double aa = sc.nextDouble();
        double flag = round(aa);
        System.out.println(flag);
    }
    public static int round(double num){
        int a = (int)(num*10)%10;
        if(a<=4){
            return (int)num;
        }else{
            return (int)num+1;
        }
    }
}
