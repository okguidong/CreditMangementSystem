package classProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditManagermentSystem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3669365244745928074L;

	ArrayList<KindCredit> KClist = new ArrayList<>();

	transient Scanner input;

	public CreditManagermentSystem() {

	}
	
	CreditManagermentSystem(Scanner input) {
		this.input = input;
	}

	
	public int size() {
		return KClist.size();
	}
	
	public KindCredit get(int idex) {
		return KClist.get(idex);
	}
	
	public void add() { //과외생을 추가하는 함수
		KindCredit KC = new KindCredit();

		System.out.print("과목이름을 입력하시오 : ");
		KC.setName(input.nextLine());
		System.out.print("점수를 입력하시오 : ");
		KC.setScore(input.nextFloat());
		System.out.print("이수학점을 입력하시오 : ");
		KC.setCredit(input.nextInt());
		System.out.print("종류를 입력하시오 1)교양, 2)전공: ");
		KC.setKind(input.nextInt());
		input.next();
		System.out.println("");

		this.KClist.add(KC); //과외생의 수를 늘림
	}

	public void delete() { //과외생을 삭제하는 함수
		try {
			System.out.print("몇 번째 과목을 삭제하시겠습니까?: ");
			int number = input.nextInt();
			input.nextLine();

			if (number < KClist.size()) { //과외생의 수를 줄임
				KClist.remove(number);
				System.out.println("수업이 삭제되었습니다.");
				input.nextLine();
			}
			else {
				System.out.println("수업이 존재하지 않습니다.");
				input.nextLine();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}

	}

	public void edit() { //과외생 정보를 수정하는 함수
		try {
			System.out.print("몇 번째 수업을 수정하시겠습니까?: ");
			int number = input.nextInt();
			input.nextLine();
			if(number > KClist.size()) {
				System.out.println("수업이 존재하지 않습니다.");
				System.out.println("");
			}
			else {
				KClist.remove(number);
				KindCredit KC = new KindCredit();

				System.out.print("과목이름을 입력하시오 : ");
				KC.setName(input.nextLine());
				System.out.print("점수를 입력하시오 : ");
				KC.setScore(input.nextFloat());
				System.out.print("이수학점을 입력하시오 : ");
				KC.setCredit(input.nextInt());
				System.out.print("종류를 입력하시오 1)교양, 2)전공: ");
				KC.setKind(input.nextInt());
				System.out.println("");
				System.out.println("");
				this.KClist.add(number, KC);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}
	}

	public void view() { //모든 과외생들의 정보를 출력하는 함수 
		for(int i =0;i <KClist.size(); i++)	{
			KClist.get(i).printInfo();
		}
		System.out.println(average('a'));
		System.out.println(average('j'));
		System.out.println(average('k'));
	}
	public float average(char x) {
		float ad = 0,au = 0,kd = 0,ku = 0,ju = 0,jd=0;
		for(int i =0;i <KClist.size(); i++)	{
			if(KClist.get(i).getKind().equals("교양")) {
				ku +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				au +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				
				kd +=KClist.get(i).getCredit();
				ad +=KClist.get(i).getCredit();
			}
			else if(KClist.get(i).getKind().equals("전공")) {
				ju +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				au +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				
				jd +=KClist.get(i).getCredit();
				ad +=KClist.get(i).getCredit();	
			}
		}
		if(x=='a') {
			return au/ad;
		}
		else if(x=='k') {
			return ku/kd;
		}
		else if(x=='j') {
			return ju/jd;
		}
		return 0;
	}
}
