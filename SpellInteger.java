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
		int num = in.nextInt();
		in.close();
		if (num < 0) {
			System.out.print("fu ");
			//负数改为正数, 方便下一步操作
			num = -num;
		}

		for(int biggestNumOfDigit = 6, digit = 0; biggestNumOfDigit > 0 ; biggestNumOfDigit--){
			//如果num小于10的(biggestNumOfDigit-1)次方, 那么num的数位小于此biggestNumOfDigit数位, 跳过此轮
			if(num < powers(10,biggestNumOfDigit-1)){
				continue;
			}else {
				//从高位取数,每次取一个“digit”, 比如900中的9、0、0
				digit = (int)(((num % powers(10,biggestNumOfDigit)) - (num % powers(10,biggestNumOfDigit-1)))/powers(10,biggestNumOfDigit-1));
				voice(digit);
				if(biggestNumOfDigit > 1){
					System.out.print(" ");
				}
			}
		}
	}
	
	// 以整数a为底数,以整数n为指数的幂
	private static int powers(int a, int n) {
		
		int tempNum = 1;
		if (n >= 0){
			for(int j=0;j < n; j++){
				tempNum = tempNum*a;
			}
		}
		return tempNum;
	}

	//输出对应的文字
	private static void voice(int digit) {
		// TODO Auto-generated method stub
		switch (digit) {
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
			throw new IllegalArgumentException("Unexpected value: " + digit);
		}
	}
}
