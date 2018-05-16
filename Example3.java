import java.util.Scanner;
class Example3{
	public static void main(String[] args) {
    /*int a;		
	       System.out.println("Please enter a number to check even or odd");
	       Scanner sc=new Scanner(System.in);
	       a = sc.nextInt();
		   if(a% 2==0){
			  System.out.println(" number is an even number:");  
		  }
	      else{
              System.out.println("number is an odd number");
	}
	}
	}*/
 
    int marks=80; 
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>= 70){
        System.out.println("B grade");  
    }  
    else if(marks>=75){  
        System.out.println("A grade");  
      
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}  
