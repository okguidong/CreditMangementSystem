package classProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		CreditManagermentSystem Credit_m = getObject("Credit_m.ser");
		if(Credit_m == null) {
			Credit_m = new CreditManagermentSystem(input);
		} else {
			Credit_m.input = input;
		}
		
		WindowFrame frame = new WindowFrame(Credit_m);
		
		int n = 0;

		while(n != 5)
		{
			System.out.println("*** Private Lesson Management System Menu ***");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 :  ");
			n = input.nextInt();
			input.nextLine();
			System.out.println();
			if(n == 1) {
				Credit_m.add();
				logger.log("add a Credit");
			}
			else if(n == 2) {
				Credit_m.delete();
				logger.log("delete a Credit");
			}
			else if(n == 3) {
				Credit_m.edit();
				logger.log("edit a Credit");
			}
			else if(n == 4) {
				Credit_m.view();
				logger.log("view a list of Credit");
			}
			else if(n >= 6)
			{
				System.out.println("1-5 사이의 숫자를 고르시오");
				System.out.println("");
			}
		}
		putObject(Credit_m, "Credit_m.ser");
		System.out.println("End.");
	}

	public static CreditManagermentSystem getObject(String filename) {
		CreditManagermentSystem Credit_m = null;

		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Credit_m = (CreditManagermentSystem)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return Credit_m;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return Credit_m;
	}

	public static void putObject(CreditManagermentSystem Credit_m, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(Credit_m);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//
