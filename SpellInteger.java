//念整数（5分）
//题目内容：
//你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
//如输入1234，则输出：
//yi er san si
//注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
//fu er san si yi
//
//输入格式:
//一个整数，范围是[-100000,100000]。
//
//输出格式：
//表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。
//
//输入样例：
//-30
//
//输出样例：
//fu san ling
//时间限制：500ms内存限制：32000kb
package base;

import java.util.Scanner;

public class SpellInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		if (a < 0) 
		{
			System.out.print("fu ");
			a = -a;
		}
//		从高位取数,依次念
		for(int i = 6, j = 0, b = 0; i > 0 ; i--)
		{
//			如果待取的数小于(i-1)位数,跳过此轮循环,进入下一轮
			if(a < mN(10,i-1))
			{
				continue;
			}
			b = (int)(((a % mN(10,i)) - (a % mN(10,i-1)))/mN(10,i-1));
//			如果取得的数是非零数,计数加一
			if(b != 0)
			{
				j++;
			}
//			取得的数是零,取得非零数总计数为零,即取得的零无效,跳过此轮循环,进入下一轮
			if(b == 0 && j == 0)
			{
				continue;
			}
			voice(b);
			if(i <= 6 && i > 1)
			{
				System.out.print(" ");
			}
		}
	}

	private static int mN(int m, int n) {
		// 以正整数a为底数,以整数n为指数的幂
		int a = 1;
//		double b = 1;
		if (n >= 0)
		{
			for(int j=0;j < n; j++)
			{
				a = a*m;
			}
		}
		return a;
	}

	private static void voice(int b) {
		// TODO Auto-generated method stub
		switch (b) 
		{
			case 0: {System.out.print("ling"); break;}
			case 1: {System.out.print("yi"); break;}
			case 2: {System.out.print("er"); break;}
			case 3: {System.out.print("san"); break;}
			case 4: {System.out.print("si"); break;}
			case 5: {System.out.print("wu"); break;}
			case 6: {System.out.print("liu"); break;}
			case 7: {System.out.print("qi"); break;}
			case 8: {System.out.print("ba"); break;}
			case 9: {System.out.print("jiu"); break;}
		default:
			throw new IllegalArgumentException("Unexpected value: " + b);
		}
	}
}
