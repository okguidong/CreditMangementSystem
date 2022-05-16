package classProj;

import java.util.*;

public class ManagerMethods {

	static ArrayList<Kind> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	MyException Ex = new MyException();

	public void addcredits() 
	{
		Kind add = new Kind();
		System.out.print("과목이름을 입력하세요");
		add.setname(input.nextLine());
		try {
			System.out.print("과목 점수를 입력하세요");
			add.setscore(input.nextFloat());
			System.out.print("과목 학점을 입력하세요 ");
			add.setcredit(input.nextInt());
			System.out.println("교양,전공?");
			String kind = input.next();
			Ex.kindbadcode(kind);
			add.setkind(kind);
			list.add(add);
			input.nextLine();
		}
		catch(InputMismatchException a) {
			System.out.println("타입에 맞게 입려하시오");
			input.nextLine();
		}
		catch(Exception e){
			System.out.println("오류:교양과 전공 중 입력하세요");	
			input.nextLine();
		}
	}

	public void deletecredits(String a) 
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		String delete = input.nextLine(); //값이 삭제될 과목를 입력받고
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getname().equals(delete))
				list.remove(i);
		}
	}

	public void deletecredits(int a) 
	{
		try {
			Ex.indexover(a);
			list.remove(a);
			input.nextLine();
			
		}catch(Exception e) {
			System.out.println("오류: 리스트 범위를 벗어났습니다.");
			input.nextLine();
		}	
	}


	public void editcredits() 
	{
		System.out.print("수정할 과목의 이름을 입력하시오: ");
		String eidx = input.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getname().equals(eidx)) {
				try {
					System.out.println("수정할 이름을 입력하시오");
					String eidxname = input.nextLine();
					list.get(i).setname(eidxname);

					System.out.println("수정할 점수를 입력하시오");
					float eidxscore = input.nextFloat();
					list.get(i).setscore(eidxscore);

					System.out.println("수정할 학점을 입력하십시오");
					int eidxcredit = input.nextInt();
					list.get(i).setcredit(eidxcredit);

					System.out.println("수정할 과목 종류를 입력하시오(교양,전공)");
					String eidxkind = input.nextLine();
					Ex.kindbadcode(eidxkind);
					list.get(i).setkind(eidxkind);
					input.nextLine();
				}
				catch(InputMismatchException a) {
					System.out.println("타입에 맞게 입려하시오");
					input.nextLine();
				}
				catch(Exception e) {
					System.out.println("오류:교양과 전공 중 입력하세요");
					input.nextLine();

				}
			}
		}

	}

	public void viewcredits() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
	}
	public void Calculation() {
		float x=0;
		float y=0;
		float z=0;
		float a=0;
		float b=0;
		float c=0;


		for (int i = 0; i < list.size(); i++) {
			x+= list.get(i).averageUp("교양");
			y+= list.get(i).averageUp("전공");
			z+= list.get(i).averageUp("전체");

			a+= list.get(i).averageDown("교양");
			b+= list.get(i).averageDown("전공");
			c+= list.get(i).averageDown("전체");

		}
		System.out.println("교양평균:"+x/a+"\n전공평균:"+y/b+"\n전체평균:"+z/c+"\n");

	}
}

class MyException {
	
	public void kindbadcode(String x)throws Exception {//과목울 츄가할때 교양과 전공을 입력할때 다른 문자열을 입력한다면 오류룰 발생
		if(!(x.equals("교양")||x.equals("전공"))) {
			throw new Exception();
		}
		}
	public void indexover(int i) throws Exception {//list의 인덱스를 넘어가는 인덱스를 선택할때 오류로 처리
		if(i > ManagerMethods.list.size()) {
			throw new Exception();
		}
	}
}

