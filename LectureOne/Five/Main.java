/**
* Created by Andrey Lapuzin on 23.08.2016
*
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите год");

		a = sc.nextInt();

		if(leapYear(a) == true){
			System.out.println (a + " - Високосный год");
		}
		else {
			System.out.println(a + " - Не високосный год");
		}
	}
	public static boolean leapYear(int a){
		boolean isleapYear = false;
		if ((a%4 == 0 && a%100>0) || a%400 == 0) {
			isleapYear = true;
		}
		return isleapYear;
	}
}