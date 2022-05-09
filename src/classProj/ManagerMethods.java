package classProj;

import java.util.*;

public class ManagerMethods {
	
	ArrayList<Kind> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	public void addcredits() 
	{
		Kind add = new Kind();
		
		System.out.print("�����̸��� �Է��ϼ���");
		add.setname(input.nextLine());
		System.out.print("���� ������ �Է��ϼ���");
		add.setscore(input.nextFloat());
		System.out.print("���� ������ �Է��ϼ��� ");
		add.setcredit(input.nextInt());
		System.out.println("����,����?");
		add.setkind(input.next());
		
		list.add(add);
		
		input.nextLine();
	}
	
	public void deletecredits(String a) 
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.print("� ������ ���� �Ͻðڽ��ϱ�?(): ");
		String delete = input.nextLine(); //���� ������ ���� �Է¹ް�
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getname().equals(delete))
				list.remove(i);
		}
	}
	
	public void deletecredits(int a) 
	{
		System.out.print("� ������ ���� �Ͻðڽ��ϱ�?(): ");
		list.remove(a-1);

	}

	
	public void editcredits() 
	{
		System.out.print("������ ������ �̸��� �Է��Ͻÿ�: ");
		String eidx = input.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getname().equals(eidx)) {
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
				list.get(i).setkind(eidxkind);
				input.nextLine();
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

