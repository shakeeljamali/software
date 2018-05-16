/*import java.util.Scanner;
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
	*/
	
	
	
	
	//// shakeel jamali baloch
	public class Example5 {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :

            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}


