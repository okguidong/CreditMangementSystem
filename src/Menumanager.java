import java.util.Scanner;

public class Menumanager {

	public static void main(String[] args) {
		int num=5;
		Scanner input = new Scanner(System.in);

		while(num != 6) {
			System.out.println("1. Add Credits");//���� �߰�
			System.out.println("2. Delete Credits");//���� ����
			System.out.println("3. Edit Credits");//���� ����
			System.out.println("4. View Credits");//���� ����
			System.out.println("5. Show menu");//�޴�����
			System.out.println("6. Exit");//������
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("subject name:");//"�����̸�: "���
				String SubjectName=input.next();//�����̸� �Է�
				System.out.print("credit score:\n ex) 4.5,4,3.5,2.5,2,1.5,1,0.5,0");//"���� ����:" ���
				float CreditScore=input.nextFloat(); //�������� �Է�
				System.out.print("credit:");//"�̼�����:" ���
				int Credit=input.nextInt();//�̼����� �Է�
			case 2:
			case 3:
			case 4:
			case 5:
			}
		}
	}

}
