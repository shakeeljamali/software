import java.util.Scanner;
class Example4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		char grade;
		System.out.println("Enter marks");
		marks=sc.nextInt();
		
		if(marks>=85){
			grade='A';
		}
		else if(marks>=75){
			grade='B';
			
		}
		else if (marks>=65){
			grade='C';
		}
		else if(marks>=60){
			grade='D';
		}
		else{
			grade='E';
		}
		System.out.println("grade="+grade);
		
	}}