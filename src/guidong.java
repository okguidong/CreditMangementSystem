public class guidong {

	void change(int x, int[] y,student b) {
		x =100;
		y[0]= 50;
		b.name = "¿Á±Íµ¿";
	}
	
	
	public static void main(String[] args) {
		student k = new student("ÀÌÁö½Â");
		int i =0;
		int [] j= {0};
		change(i,j,k);
		
		
		System.out.print(i);
		System.out.print(j[0]);
		System.out.print(k.name);
	}

}
