package com.yu.practice;


public class Demo1{
	/**
	 * �������������x��y��z����С���������������
	 */
	public void add2(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}System.out.println("x,y,z�Ĵ�С��");
			}
		}
	}
	/**
	 * ����ѧϰ�ɼ����ɼ����ڵ���90��A����60��89�֣�B����60�����£�C����
     *  ��1����if���ʵ��
     *  ��2���������������������ʵ��
     */
	public void add1(int score){
		if(score>100){
			System.out.println("��ݔ��ķ֔����`");
			return;
		}if(score>90){
			System.out.println("ݔ�����e��"+"A��");
		}else if(score>60){
			System.out.println("ݔ�����e��"+"B��");
		}else{System.out.println("ݔ�����e��"+"C��");
		}
	}
	


	 /**
	  *���뵥�����ѽ������ۿۣ�
	  *���ѽ��ÿ��200Ԫ�����һ���ۿ۵ȼ����ۿ۵ȼ�����10��
	  *��95�ۣ�9�ۣ�85�ۣ�83�ۣ�78�ۣ�75�ۣ�73�ۣ�
	  *7�ۣ�65�ۣ�6�ۡ������ۿ���ߵȼ���
	  *��һ��55�ۡ�
	  */
	 public void rebate(int a){
		 double b=1;
		 if(a<200){
			 System.out.println("δ�_���ۿ�Ҫ��");
		 }else if(a<400){
			 b=a*0.95;
			 System.out.println("һ���ۿۣ�"+b);
		 }else if(a<600){
			 b=a*0.9;
			 System.out.println("�����ۿۣ�"+b);
		 }else if(a<800){
			 b=a*0.85;
			 System.out.println("�����ۿۣ�"+b);
		 }else if(a<1000){
			 b=a*0.8;
			 System.out.println("�ļ��ۿۣ�"+b);
		 }else if(a<1200){
			 b=a*0.75;
			 System.out.println("�弉�ۿۣ�"+b);
		 }else if(a<1400){
			 b=a*0.7;
			 System.out.println("�����ۿۣ�"+b);
		 }else if(a<1600){
			 b=a*0.65;
			 System.out.println("�߼��ۿۣ�"+b);
		 }else if(a<1800){
			 b=a*0.6;
			 System.out.println("�˼��ۿۣ�"+b);
		 }else {
			 b=a*0.55;
			 System.out.println("��߼��ۿۣ�"+b);
		 } 
		 
	 }
			
	 
	/**
	 * �����·ݣ����߼���
	 */
   public void month(int a){
	   switch(a){
	     case 12:
	     case 1:
	     case 2:
	    	 System.out.println("��������"+a+"���ǣ�"+"����"); 
	    	 break;
   case 3:
   case 4:
   case 5:
  	 System.out.println("��������"+a+"���ǣ�"+"����"); 
  	 break;
   case 6:
   case 7:
   case 8:
  	 System.out.println("��������"+a+"���ǣ�"+"�ļ�"); 
  	 break;
   case 9:
   case 10:
   case 11:
  	 System.out.println("��������"+a+"���ǣ�"+"�＾"); 
  	 break;
    }
   }
	
	/**
	 * ��˾����
	 */
	public void profit(int a ){
		 double b=0;    //������
		 if(a<0){
			 System.out.println("����������"); 
			 return;
		 }
		 if (a<=10) {
			b=a*0.1;
			System.out.println("�����ǣ�"+b+"��Ԫ");
		}else if (a<=20) {
		     b=(10*0.1)+(a-10)*0.075;
			System.out.println("�����ǣ�"+b+"��Ԫ");
	}else if (a<=40) {
		b=a*0.05;
		System.out.println("�����ǣ�"+b+"��Ԫ");
  }else if (a<=60) {
	b=a*0.03;
	System.out.println("�����ǣ�"+b+"��Ԫ");
 }else if (a<=100) {
	b=a*0.015;
	System.out.println("�����ǣ�"+b+"��Ԫ");
}else{
	b=a*0.01;
	System.out.println("�����ǣ�"+b+"��Ԫ");
}
	}
	/**
	 * ������ݣ��ж��Ƿ�Ϊ����
	 * 
	 */
	public void myIf(int a ){
		if(a%4==0 && a%100!=0 || a%400==0){
			System.out.println("aΪ���꣺"+a);
		}else{
			System.out.println("�ⲻ������");
		}
	}
	/**
	 * ����QQ�ȼ������ػ�Ծ����
	 */
	public void mySwitch(int a){
		switch(a){
		case 1:
			System.out.println("��Ծ������5��");
			   break;
		case 4:
			System.out.println("��Ծ������32��");
			    break;
		case 8:
		    System.out.println("��Ծ������96��");
				break;
		case 12:
			System.out.println("��Ծ������192��");
				break;
		case 16:
			System.out.println("��Ծ������320��");
				break;
	    case 32:
			System.out.println("��Ծ������1152��");
				break;
		case 48:
			System.out.println("��Ծ������2496��");
				break;
		case 64:
		    System.out.println("��Ծ������4352��");
				break;
		default:
			System.out.println("����������");
			   break;
		}
	}
	/** 
	 * �����¹��ʣ������������˰
	 */
	//a=�¹��Y-3500 
	public void add(int a){
		double b=0;
		if(a<=0){
			System.out.println("�������U�M");
			return;
		}
		if(a<=1500){
			b=a*0.03;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else if(a<=4500){
			b=a*0.1-105;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else if(a<=9000){
			b=a*0.2-555;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else if(a<=35000){
			b=a*0.25-1005;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else if(a<=55000){
			b=a*0.3-2755;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else if(a<=80000){
			b=a*0.35-5505;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}else  { 
			b=a*0.45-13505;
			System.out.println("���U�M�ǣ�"+b+"Ԫ");
		}
		
	}
	
/**
 * if...else����ʽ
 */
   public void myIf(int a,int b){
	 int c=0;
	 if(b==0){
		 System.out.println("�����Ϲ�ʽ");
	 }else{
		 c=a/b;
		 System.out.println("c��ֵ��"+c);
	 }
 }
}
