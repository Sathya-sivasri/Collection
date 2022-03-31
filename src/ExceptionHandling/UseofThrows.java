package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UseofThrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		UseofThrows u=new UseofThrows();
		u.m1();

	}
	void m1()throws FileNotFoundException {
		
		readfile();
	}
	void readfile()throws FileNotFoundException{
		FileInputStream fs =new FileInputStream("C:\\Users\\senth\\eclipse-workspace\\Java Project\\bin");
		
		
	}

}
