import java.util.Scanner;

public class Menumanager {

	public static void main(String[] args) {
		int num=5;
		Scanner input = new Scanner(System.in);

		while(num != 6) {
			System.out.println("1. Add Credits");//학점 추가
			System.out.println("2. Delete Credits");//학점 삭제
			System.out.println("3. Edit Credits");//학점 수정
			System.out.println("4. View Credits");//학점 보기
			System.out.println("5. Show menu");//메뉴보기
			System.out.println("6. Exit");//나가기
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("subject name:");//"과목이름: "출력
				String SubjectName=input.next();//과목이름 입력
				System.out.print("credit score:\n ex) 4.5,4,3.5,2.5,2,1.5,1,0.5,0");//"과목 점수:" 출력
				float CreditScore=input.nextFloat(); //과목점수 입력
				System.out.print("credit:");//"이수학점:" 출력
				int Credit=input.nextInt();//이수학점 입력
			case 2:
			case 3:
			case 4:
			case 5:
			}
		}
	}

}
