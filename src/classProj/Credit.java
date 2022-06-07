package classProject;

import java.io.Serializable;

abstract public class Credit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1219826540388449953L;
	private String name;
	private Float score;
	private int credit;

//	public static void TeacherName(String a, String b) {
//		System.out.println(a +" "+b);
//	}
//	
//	public static void TeacherName(String c) {
//		System.out.print(c);
//	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setScore(Float score) {
		this.score = score;
	}
	
	public Float getScore() {
		return this.score;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public int getCredit()	{
		return this.credit;
	}
	
	public abstract void printInfo();
}
