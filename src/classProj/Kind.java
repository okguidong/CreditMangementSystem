package classProj;

import java.io.Serializable;

public class Kind extends Credit implements Calculator, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5131268435880885338L;
	private String kind;
	
	public void setkind(String kind) 
	{
		this.kind = kind;
	}
	
	public String getkind() 
	{
		return this.kind;
	}
	
	public void print()
	{
		System.out.println(getname() + " / " + getscore() + " / " + getcredit() + " / " + getkind());	
	}
	public float averageUp(String a) {
		float x=0;

		if(a=="����")
		{
			if(getkind().equals("����")) {//���� ���
				x= getscore()* getcredit();

			}
		}
		else if(a=="����") //������ ���
		{
			if(getkind().equals("����")){
				x= getscore() * getcredit();
			}
		}

		else
		{//��ü�� ���	
			x= getscore() * getcredit();
		}
		return x;
	}
	
	public float averageDown(String a) {
		float x=0;

		if(a=="����")
		{
			if(getkind().equals("����")) {//���� ���
				x= getcredit();
			}
		}
		else if(a=="����") //������ ���
		{
			if(getkind().equals("����")){
				x= getcredit();
			}
		}

		else
		{//��ü�� ���	
			x= getcredit();
		}
		return x;
	}
}