import java.util.Scanner;


public class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int number1 =sc.nextInt();
		System.out.println("请输入第二个数字");
		//再次接收第二个数据
		int number2 =sc.nextInt();
		System.out.println(number1+number2);
	}
}
