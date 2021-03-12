//1单词长度（5分）
//题目内容：
//你的程序要读入一行文本，其中以空格分隔为若干个单词，以‘.’结束。你要输出这行文本中每个单词的长度。这里的单词与语言无关，可以包括各种符号，比如“it's”算一个单词，长度为4。注意，行中可能出现连续的空格。
//
//输入格式:
//输入在一行中给出一行文本，以‘.’结束，结尾的句号不能计算在最后一个单词的长度内。
//
//输出格式：
//在一行中输出这行文本对应的单词的长度，每个长度之间以空格隔开，行末没有最后的空格。
//
//输入样例：
//It's great to see you here.
//
//输出样例：
//4 5 2 3 3 4
//时间限制：500ms内存限制：32000kb
package base;

import java.util.Scanner;

public class LengthOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("a string");
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		in.close();

//		定位空格,循环打印.
		int blankLoc = s.indexOf(" ");
		if(blankLoc != -1)
		{
			String s2 = s.substring(0,blankLoc);
			System.out.print(s2.length() + " ");
		}
		while(blankLoc != -1) 
		{
			int blankLoc2 = s.indexOf(" ", blankLoc + 1);
			if(blankLoc2 != -1 )
			{
				String s3 = s.substring(blankLoc + 1, blankLoc2);
				System.out.print(s3.length() + " ");
//				新起点
				blankLoc = blankLoc2;
			}
			else
			{
//				找不到下一个空格,循环终止.
				break;
			}
		}
//		定位“.”的位置,打印最后一组字符串的长度
		int dotLoc = s.indexOf(".");
		if(dotLoc != -1 )
		{
			String s4 = s.substring(blankLoc + 1, dotLoc);
			System.out.print(s4.length());
		}
	}

}
