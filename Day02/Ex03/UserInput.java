import java.util.Scanner;
class UserInput{
	public static void main(String[] args){
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your firstname :");
		fname = sc.nextLine();
		
		System.out.print("Enter Your lastname :");
		String lname = sc.next();
		
		System.out.println("Enter Your Marks :");
		int marks=sc.nextInt();
		
		System.out.println("Fullname :" +fname+" "+ lname+ "\n"+"Marks is " + marks);
	}
}