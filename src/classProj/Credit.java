package classProj;

public class Credit {
	private String name;
	private int credit;
	private float score;

	public void print(){
		System.out.println(name + " / " + score + " / " + credit);
	}
	
	public void setname(String name) 
	{
		this.name = name;
	}
	
	public void setcredit(int credit) 
	{
		this.credit = credit;
	}
	
	public void setscore(float score) 
	{
		this.score = score;
	}
	
	public int getcredit() {
		return this.credit;
	}
	
	public float getscore() {
		return this.score;
	}
	
	public String getname() {
		return this.name;
	}	
}
