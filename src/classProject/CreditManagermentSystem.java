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

	public ArrayList<KindCredit> KClist = new ArrayList<>();

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
	
	public void add() { 
		KindCredit KC = new KindCredit();

		System.out.print("�����̸��� �Է��Ͻÿ� : ");
		KC.setName(input.nextLine());
		System.out.print("������ �Է��Ͻÿ� : ");
		KC.setScore(input.nextFloat());
		System.out.print("�̼������� �Է��Ͻÿ� : ");
		KC.setCredit(input.nextInt());
		System.out.print("������ �Է��Ͻÿ� 1)����, 2)����: ");
		KC.setKind(input.nextInt());
		input.next();
		System.out.println("");

		this.KClist.add(KC); 
	}
	
	public void add (String name,float score,int credit,String kind ) { 
		KindCredit KC = new KindCredit();
		KC.setName(name);
		KC.setScore(score);
		KC.setCredit(credit);
		KC.setKind(kind);
		this.KClist.add(KC); 
	}
	public void add (KindCredit kindCredit) {
		KClist.add(kindCredit);	
	}

	public void delete() { 
		try {
			System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
			int number = input.nextInt();
			input.nextLine();

			if (number < KClist.size()) { 
				KClist.remove(number);
				System.out.println("������ �����Ǿ����ϴ�.");
				input.nextLine();
			}
			else {
				System.out.println("������ �������� �ʽ��ϴ�.");
				input.nextLine();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}

	}

	public void edit() {
		try {
			System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
			int number = input.nextInt();
			input.nextLine();
			if(number > KClist.size()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				System.out.println("");
			}
			else {
				KClist.remove(number);
				KindCredit KC = new KindCredit();

				System.out.print("�����̸��� �Է��Ͻÿ� : ");
				KC.setName(input.nextLine());
				System.out.print("������ �Է��Ͻÿ� : ");
				KC.setScore(input.nextFloat());
				System.out.print("�̼������� �Է��Ͻÿ� : ");
				KC.setCredit(input.nextInt());
				System.out.print("������ �Է��Ͻÿ� 1)����, 2)����: ");
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

	public void view() { 
		for(int i =0;i <KClist.size(); i++)	{
			KClist.get(i).printInfo();
		}
//		System.out.println(average('a'));
//		System.out.println(average('j'));
//		System.out.println(average('k'));
	}
	public float average(char x) {
		float ad = 0,au = 0,kd = 0,ku = 0,ju = 0,jd=0;
		for(int i =0;i <KClist.size(); i++)	{
			if(KClist.get(i).getKind().equals("����")) {
				ku +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				au +=KClist.get(i).getScore()*KClist.get(i).getCredit();
				
				kd +=KClist.get(i).getCredit();
				ad +=KClist.get(i).getCredit();
			}
			else if(KClist.get(i).getKind().equals("����")) {
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
