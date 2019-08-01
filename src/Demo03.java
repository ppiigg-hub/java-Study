import java.util.Scanner;

public class Demo03 {
    //数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
    // 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double a = sc.nextDouble();

        double jdz = jdz(a);
        System.out.println(a+"的绝对值是"+jdz);
    }
    public static double jdz(double a){
        if(a < 0) {
            return -a;

        }else{
            return a;
        }

    }

}
