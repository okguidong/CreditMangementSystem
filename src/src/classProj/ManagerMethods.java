package classProj;

import java.util.*;

public class ManagerMethods {

	static ArrayList<Kind> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	MyException Ex = new MyException();

	public void addcredits() 
	{
		Kind add = new Kind();
		System.out.print("�����̸��� �Է��ϼ���");
		add.setname(input.nextLine());
		try {
			System.out.print("���� ������ �Է��ϼ���");
			add.setscore(input.nextFloat());
			System.out.print("���� ������ �Է��ϼ��� ");
			add.setcredit(input.nextInt());
			System.out.println("����,����?");
			String kind = input.next();
			Ex.kindbadcode(kind);
			add.setkind(kind);
			list.add(add);
			input.nextLine();
		}
		catch(InputMismatchException a) {
			System.out.println("Ÿ�Կ� �°� �Է��Ͻÿ�");
			input.nextLine();
		}
		catch(Exception e){
			System.out.println("����:����� ���� �� �Է��ϼ���");	
			input.nextLine();
		}
	}

	public void deletecredits(String a) 
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		String delete = input.nextLine(); //���� ������ ���� �Է¹ް�
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
			System.out.println("����: ����Ʈ ������ ������ϴ�.");
			input.nextLine();
		}	
	}


	public void editcredits() 
	{
		System.out.print("������ ������ �̸��� �Է��Ͻÿ�: ");
		String eidx = input.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getname().equals(eidx)) {
				try {
					System.out.println("������ �̸��� �Է��Ͻÿ�");
					String eidxname = input.nextLine();
					list.get(i).setname(eidxname);

					System.out.println("������ ������ �Է��Ͻÿ�");
					float eidxscore = input.nextFloat();
					list.get(i).setscore(eidxscore);

					System.out.println("������ ������ �Է��Ͻʽÿ�");
					int eidxcredit = input.nextInt();
					list.get(i).setcredit(eidxcredit);

					System.out.println("������ ���� ������ �Է��Ͻÿ�(����,����)");
					String eidxkind = input.nextLine();
					Ex.kindbadcode(eidxkind);
					list.get(i).setkind(eidxkind);
					input.nextLine();
				}
				catch(InputMismatchException a) {
					System.out.println("Ÿ�Կ� �°� �Է��Ͻÿ�");
					input.nextLine();
				}
				catch(Exception e) {
					System.out.println("����:����� ���� �� �Է��ϼ���");
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
			x+= list.get(i).averageUp("����");
			y+= list.get(i).averageUp("����");
			z+= list.get(i).averageUp("��ü");

			a+= list.get(i).averageDown("����");
			b+= list.get(i).averageDown("����");
			c+= list.get(i).averageDown("��ü");

		}
		System.out.println("�������:"+x/a+"\n�������:"+y/b+"\n��ü���:"+z/c+"\n");

	}
}

class MyException {
	
	public void kindbadcode(String x)throws Exception {//����� ���Ҷ� ����� ������ �Է��Ҷ� �ٸ� ���ڿ��� �Է��Ѵٸ� ������ �߻�
		if(!(x.equals("����")||x.equals("����"))) {
			throw new Exception();
		}
		}
	public void indexover(int i) throws Exception {//list�� �ε����� �Ѿ�� �ε����� �����Ҷ� ������ ó��
		if(i > ManagerMethods.list.size()) {
			throw new Exception();
		}
	}
}

