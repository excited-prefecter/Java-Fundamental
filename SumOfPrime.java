//素数和（5分）
//题目内容：
//我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
//现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
//注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。
//
//输入格式:
//两个整数，第一个表示n，第二个表示m。
//
//输出格式：
//一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
//
//输入样例：
//2 4
//
//输出样例：
//15

package base;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arraySize = 200;
		int [] array1 = new int[arraySize];
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
//		建立素数数组
		
		for(int i = 0, j = 2;i< arraySize;j++)
		{
			if(isPrime(j))
			{
				array1[i]=j;
				i++;
			}
		}
		int d = 0;
		for (int i = (a-1); i < b; i++) 
		{
			d = d + array1[i];
		}
		System.out.print(d);
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		for ( int i = 2; i<n; i++ ) {
			if ( n % i == 0 )
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
