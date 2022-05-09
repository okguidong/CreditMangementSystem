package classProj;

public abstract class Credit {
	private String name;
	private int credit;
	private float score;
	
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
	abstract void print();
	
	public float averageUp(String a) {
		if(a=="전체") {
			return getscore()*getcredit();
		}
		else {
			return 0;
		}
	}
	
	public float averageDown(String a) {
		if(a=="전체") {
			return getcredit();
		}
		else {
			return 0;
		}
	}
	
}

