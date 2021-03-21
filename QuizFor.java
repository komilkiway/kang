package ch06_for;

import java.util.Scanner;

public class QuizFor {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//지정한 숫자 만큼의 '*'을 출력하는 코드를 작성하세요
		//-Ex) 횟수: 5
		//		*****
//		System.out.println("반복할 횟수를 입력> ");
//		int n= scanner.nextInt();
//		for(int i=1; i<=n; i++) {
//			System.out.print("*");
//		}
		
		//1~50사이의 3과 7의 배수를 출력하고, 각각의 배수의 합을 구하는 코드를 작성하세요
		//단, 3의 배수이면서 7의 배수도 되는 수는 한번만 출력되어야 합니다
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
//		System.out.println("3과 7의 배수의 합:"+tot);
		
		//알파벳 대문자 A~Z까지를 for문을 사용해서 출력하는 코드를 작성하세요
		//for문이 한번 실행 될 때 마다 알파벳 하나씩 출력되어야 합니다
		//아스키코드A~Z(65~90)
//		for( i=65; i<=90; i++) {
//			System.out.println((char)i + " ");
//			al+=1;
//		}
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.println(ch);
//			if(ch!='Z')
//				System.out.println(", ");
//		}
			
		//첫날에는 통장에 1원을 입금하고, 둘째날 부터는 전날 입금액의 2배를 입금하는 방식으로,
		//첫날 30일 동안 입금한 총 금액을 구하는 코드를 작성하세요
//		int tot=0, stot=0, mtot=2;
//		//tot: 총 합액, stot: 일수마다 금액 mtot: 곱하기 2
//		for(int i=1; i<=30; i++) {
//			if(i!=1) {
//				stot*=mtot;
//				tot+=stot;
//			}else if(i==1){
//				stot+=i;
//				tot+=stot;
//			}//초기값 설정: 1이 라면 stot에 i를 더하고 tot에 stot값을 더하여 저장  
//			 //반복 더하기 만들기: 1이 아니라면 stot에 mtot를 곱하고 tot에 stot값을 더하여 저장 
//		}//30일 for문 종료
//		System.out.println("총금액: "+tot);
		
		//비트연산자를 이용한 코딩 이해해보기
//		int money2= 1;
//		int balance2= 0;
//		balance2=(money2<<30);
//		System.out.println("총금액: "+tot);
		
		//아래와 같은 출력을 진행하는 코드를 작성하세요
		//1  2  3  4  5 
		//6  7  8  9  10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		
//		int count5m= 5, count10m=10;//count10m:10의 배수를 카운트
//		
//		for(int i=1; i<=25; i++) {
//			if(count5m>count10m) {
//				System.out.print(i+" ");
////				if(i==counts*10) {
////					System.out.print("\n");
////					System.out.print(counts*10+"~"+counts*100+": ");
////					counts*=10;
////				} //100~1000, 1000~10000을 세는것을 구별표시를 코딩해봄
//			}else if(i<=count5m) {
//				System.out.print(i+"  ");
//			}
//			if(i%count5m==0) {
//				System.out.print("\n");
//				count5m+=5;
//			}
//			//위에는 두 if문안에 넣어서 따로 실행했는데 작성하고 안의 if문을 
//			//밖으로 빼어도 문제가 없다고 생각하여 변경하였는데 문제 없었음
//		}
//		int count5m= 5; 	//5의 배수 카운트
//		
//		for(int i=1; i<=25; i++) {
//			if(count5m>10) {
//				System.out.print(i+" ");
//				//println메소드로 출력시 발생하는 실행차이를 print 메소드로 바꾸어 해결
//				if(i%count5m==0) {
//					System.out.print("\n");
//					//println메소드로 출력시 발생하는 실행차이를 print 메소드로 바꾸어 해결
//					count5m+=5;
//				}
//			}else if(i<=count5m) {
//				System.out.print(i+"  ");
//				if(i%count5m==0) {
//					System.out.print("\n");
//					//println메소드로 출력시 발생하는 실행차이를 print 메소드로 바꾸어 해결
//					count5m+=5;
//				}//10까지 출력되는 코드는 이상 없지만 11이상 되는 곳에 적용시
//				 //띄어스기를 1칸을 해야하는것을 고려하지못함
//			}
				
//			}else if(i<=10) {				
//				System.out.println(i+"  ");
//					if(i==10) {
//						System.out.println("\n");
//					} //count5m을 추가하기전 상수로 기능을 놓을때 필요하다 생각해 작성
			
	}
		
}
	

