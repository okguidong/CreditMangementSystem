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

		if(a=="교양")
		{
			if(getkind().equals("교양")) {//교양 평균
				x= getscore()* getcredit();

			}
		}
		else if(a=="전공") //전공의 평균
		{
			if(getkind().equals("전공")){
				x= getscore() * getcredit();
			}
		}

		else
		{//전체의 편균	
			x= getscore() * getcredit();
		}
		return x;
	}
	
	public float averageDown(String a) {
		float x=0;

		if(a=="교양")
		{
			if(getkind().equals("교양")) {//교양 평균
				x= getcredit();
			}
		}
		else if(a=="전공") //전공의 평균
		{
			if(getkind().equals("전공")){
				x= getcredit();
			}
		}

		else
		{//전체의 평균	
			x= getcredit();
		}
		return x;
	}
}