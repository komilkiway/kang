package cho7_while;

import java.util.Scanner;

public class QuizWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//3���� ���ڸ� �Է¹ް�, �Է¹��� ���� ���� ���Ѵ� �ڵ带 �ۼ��ϼ���
		//- +(plus)���� ���� �� �ֽ��ϴ�
//		int n1=0, n2=0, n3=0, tot=0;
//		do {
//			System.out.println("3���� ���� �Է�> ");
//			n1=scanner.nextInt();
//			n2=scanner.nextInt();
//			n3=scanner.nextInt();
//			if(n1>0 && n2>0 && n3>0) {
//				tot=n1+n2+n3;
//				break;
//			}
//		}while(n1<0 || n2<0 || n3<0);
//		System.out.println("3�� ������ ��: "+tot); 
		//�ʿ��� �����͸��� �Է��ϰ� ó���ϱ����� �ٽ� �ۼ�
//		int data=0, sum=0, count=1;
//		while(count<=3) {
//			System.out.println(count+"��° ���� �Է�> ");
//			data=scanner.nextInt();
//			if(data>0) {
//				sum+=data;
//				count++;
//			}
//		}
//		System.out.println("3�� ������ ��: "+sum);
		
		// ����, ������ �Է¹޾Ƽ� ����ϴ� �ڵ带 �ۼ��ϼ���
		//- ����: 0~130 ���̸� ����
		//  ����:  m, f �� ����
//		int age=0, mage=130;
//		char gender=' ';
//		while(true) {
//			System.out.println("���� �Է�> ");
//			age=scanner.nextInt();
//			if(age<mage)
//				break;
//		}
//		while(true) {
//			System.out.println("���� �Է�> ");
//			gender=scanner.next().charAt(0);
//			if(gender=='m' || gender=='f')
//				break;
//		}
//		System.out.println("����: "+age+"-����: "+gender);
		
		//ġ�� 10box�� ����Ǿ� �ִ� â�� 1���� �㰡 ��� �ֽ��ϴ�
		//ġ�� 1box=1kg
		//�� �Ѹ����� �Ϸ翡 ���� �� �ִ� ġ���� ���� 20g�̰�,
		//ġ� ���� 10��° �Ǵ� ������ ���� ��ü ���� 2�辿 �����մϴ�
		//���ϸ��� â�� �ִ� ġ� ��� �԰Եǰ�, �̶������� ���� ��ü ���� ���ϴ� �ڵ带 �ۼ��ϼ���
//		int cheese= 10000, mouse=2, mcheese=20, day=1;
//		//cheese: ��üġ���� ��, mouse: ���� ��ü��, mcheese: ��1�������ϼ��� ġ�
//		//day: ��¥
//		int boxcount=9000, box=10, lcheese=0;
//		//boxcount: 1000�� �پ�鶧���� �ڽ��� ���� �������ظ��� ����
//		//box: �ڽ��� ����, lcheese: ������ ġ���� ����
//		while(cheese>0){
//			if(day%10==0) {
//				mouse*=2;
//			}//10���� ������ ���� ��ü��2����
//			day++;
//			cheese-=mouse*mcheese;
//			if(cheese<=boxcount) {
//				boxcount-=1000;
//				box--;
//			}//cheese�� 1000�ٶ����� �ڽ��� �ϳ��� ���� boxcount�� 1000����
//			System.out.println("Day: "+(day-1)+"-��: "+mouse);
//			System.out.println("����box: "+box+"-����cheese(g): "+cheese);
//			if(cheese<mouse*mcheese){
//				box--;
//				day++;
//				lcheese=mouse*mcheese-cheese;
//				break;
//			}//������ �ϼ��� ���� ġ� �����ѳ�  ���� �ڵ带 �����ϰ� Ż���ؾ��ϱ⶧���� ���� �ϴܿ� �ۼ�
//		}//cheese�� ������ ����ؼ� �ݺ� ������ Ż��
//		System.out.println("Day: "+(day-1)+"-��: "+mouse);
//		System.out.println("����box: "+box+"-������cheese(g): "+lcheese);
//		//dowhile��, while�� ���ప�� ����
		
		//���ּ�, ���ְ��� ��� �ѱ��� ���� �����ϰ� Ȯ�� �� �� �ִ� �ڵ带 �ۼ��ϼ���
		//- 1.���ּҵ��  2.��ҵ�� 3.Ȯ��
		//- 0.�� �ԷµǸ� ����˴ϴ�
		String home="", homeb="", placea1="", placeb1="";
		int n1[], n2=0, j=0;
		do {
			System.out.println("1.���ּҵ�� 2.��ҵ�� 3.Ȯ�� 0.����");vb 
			System.out.print("��ȣ�� �����ϼ���> ");
			int n= scanner.nextInt();	//n�� ��ĳ�� ���� ����
			scanner.nextLine();
			if(n==0) {
				break;
			}else if(n==1) {
				System.out.println("---���ּ� ���---");
				System.out.print("��� ���ÿ� ���� �Է����ּ���> ");
				home= scanner.nextLine();
				System.out.print("���ּҸ� �Է����ּ���> ");
				homeb= scanner.nextLine();//�ѹ��� �Է��Ͽ� ���ּ� ���
			}else if(n==2) {
				System.out.println("---"+(j+1)+"��� ���---");
				System.out.print("����� �ÿ� ���� �Է����ּ���> ");
				placea1= scanner.nextLine();
				System.out.print("���ּҸ� �Է����ּ���> ");
				placeb1= scanner.nextLine();//��ҵ��
				j++;
			}else if(n==3) {
				if(home=="" && placea1=="") {
					System.out.println("����Ͻ� ���ּҰ� �����ϴ�...");
					System.out.println("����Ͻ� ��Ұ� �����ϴ�...");					
				}else if(home=="") {
					System.out.println("����Ͻ� ���ּҰ� �����ϴ�...");
				}else if(placea1=="") {
					System.out.println("����Ͻ� ��Ұ� �����ϴ�...");					
				}
				if(home!="" && placea1!="") {
					System.out.println("---���ּ�---");
					System.out.println(home);
					System.out.println(homeb);
					System.out.println("---"+j+"�� ���---");
					System.out.println(placea1);
					System.out.println(placeb1);
				}else if(home!="") {
					System.out.println("---���ּ�---"); 
					System.out.println(home);
					System.out.println(homeb);
				}else if(placea1!="") {
					System.out.println("---"+j+"�� ���---");
					System.out.println(placea1);
					System.out.println(placeb1);
				}
			}else if(n<0 || n>3) {
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�...");
				System.out.println("�ٽ� �Է��Ͻʽÿ�...");
			}
			System.out.println("ó��ȭ������ ���ư��ϴ�...");
			continue;
		}while(true);
		System.out.println("homea: "+home);
	}
	
}
