package com.yu.practice;

public class ForDemo {
/**
 * 
 */

/**
 * ��ӡ���е�ˮ�ɻ�����ˮ�ɻ�������ָһ����λ����ÿλ��
 * �ֵ�����֮�͵��ڱ�������: 153 = 1
 * ������ + 5������ + 3�������� 
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
						System.out.println("��"+count+"��ˮ�ɻ����ǣ�"+(a*100+b*10+c));
					}
				}
			}
		}
		
		
	}
/**
 *  һ�����100�׸ߴ����£���غ󷴵��߶���ԭ�߶ȵ�һ��
 *  �����10�����ʱ�����ܹ��߹���·�̣��ٴε���ʱ�ĸ߶ȣ�
 */
public void add6(){
	double total=0;   //���x�Y��
	double height=100;
	for(int i=0;i<=10;i++){
		System.out.println("�� "+i+"����أ������^�ĿG�ͣ�"+total);
		total=total+height;
		height=height/2;
	}
	System.out.println("��10����أ������^�ĿG�ͣ�"+total+","+"�ٴΏ���ĸ߶ȣ�"+height);
}
/**
 * �ŵ��������⣬��һ�����ӣ����������������ÿ���¶���һ������'
 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
 * ��ǰ10���£�ÿ�������ӵ�������
 */
	public void add5(int a){
		int x=1;
		int temp=0;   //���Q׃��
		int res=0;  //���x�Y��
		if(a==1){System.out.println("δ�_�������l�����������Ӕ��飺"+a);
		} else {for(int i=2;i<=a;i++){
			      res=x+temp;
			       temp=x;
			       x=res;
			System.out.println("��"+i+"����");
			System.out.println("��"+i+"�������Ӕ��飺"+res+"ֻ");
			}
		}
		 
	}
 /**
  * ����1+1/2!+1/3!+��+1/10!
  */
	public void add4(){
		double s=0.0;   //���x�Y��
		double j=1.0;
		for(int i=1;i<=10;i++){
			  j=j*i;
			  s=s+1/j;
			  System.out.println("i��ֵ��"+i);
			  System.out.println("j��ֵ��"+j);
			  System.out.println("s��ֵ��"+s);
		}
		System.out.println("s��ֵ��"+s);
	}
/**
 * 5�Ľ׳�
 */
public void add3(){
     int j=1;   //������
	for(int i=5;i>0;i--){
		j*=i;
		}	
	System.out.println("j�ĽY��:"+j);
}




/**
 * 9*9�˷���
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
 