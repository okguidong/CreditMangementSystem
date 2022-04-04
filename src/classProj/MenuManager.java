package classProj;

import java.util.*;

public class MenuManager {
	
	static ArrayList<String> SubjectName = new ArrayList<String>(); //ArrayList라는 collection을 사용한다
	static ArrayList<Float> CreditScore = new ArrayList<Float>();
	static ArrayList<Integer> Credit = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;

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
		SubjectName.add(input.nextLine()); //각 원소들을 ArrayList에 넣어준다
		System.out.print("Enter credit score: ");
		CreditScore.add(input.nextFloat());
		System.out.print("Enter credit: ");
		Credit.add(input.nextInt());
		input.nextLine();
	}
	
	public static void deletecredits() 
	{
		System.out.print("Which index do you want to delete?: ");
		int ridx = input.nextInt(); //값이 삭제될 인덱스를 입력받고
		input.nextLine();
		
		SubjectName.remove(ridx); //해당 인덱스에 해당하는 원소들을 삭제한다
		CreditScore.remove(ridx);
		Credit.remove(ridx);
	}
	
	public static void editcredits() 
	{
		System.out.print("Which index do you want to edit?: ");
		int eidx = input.nextInt();
		input.nextLine();
		
		SubjectName.remove(eidx); //해당 인덱스에 있는 원소들을 지우고
		CreditScore.remove(eidx);
		Credit.remove(eidx);
		
		System.out.print("Enter subject name: "); //해당 인덱스에 다시 원소들을 추가하여 준다
		SubjectName.add(eidx, input.nextLine());
		System.out.print("Enter credit score: ");
		CreditScore.add(eidx, input.nextFloat());
		System.out.print("Enter credit: ");
		Credit.add(eidx, input.nextInt());
		input.nextLine();
		
	}
	
	public static void viewcredits() 
	{
		for(int i = 0; i < SubjectName.size(); i++) { //한 ArrayList의 크기만큼 반복하여 출력하면 된다
			System.out.println("Subject Name: " + SubjectName.get(i));
			System.out.println("Credit Score: " + CreditScore.get(i));
			System.out.println("Credit: " + Credit.get(i));
		}
	}
	
}