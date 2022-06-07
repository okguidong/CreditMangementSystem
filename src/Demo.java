import java.io.Serializable;

public class Demo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3972910450366366136L;
	String greeting;
	
	public Demo(String greeting) {
		this.greeting = greeting;
	}

}
