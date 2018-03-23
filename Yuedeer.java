/*
http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1677&konwledgeId=134
将约德尔人的历史的每个阶段都用一个字符表达出来。(包括可写字符,不包括空格。)。然后将这个字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。相似率越高,则约德尔的未来越光明。
样例输入
@!%12dgsa
010111100
样例输出
66.67%
*/
package test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Yuedeer
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1=args[0];
		String s2=args[1];
		/*Scanner in = new Scanner(System.in);
		String history = in.nextLine();
		String star = in.nextLine();*/
		//转化s1
		String s1_num="";
		for(int i=0;i<s1.length();i++){
			
			if((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(Character.isDigit(s1.charAt(i)))){
				s1_num=s1_num+"1";
			}else{
				s1_num=s1_num+"0";
			}
		}
		
		//算相似度
		int samenum=0;
		for(int i=0;i<s1.length();i++){
			if(s1_num.charAt(i)==s2.charAt(i)){
				samenum++;
			}
		}
		double prob=(double)samenum/s1.length();
		DecimalFormat dFormat=new DecimalFormat("0.00%");
		String result=dFormat.format(prob);
	    double resultdouble=Double.valueOf(result.toString());
	    System.out.println(resultdouble);
		
	}
	

			

}
