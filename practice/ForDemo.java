package com.yu.practice;

public class ForDemo {
/**
 * 
 */

/**
 * 打印所有的水仙花数。水仙花数，是指一个三位数，每位数
 * 字的立方之和等于本数，如: 153 = 1
 * 的立方 + 5的立方 + 3的立方。 
 */
	public void add7(){
		int a;
		int b;
		int c;
		int count=0;
		for(a=1;a<=9;a++){
			for(b=0;b<=9;b++){
				for(c=0;c<=9;c++){
					if((a*a*a+b*b*b+c*c*c)==(a*100+b*10+c)){
						count++;
						System.out.println("第"+count+"个水仙花数是："+(a*100+b*10+c));
					}
				}
			}
		}
		
		
	}
/**
 *  一个球从100米高处落下，落地后反弹高度是原高度的一半
 *  ，求第10次落地时，球总共走过的路程？再次弹起时的高度？
 */
public void add6(){
	double total=0;   //定義結果
	double height=100;
	for(int i=0;i<=10;i++){
		System.out.println("第 "+i+"次落地，球走過的縂和："+total);
		total=total+height;
		height=height/2;
	}
	System.out.println("第10次落地，球走過的縂和："+total+","+"再次彈起的高度："+height);
}
/**
 * 古典兔子问题，有一对兔子，出生后第三个月起，每个月都生一对兔子'
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问前10个月，每个月兔子的数量？
 */
	public void add5(int a){
		int x=1;
		int temp=0;   //交換變量
		int res=0;  //定義結果
		if(a==1){System.out.println("未達到生育條件，所以兔子數為："+a);
		} else {for(int i=2;i<=a;i++){
			      res=x+temp;
			       temp=x;
			       x=res;
			System.out.println("第"+i+"個月");
			System.out.println("第"+i+"個月兔子數為："+res+"只");
			}
		}
		 
	}
 /**
  * 计算1+1/2!+1/3!+…+1/10!
  */
	public void add4(){
		double s=0.0;   //定義結果
		double j=1.0;
		for(int i=1;i<=10;i++){
			  j=j*i;
			  s=s+1/j;
			  System.out.println("i的值："+i);
			  System.out.println("j的值："+j);
			  System.out.println("s的值："+s);
		}
		System.out.println("s的值："+s);
	}
/**
 * 5的阶乘
 */
public void add3(){
     int j=1;   //定义结果
	for(int i=5;i>0;i--){
		j*=i;
		}	
	System.out.println("j的結果:"+j);
}




/**
 * 9*9乘法表
 *
 */

 public void add2(){
	 for(int i=1;i<=9;i++){
		 for(int j=1;j<=i;j++){
			 System.out.print(i+"*"+j+"="+i*j+"  ");
			if(i*j<10){
				 System.out.print(" ");
			}
		 }
		 System.out.println();
	 }
  }
 }
 