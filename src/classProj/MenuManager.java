package classProj;

import java.util.*;

public class MenuManager {
	public static void main(String[] args) {
		//Kind add = new Kind();
		//ArrayList<Kind> list = new ArrayList<>();

		int num = 0;
		Scanner input = new Scanner(System.in);
		
		ManagerMethods m = new ManagerMethods();

		while(num != 6) {
			menu menu = new menu();
			num = input.nextInt();
			input.nextLine();		

			if(num == 1) {
				m.addcredits();
			}
			else if(num == 2) {
				System.out.println("어떤 방법으로 삭제하시겠습니까? 1. 이름으로 삭제 2.번째로 삭제");
				for (int i = 0; i < m.list.size(); i++) 
				{
					System.out.print(i+"./");
					m.list.get(i).print();
				}
				
				int how;
				how = input.nextInt();
				if(how == 1) {
					String delete = input.nextLine();
				m.deletecredits(delete);
				}
				else if(how == 2) {
					int delete = input.nextInt();
					delete+=1;
					m.deletecredits(delete);
				}	
			}
			
			else if(num == 3) {
				m.editcredits();
			}
			else if(num == 4) {
				m.viewcredits();
			}
			else if(num == 5) {
				m.Calculation();
			}

		}
	}
}

