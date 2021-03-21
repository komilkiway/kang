package cho7_while;

import java.util.Scanner;

public class QuizWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//3개의 숫자를 입력받고, 입력받은 수의 합을 구한느 코드를 작성하세요
		//- +(plus)값만 더할 수 있습니다
//		int n1=0, n2=0, n3=0, tot=0;
//		do {
//			System.out.println("3개의 숫자 입력> ");
//			n1=scanner.nextInt();
//			n2=scanner.nextInt();
//			n3=scanner.nextInt();
//			if(n1>0 && n2>0 && n3>0) {
//				tot=n1+n2+n3;
//				break;
//			}
//		}while(n1<0 || n2<0 || n3<0);
//		System.out.println("3개 숫자의 합: "+tot); 
		//필요한 데이터만을 입력하게 처리하기위해 다시 작성
//		int data=0, sum=0, count=1;
//		while(count<=3) {
//			System.out.println(count+"번째 숫자 입력> ");
//			data=scanner.nextInt();
//			if(data>0) {
//				sum+=data;
//				count++;
//			}
//		}
//		System.out.println("3개 숫자의 합: "+sum);
		
		// 나이, 성별을 입력받아서 출력하는 코드를 작성하세요
		//- 나이: 0~130 사이만 가능
		//  성별:  m, f 만 가능
//		int age=0, mage=130;
//		char gender=' ';
//		while(true) {
//			System.out.println("나이 입력> ");
//			age=scanner.nextInt();
//			if(age<mage)
//				break;
//		}
//		while(true) {
//			System.out.println("성별 입력> ");
//			gender=scanner.next().charAt(0);
//			if(gender=='m' || gender=='f')
//				break;
//		}
//		System.out.println("나이: "+age+"-성별: "+gender);
		
		//치즈 10box가 저장되어 있는 창고에 1쌍의 쥐가 살고 있습니다
		//치즈 1box=1kg
		//쥐 한마리가 하루에 먹을 수 있는 치즈의 양은 20g이고,
		//치즈를 먹은 10일째 되는 날마다 쥐의 객체 수가 2배씩 증가합니다
		//몇일만에 창고에 있는 치즈를 모두 먹게되고, 이때까지의 쥐의 객체 수를 구하는 코드를 작성하세요
//		int cheese= 10000, mouse=2, mcheese=20, day=1;
//		//cheese: 전체치즈의 양, mouse: 쥐의 개체수, mcheese: 쥐1마리일일섭취 치즈량
//		//day: 날짜
//		int boxcount=9000, box=10, lcheese=0;
//		//boxcount: 1000이 줄어들때마다 박스의 수를 세기위해만든 변수
//		//box: 박스의 개수, lcheese: 부족한 치즈의 개수
//		while(cheese>0){
//			if(day%10==0) {
//				mouse*=2;
//			}//10일이 지나면 쥐의 개체수2증가
//			day++;
//			cheese-=mouse*mcheese;
//			if(cheese<=boxcount) {
//				boxcount-=1000;
//				box--;
//			}//cheese가 1000줄때마다 박스를 하나씩 감소 boxcount를 1000감소
//			System.out.println("Day: "+(day-1)+"-쥐: "+mouse);
//			System.out.println("남은box: "+box+"-남은cheese(g): "+cheese);
//			if(cheese<mouse*mcheese){
//				box--;
//				day++;
//				lcheese=mouse*mcheese-cheese;
//				break;
//			}//마지막 일수는 먹을 치즈가 부족한날  위에 코드를 실행하고 탈출해야하기때문에 제일 하단에 작성
//		}//cheese가 있으면 계속해서 반복 없으면 탈출
//		System.out.println("Day: "+(day-1)+"-쥐: "+mouse);
//		System.out.println("남은box: "+box+"-부족한cheese(g): "+lcheese);
//		//dowhile문, while문 실행값은 같다
		
		//집주소, 자주가는 장소 한군데 씩을 저장하고 확인 할 수 있는 코드를 작성하세요
		//- 1.집주소등록  2.장소등록 3.확인
		//- 0.이 입력되면 종료됩니다
		String home="", homeb="", placea1="", placeb1="";
		int n1[], n2=0, j=0;
		do {
			System.out.println("1.집주소등록 2.장소등록 3.확인 0.종료");vb 
			System.out.print("번호를 선택하세요> ");
			int n= scanner.nextInt();	//n에 스캐너 값을 담음
			scanner.nextLine();
			if(n==0) {
				break;
			}else if(n==1) {
				System.out.println("---집주소 등록---");
				System.out.print("사는 도시와 구를 입력해주세요> ");
				home= scanner.nextLine();
				System.out.print("상세주소를 입력해주세요> ");
				homeb= scanner.nextLine();//한번에 입력하여 집주소 등록
			}else if(n==2) {
				System.out.println("---"+(j+1)+"장소 등록---");
				System.out.print("장소의 시와 구를 입력해주세요> ");
				placea1= scanner.nextLine();
				System.out.print("상세주소를 입력해주세요> ");
				placeb1= scanner.nextLine();//장소등록
				j++;
			}else if(n==3) {
				if(home=="" && placea1=="") {
					System.out.println("등록하신 집주소가 없습니다...");
					System.out.println("등록하신 장소가 없습니다...");					
				}else if(home=="") {
					System.out.println("등록하신 집주소가 없습니다...");
				}else if(placea1=="") {
					System.out.println("등록하신 장소가 없습니다...");					
				}
				if(home!="" && placea1!="") {
					System.out.println("---집주소---");
					System.out.println(home);
					System.out.println(homeb);
					System.out.println("---"+j+"번 장소---");
					System.out.println(placea1);
					System.out.println(placeb1);
				}else if(home!="") {
					System.out.println("---집주소---"); 
					System.out.println(home);
					System.out.println(homeb);
				}else if(placea1!="") {
					System.out.println("---"+j+"번 장소---");
					System.out.println(placea1);
					System.out.println(placeb1);
				}
			}else if(n<0 || n>3) {
				System.out.println("값을 잘못 입력하셨습니다...");
				System.out.println("다시 입력하십시오...");
			}
			System.out.println("처음화면으로 돌아갑니다...");
			continue;
		}while(true);
		System.out.println("homea: "+home);
	}
	
}
