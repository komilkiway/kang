package ch06_for;

import java.util.Scanner;

public class QuizFor {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//������ ���� ��ŭ�� '*'�� ����ϴ� �ڵ带 �ۼ��ϼ���
		//-Ex) Ƚ��: 5
		//		*****
//		System.out.println("�ݺ��� Ƚ���� �Է�> ");
//		int n= scanner.nextInt();
//		for(int i=1; i<=n; i++) {
//			System.out.print("*");
//		}
		
		//1~50������ 3�� 7�� ����� ����ϰ�, ������ ����� ���� ���ϴ� �ڵ带 �ۼ��ϼ���
		//��, 3�� ����̸鼭 7�� ����� �Ǵ� ���� �ѹ��� ��µǾ�� �մϴ�
//		int threetot=0, seventot=0;
//		for(int i=1;  i<=50; i++) {
//			if(i%3==0 && i%7==0) {
//				System.out.println(i);
//				seventot+=i;
//				threetot+=i;
//			}else if(i%3==0) {
//				System.out.println(i);
//				threetot+=i;
//			}else if(i%7==0) {
//				System.out.println(i);
//				seventot+=i;
//			}
//		}
//		System.out.println("3�� 7�� ����� ��:"+tot);
		
		//���ĺ� �빮�� A~Z������ for���� ����ؼ� ����ϴ� �ڵ带 �ۼ��ϼ���
		//for���� �ѹ� ���� �� �� ���� ���ĺ� �ϳ��� ��µǾ�� �մϴ�
		//�ƽ�Ű�ڵ�A~Z(65~90)
//		for( i=65; i<=90; i++) {
//			System.out.println((char)i + " ");
//			al+=1;
//		}
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.println(ch);
//			if(ch!='Z')
//				System.out.println(", ");
//		}
			
		//ù������ ���忡 1���� �Ա��ϰ�, ��°�� ���ʹ� ���� �Աݾ��� 2�踦 �Ա��ϴ� �������,
		//ù�� 30�� ���� �Ա��� �� �ݾ��� ���ϴ� �ڵ带 �ۼ��ϼ���
//		int tot=0, stot=0, mtot=2;
//		//tot: �� �վ�, stot: �ϼ����� �ݾ� mtot: ���ϱ� 2
//		for(int i=1; i<=30; i++) {
//			if(i!=1) {
//				stot*=mtot;
//				tot+=stot;
//			}else if(i==1){
//				stot+=i;
//				tot+=stot;
//			}//�ʱⰪ ����: 1�� ��� stot�� i�� ���ϰ� tot�� stot���� ���Ͽ� ����  
//			 //�ݺ� ���ϱ� �����: 1�� �ƴ϶�� stot�� mtot�� ���ϰ� tot�� stot���� ���Ͽ� ���� 
//		}//30�� for�� ����
//		System.out.println("�ѱݾ�: "+tot);
		
		//��Ʈ�����ڸ� �̿��� �ڵ� �����غ���
//		int money2= 1;
//		int balance2= 0;
//		balance2=(money2<<30);
//		System.out.println("�ѱݾ�: "+tot);
		
		//�Ʒ��� ���� ����� �����ϴ� �ڵ带 �ۼ��ϼ���
		//1  2  3  4  5 
		//6  7  8  9  10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		
//		int count5m= 5, count10m=10;//count10m:10�� ����� ī��Ʈ
//		
//		for(int i=1; i<=25; i++) {
//			if(count5m>count10m) {
//				System.out.print(i+" ");
////				if(i==counts*10) {
////					System.out.print("\n");
////					System.out.print(counts*10+"~"+counts*100+": ");
////					counts*=10;
////				} //100~1000, 1000~10000�� ���°��� ����ǥ�ø� �ڵ��غ�
//			}else if(i<=count5m) {
//				System.out.print(i+"  ");
//			}
//			if(i%count5m==0) {
//				System.out.print("\n");
//				count5m+=5;
//			}
//			//������ �� if���ȿ� �־ ���� �����ߴµ� �ۼ��ϰ� ���� if���� 
//			//������ ��� ������ ���ٰ� �����Ͽ� �����Ͽ��µ� ���� ������
//		}
//		int count5m= 5; 	//5�� ��� ī��Ʈ
//		
//		for(int i=1; i<=25; i++) {
//			if(count5m>10) {
//				System.out.print(i+" ");
//				//println�޼ҵ�� ��½� �߻��ϴ� �������̸� print �޼ҵ�� �ٲپ� �ذ�
//				if(i%count5m==0) {
//					System.out.print("\n");
//					//println�޼ҵ�� ��½� �߻��ϴ� �������̸� print �޼ҵ�� �ٲپ� �ذ�
//					count5m+=5;
//				}
//			}else if(i<=count5m) {
//				System.out.print(i+"  ");
//				if(i%count5m==0) {
//					System.out.print("\n");
//					//println�޼ҵ�� ��½� �߻��ϴ� �������̸� print �޼ҵ�� �ٲپ� �ذ�
//					count5m+=5;
//				}//10���� ��µǴ� �ڵ�� �̻� ������ 11�̻� �Ǵ� ���� �����
//				 //���⸦ 1ĭ�� �ؾ��ϴ°��� �����������
//			}
				
//			}else if(i<=10) {				
//				System.out.println(i+"  ");
//					if(i==10) {
//						System.out.println("\n");
//					} //count5m�� �߰��ϱ��� ����� ����� ������ �ʿ��ϴ� ������ �ۼ�
			
	}
		
}
	

