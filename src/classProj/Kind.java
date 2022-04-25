package classProj;

public class Kind extends Credit {
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
}
