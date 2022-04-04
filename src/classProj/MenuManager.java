package classProj;

import java.util.*;

public class MenuManager {
	
	static ArrayList<String> SubjectName = new ArrayList<String>(); //ArrayList��� collection�� ����Ѵ�
	static ArrayList<Float> CreditScore = new ArrayList<Float>();
	static ArrayList<Integer> Credit = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;

		while(num != 6) {
			System.out.println("1. Add Credits"); //���� �߰�
			System.out.println("2. Delete Credits"); //���� ����
			System.out.println("3. Edit Credits"); //���� ����
			System.out.println("4. View Credits"); //���� �϶�
			System.out.println("5. Show menu"); //�޴� ���
			System.out.println("6. Exit"); //����
			System.out.print("Enter a command: ");
			num = input.nextInt();
			input.nextLine();		
			
			if(num == 1) {
				addcredits();
			}
			else if(num == 2) {
				deletecredits();
			}
			else if(num == 3) {
				editcredits();
			}
			else if(num == 4) {
				viewcredits();
			}
		}
	}
	
	public static void addcredits() 
	{
		System.out.print("Enter subject name: ");
		SubjectName.add(input.nextLine()); //�� ���ҵ��� ArrayList�� �־��ش�
		System.out.print("Enter credit score: ");
		CreditScore.add(input.nextFloat());
		System.out.print("Enter credit: ");
		Credit.add(input.nextInt());
		input.nextLine();
	}
	
	public static void deletecredits() 
	{
		System.out.print("Which index do you want to delete?: ");
		int ridx = input.nextInt(); //���� ������ �ε����� �Է¹ް�
		input.nextLine();
		
		SubjectName.remove(ridx); //�ش� �ε����� �ش��ϴ� ���ҵ��� �����Ѵ�
		CreditScore.remove(ridx);
		Credit.remove(ridx);
	}
	
	public static void editcredits() 
	{
		System.out.print("Which index do you want to edit?: ");
		int eidx = input.nextInt();
		input.nextLine();
		
		SubjectName.remove(eidx); //�ش� �ε����� �ִ� ���ҵ��� �����
		CreditScore.remove(eidx);
		Credit.remove(eidx);
		
		System.out.print("Enter subject name: "); //�ش� �ε����� �ٽ� ���ҵ��� �߰��Ͽ� �ش�
		SubjectName.add(eidx, input.nextLine());
		System.out.print("Enter credit score: ");
		CreditScore.add(eidx, input.nextFloat());
		System.out.print("Enter credit: ");
		Credit.add(eidx, input.nextInt());
		input.nextLine();
		
	}
	
	public static void viewcredits() 
	{
		for(int i = 0; i < SubjectName.size(); i++) { //�� ArrayList�� ũ�⸸ŭ �ݺ��Ͽ� ����ϸ� �ȴ�
			System.out.println("Subject Name: " + SubjectName.get(i));
			System.out.println("Credit Score: " + CreditScore.get(i));
			System.out.println("Credit: " + Credit.get(i));
		}
	}
	
}