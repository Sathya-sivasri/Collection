package oopsconcepts;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login capone=new Login();
		capone.loginApp();
		System.out.println("-----------------");
		
		NewLogin city=new NewLogin();
		city.loginApp();
}
}
class Login {
	void loginApp() {
		System.out.println("Enter user name");
		System.out.println("Password");
		System.out.println("click submit button");
		//return 1;
	}
}
class NewLogin extends Login{
	void loginApp(){
		System.out.println("Enter user name");
		System.out.println("Password");
		System.out.println("Phone no");
		System.out.println("Click submit button");
}
}
//retun type should same and parameter should be same
	//class Login{
		//int loginApp(int a) {
			//System.out.println("Enter user name");
			//System.out.println("Password");
			//System.out.println("click submit button");
			//return 1;
	//}
//}
	//class NewLogin extends Login{
		//int loginApp(int b) {
			//System.out.println("Enter user name");
			//System.out.println("Password");
			//System.out.println("Phone no");
			//System.out.println("Click submit button");
			//return 2;
	//}
 
	

