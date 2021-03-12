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
		final int arraySize1 = 10;
		final int arraySize2 = 2;
		int [][] numbers = new int[arraySize1][arraySize2];
//		读入二维数组i行j列
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < arraySize1; i++) {
			for (int j = 0; j < arraySize2; j++) {
				numbers[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < arraySize1; i++){
//			系数的符号,系数大于零时,第二个开始输出,倒数第二个为最后的输出,输出“+”
			if(i > 0 && i < arraySize1) {
//				二维数组,为了明了,直接限定列区域[1]或者[0]
				if(numbers[i][1] > 0){
					System.out.print("+");
				}
			}
//			系数为零,跳过项
			if(numbers[i][1] != 0) {
//				指数为零,不输出“x”
				if(numbers[i][0] == 0){
					System.out.print(numbers[i][1]);
				}
				else{
//					指数为1,只输出“x”
					if(numbers[i][0] == 1){
						System.out.print(numbers[i][1]+"x");
					}
//					指数不为0,也不为1,完整输出
//					指数为负数的情况,题目未提及,按此处理
					else {
						System.out.print(numbers[i][1]+"x"+numbers[i][0]);
					}
				}
			}

		}
	}

}
