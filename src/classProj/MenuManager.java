package classProj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import log.EventLogger;

public class MenuManager implements Serializable{
	private static final long serialVersionUID = -2031193876552779388L;
	
	static EventLogger logger = new EventLogger("log.txt");
	
	
	public static void main(String[] args) {
		int num = 0;//�ʹ� �޴��� ǥ���ϱ� ���� 0���� ����
		Scanner input = new Scanner(System.in);
		
		ManagerMethods ManagerMethods=  getObject("ManagerMethods.ser");
		if(ManagerMethods == null) {
			ManagerMethods = new ManagerMethods();
		}
		
		putObject(ManagerMethods, "ManagerMethods.ser");

		while(num != 6) {
			menu();
			num = input.nextInt();
			input.nextLine();		

			if(num == 1) {
				ManagerMethods.addcredits();
				logger.log("add a credit");
				}
				
			else if(num == 2) {
				System.out.println("� ������� �����Ͻðڽ��ϱ�? 1. �̸����� ���� 2.��°�� ����");
				for (int i = 0; i < ManagerMethods.list.size(); i++) 
				{
					System.out.print(i+"./");
					ManagerMethods.list.get(i).print();
				}
				
				int how;
				how = input.nextInt();
				if(how == 1) {
					System.out.print("� ������ ���� �Ͻðڽ��ϱ�?(): ");
					String delete = input.nextLine();
				ManagerMethods.deletecredits(delete);
				}
				else if(how == 2) {
					System.out.print("� ������ ���� �Ͻðڽ��ϱ�?(): ");
					int delete = input.nextInt();
					ManagerMethods.deletecredits(delete);
				}
				logger.log("delete a credit");
			}			
			else if(num == 3) {
				for (int i = 0; i < ManagerMethods.list.size(); i++) {
				ManagerMethods.list.get(i).print();
				}
				
				ManagerMethods.editcredits();
				logger.log("add a edit");
			}
			else if(num == 4) {
				ManagerMethods.viewcredits();
				logger.log("edit a list of credit");
			}
			else if(num == 5) {
				ManagerMethods.Calculation();
			}
		}
	}
	
	public static void menu() {
		System.out.println("1. Add Credits"); //���� �߰�
		System.out.println("2. Delete Credits"); //���� ����
		System.out.println("3. Edit Credits"); //���� ����
		System.out.println("4. View Credits"); //���� �϶�
		System.out.println("5. Show Average"); //��� ���
		System.out.println("6. Exit"); //����
		System.out.print("Enter a command: ");
	}
	
	public static ManagerMethods getObject(String filename) {
		ManagerMethods managermethods =null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			managermethods = (ManagerMethods)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return managermethods;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return managermethods;
	}
	
	public static void putObject(ManagerMethods managerMethods, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(managerMethods);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

