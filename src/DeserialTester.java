import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialTester {

	public static void main(String[] args) {
		Demo obj = null;
		
		FileInputStream file;
		try {
			file = new FileInputStream("rec.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			
			obj = (Demo) in.readObject();
			in.close();
			file.close();
			System.out.println(obj.greeting);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
