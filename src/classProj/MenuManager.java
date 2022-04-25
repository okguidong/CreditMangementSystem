package classProj;

import java.util.*;

public class MenuManager {
	public static void main(String[] args) {
		Kind add = new Kind();
		ArrayList<Kind> list = new ArrayList<>();

		int num = 0;
		Scanner input = new Scanner(System.in);
		
		ManagerMethods m = new ManagerMethods();

		while(num != 6) {
			System.out.println("1. Add Credits"); //학점 추가
			System.out.println("2. Delete Credits"); //학점 삭제
			System.out.println("3. Edit Credits"); //학점 수정
			System.out.println("4. View Credits"); //학점 일람
			System.out.println("5. Show menu"); //메뉴 출력
			System.out.println("6. Exit"); //종료
			System.out.print("Enter a command: ");
			num = input.nextInt();
			input.nextLine();		

			if(num == 1) {
				m.addcredits();
			}
			else if(num == 2) {
				m.deletecredits();
			}
			else if(num == 3) {
				m.editcredits();
			}
			else if(num == 4) {
				m.viewcredits();
			}

		}
	}
}

