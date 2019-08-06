package day08Test;

import java.util.Random;
import java.util.Scanner;

/*在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，
        防止恶意破解密码、刷票、灌水等行为。请查看Random、StringBuilder相关API，定义方法，
        获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
*/
public class Test02 {
    public static void main(String[] args) {
        char[] arr = new char[62];
        int index = 0;

        for (char c = 'A';c<='Z';c++){
            arr[index]=c;
            index++;
        }
        for (char c = 'a';c<='z';c++){
            arr[index]=c;
            index++;
        }
        for (char c = '0';c<='9';c++){
            arr[index]=c;
            index++;
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int i = 1;i<=4;i++){
            int num = r.nextInt(arr.length);
            sb.append(arr[num]);
        }
        String verifyCode = sb.toString();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码：" + verifyCode);
        String code = sc.nextLine();

        if(verifyCode.equalsIgnoreCase(code)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
