/*
完数（5分）
题目内容：
一个正整数的因子是所有可以整除它的正整数。而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。
现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。

提示：可以写一个函数来判断某个数是否是完数。

输入格式:
两个正整数，以空格分隔。

输出格式：
其间所有的完数，以空格分隔，最后一个数字后面没有空格。如果没有，则输出一个空行。

输入样例：
1 10

输出样例：
6

时间限制：500ms内存限制：32000kb
*/
package base;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int b=0;
		for (int a = 2; a >= n && a <= m; a++){
			int j =1;
//			因数求和,判断是否为完数
			for(int i =2;i<a;i++) {
				if(a%i==0){
					j=j+i;
				}
			}		
			if(j==a){
//				因为无法判断是否为最后一个完数,在此判断是否为第一个完数
					if(b==0){
						System.out.print(a);
						b++;
					}
//					第二个及以后的完数
					else {
						System.out.print(" "+a);
					}
			}
		}
//		没有➡️输出空行 
		if (b==0) {
			System.out.println();
		}
	}
}
