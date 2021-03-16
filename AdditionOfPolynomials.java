//多项式加法（5分）
//题目内容：
//一个多项式可以表达为x的各次幂与系数乘积的和，比如：
//2x6+3x5+12x3+6x+20
//现在，你的程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系数相加然后输出。
//程序要处理的幂最大为100。
//
//输入格式:
//总共要输入两个多项式，每个多项式的输入格式如下：
//每行输入两个数字，第一个表示幂次，第二个表示该幂次的系数，所有的系数都是整数。第一行一定是最高幂，最后一行一定是0次幂。
//注意第一行和最后一行之间不一定按照幂次降低顺序排列；如果某个幂次的系数为0，就不出现在输入数据中了；0次幂的系数为0时还是会出现在输入数据中。
//
//输出格式：
//从最高幂开始依次降到0幂，如：
//2x6+3x5+12x3-6x+20
//注意其中的x是小写字母x，而且所有的符号之间都没有空格，如果某个幂的系数为0则不需要有那项。
//
//输入样例：
//6 2
//5 3
//3 12
//1 6
//0 20
//6 2
//5 3
//2 12
//1 6
//0 20
//
//输出样例：
//4x6+6x5+12x3+12x2+12x+40
//时间限制：500ms内存限制：32000kb

package base;

import java.util.Scanner;

public class AdditionOfPolynomials {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numberOfPolynomials = 2;
		int isFirstOne = 1;
		do {
			//(系数)X^(指数)
			//(coefficient)X^(degree)
			int degree = in.nextInt();
			int coefficient = in.nextInt();

			//不是首个项时, 输出正号, 负号由函数simpleCoefficient负责
			if(coefficient > 0 && isFirstOne == 0 ){
				System.out.print("+");
			}
			if (isFirstOne == 1) {
				isFirstOne = 0;
			}
			
			simpleCoefficient(coefficient, degree);
			simpleDegree(degree);
			
			//指数为零, 一个多项式输入结束
			if(degree == 0){
				System.out.print("\n");
				numberOfPolynomials -= 1;
				isFirstOne = 1;
			}
		}while(numberOfPolynomials > 0);
		in.close();
	}

	//先从指数部分着手, 简化, 再跟系数部分整合, 从右往左
	private static void simpleCoefficient(int coefficient, int degree) {
		if(coefficient != 0){
			if(coefficient == 1){
				System.out.print("1");
			}else if(coefficient == -1){
				if(degree != 0) {
					System.out.print("-");
				}else {
					System.out.print("-1");
				}
			}else{
				System.out.print(coefficient);
			}
		}
	}
	
	private static void simpleDegree(int degree) {
	if(degree == 0){
//		先从指数部分着手, 简化, 再跟系数部分整合,当指数为0时,只需要打印系数部分
//		System.out.print("1");
	}else {
		if(degree == 1){
			System.out.print("x");
		}
		else if(degree > 0){
			System.out.print("x"+degree);
		}else if(degree < 0){
			System.out.print("x"+"("+degree+")");
		}
	}
}
	
}
