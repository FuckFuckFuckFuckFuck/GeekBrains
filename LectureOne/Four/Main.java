/**
* Created by Andrey Lapuzin on 23.08.2016
*
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите числа a и b");

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println (tester(a,b));
	}
	public static boolean tester(int a, int b){
		boolean isItTrue = false;
		if (a+b > 10 && a+b<20) {
			isItTrue = true;
		}
			return isItTrue;
	}
}