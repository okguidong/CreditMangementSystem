package classProject;

import java.io.Serializable;

public class KindCredit extends Credit implements Kind, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5533066819552575457L;
	private String Kind;
	
	
	
	
	public void setKind(String Kind) {
		this.Kind = Kind;
	}
	
	public void setKind(int a)
	{
		if(a == 1) {
			Kind = "����";
		}
		else {
			Kind = "����";
		}
	}
	
	public String getKind() {
		return this.Kind;
	}
	
	public void printInfo() {	
		System.out.println("�����̸�: " + getName());
		System.out.println("����: " + getScore());
		System.out.println("�̼�����: " + getCredit());
		System.out.println("����: " + getKind());
		System.out.println("");
	}
}


