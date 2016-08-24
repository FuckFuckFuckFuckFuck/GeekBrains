/**
* Created by Andrey Lapuzin on 23.08.2016
*
*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите аргументы");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();

		double result = counter(a,b,c,d);

		System.out.println(result);
	}
	public static double counter(double a,double b,double c,double d){
		double e = a*(b+(c/d));
		return e;
	}
}