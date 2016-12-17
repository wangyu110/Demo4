package com.yu.practice;


public class Demo1{
	/**
	 * 随机输入三个数x，y，z，从小到大输出三个数？
	 */
	public void add2(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}System.out.println("x,y,z的大小：");
			}
		}
	}
	/**
	 * 输入学习成绩，成绩大于等于90，A级，60—89分，B级，60分以下，C级。
     *  （1）用if语句实现
     *  （2）用条件运算符（？：）实现
     */
	public void add1(int score){
		if(score>100){
			System.out.println("您輸入的分數有誤");
			return;
		}if(score>90){
			System.out.println("輸出級別："+"A級");
		}else if(score>60){
			System.out.println("輸出級別："+"B級");
		}else{System.out.println("輸出級別："+"C級");
		}
	}
	


	 /**
	  *输入单次消费金额，计算折扣？
	  *消费金额每满200元，提高一个折扣等级，折扣等级共分10级
	  *：95折，9折，85折，83折，78折，75折，73折，
	  *7折，65折，6折。超过折扣最高等级后
	  *，一律55折。
	  */
	 public void rebate(int a){
		 double b=1;
		 if(a<200){
			 System.out.println("未達到折扣要求");
		 }else if(a<400){
			 b=a*0.95;
			 System.out.println("一級折扣："+b);
		 }else if(a<600){
			 b=a*0.9;
			 System.out.println("二級折扣："+b);
		 }else if(a<800){
			 b=a*0.85;
			 System.out.println("三級折扣："+b);
		 }else if(a<1000){
			 b=a*0.8;
			 System.out.println("四級折扣："+b);
		 }else if(a<1200){
			 b=a*0.75;
			 System.out.println("五級折扣："+b);
		 }else if(a<1400){
			 b=a*0.7;
			 System.out.println("六級折扣："+b);
		 }else if(a<1600){
			 b=a*0.65;
			 System.out.println("七級折扣："+b);
		 }else if(a<1800){
			 b=a*0.6;
			 System.out.println("八級折扣："+b);
		 }else {
			 b=a*0.55;
			 System.out.println("最高級折扣："+b);
		 } 
		 
	 }
			
	 
	/**
	 * 输入月份，告诉季节
	 */
   public void month(int a){
	   switch(a){
	     case 12:
	     case 1:
	     case 2:
	    	 System.out.println("当你输入"+a+"月是："+"冬季"); 
	    	 break;
   case 3:
   case 4:
   case 5:
  	 System.out.println("当你输入"+a+"月是："+"春季"); 
  	 break;
   case 6:
   case 7:
   case 8:
  	 System.out.println("当你输入"+a+"月是："+"夏季"); 
  	 break;
   case 9:
   case 10:
   case 11:
  	 System.out.println("当你输入"+a+"月是："+"秋季"); 
  	 break;
    }
   }
	
	/**
	 * 公司利润
	 */
	public void profit(int a ){
		 double b=0;    //定义结果
		 if(a<0){
			 System.out.println("您输入有误"); 
			 return;
		 }
		 if (a<=10) {
			b=a*0.1;
			System.out.println("奖金是："+b+"万元");
		}else if (a<=20) {
		     b=(10*0.1)+(a-10)*0.075;
			System.out.println("奖金是："+b+"万元");
	}else if (a<=40) {
		b=a*0.05;
		System.out.println("奖金是："+b+"万元");
  }else if (a<=60) {
	b=a*0.03;
	System.out.println("奖金是："+b+"万元");
 }else if (a<=100) {
	b=a*0.015;
	System.out.println("奖金是："+b+"万元");
}else{
	b=a*0.01;
	System.out.println("奖金是："+b+"万元");
}
	}
	/**
	 * 输入年份，判断是否为闰年
	 * 
	 */
	public void myIf(int a ){
		if(a%4==0 && a%100!=0 || a%400==0){
			System.out.println("a为闰年："+a);
		}else{
			System.out.println("这不是闰年");
		}
	}
	/**
	 * 输入QQ等级，返回活跃天数
	 */
	public void mySwitch(int a){
		switch(a){
		case 1:
			System.out.println("活跃天数：5天");
			   break;
		case 4:
			System.out.println("活跃天数：32天");
			    break;
		case 8:
		    System.out.println("活跃天数：96天");
				break;
		case 12:
			System.out.println("活跃天数：192天");
				break;
		case 16:
			System.out.println("活跃天数：320天");
				break;
	    case 32:
			System.out.println("活跃天数：1152天");
				break;
		case 48:
			System.out.println("活跃天数：2496天");
				break;
		case 64:
		    System.out.println("活跃天数：4352天");
				break;
		default:
			System.out.println("您输入有误");
			   break;
		}
	}
	/** 
	 * 输入月工资，计算个人所得税
	 */
	//a=月工資-3500 
	public void add(int a){
		double b=0;
		if(a<=0){
			System.out.println("您不用繳費");
			return;
		}
		if(a<=1500){
			b=a*0.03;
			System.out.println("您繳費是："+b+"元");
		}else if(a<=4500){
			b=a*0.1-105;
			System.out.println("您繳費是："+b+"元");
		}else if(a<=9000){
			b=a*0.2-555;
			System.out.println("您繳費是："+b+"元");
		}else if(a<=35000){
			b=a*0.25-1005;
			System.out.println("您繳費是："+b+"元");
		}else if(a<=55000){
			b=a*0.3-2755;
			System.out.println("您繳費是："+b+"元");
		}else if(a<=80000){
			b=a*0.35-5505;
			System.out.println("您繳費是："+b+"元");
		}else  { 
			b=a*0.45-13505;
			System.out.println("您繳費是："+b+"元");
		}
		
	}
	
/**
 * if...else语句格式
 */
   public void myIf(int a,int b){
	 int c=0;
	 if(b==0){
		 System.out.println("不符合公式");
	 }else{
		 c=a/b;
		 System.out.println("c的值："+c);
	 }
 }
}
