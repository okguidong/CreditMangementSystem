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
			Kind = "교양";
		}
		else {
			Kind = "전공";
		}
	}
	
	public String getKind() {
		return this.Kind;
	}
	
	public void printInfo() {	
		System.out.println("과목이름: " + getName());
		System.out.println("점수: " + getScore());
		System.out.println("이수학점: " + getCredit());
		System.out.println("종류: " + getKind());
		System.out.println("");
	}
}


