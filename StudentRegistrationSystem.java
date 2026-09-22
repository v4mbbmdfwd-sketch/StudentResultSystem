package students;
import java.util.Scanner;
public class StudentRegistrationSystem {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int mainChoice;

       // main menu keeps running until user exits
       do {
    	   System.out.println("\n=== BBC 2 STUDENT RESULT SYSTEM ===");   
    	   System.out.println("1. Enter Student Marks");
    	   System.out.println("2. Exit");
    	   System.out.print("Choice: ");
    	   mainChoice = sc .nextInt();
    	   
    	   
    	   if (mainChoice == 1) {
    		   sc. nextLine();
    		   System.out.print("Student Name: ");
    		   String name = sc.nextLine();
    		   
    		   System.out.print("How many subjects? (2-6):");
    		   int subjects = sc. nextInt();
    		   
    		   double[] marks = new double[subjects];
    		   double total = 0;
    		   
    		// loop for entering marks
    		   for (int i = 0; i < subjects; i++) {
    			   System.out.print("Enter marks for subject" + (i+1) + "(0-100):");
    			   double m = sc.nextDouble();
    			   
    			   //check if marks are valid
    			   while (m < 0 || m > 100) {
    				   System.out.println("Invalid! Marks must be 0-100");
    				   System.out.print("Re-enter marks for subject" + (i+1) + ":");
    				   m = sc. nextDouble();
    			   }
    			        marks[i] = m;
    			        total += m;
    		   }
    		   
    		   double average = total / subjects;
    		   
    		   // calculating grade
    		   String grade = (average >= 80)? "A - Excellent"
                            : (average >=60)? "B - Good"  
                            : (average >=50)? "C - Pass"		
    	                    : "F - Fail";
    		   String status = (average >=50)? "PASSED" : "FAILED";
    		   //Scholarship: Average >=70
    		   String scholarship = (average >= 70 && subjects >= 4)? "ELIGIBLE FOR SCHOLARSHIP" : "NOT ELIGIBLE"; 
    		System.out.println("\n----- RESULT SLIP -----");
    		System.out.println("Name: " + name);
    		
    		//FOR LOOP again to show marks
    		for(int i=0; i<subjects; i++){
    		System.out.println("Subject" + (i+1) +":" + marks[i]);		   
       }
    		
    		System.out.println("Total:" + total);
    		System.out.println("Average:" + average);
    		System.out.println("Grade:" + grade);
    		System.out.println("Status:" + status);
    		System.out.println("Scholarship:" + scholarship);
    		System.out.println("--------------------");
    	   }


       } while (mainChoice!= 2);
       
       System.out.println("System closed.Nice Time");
sc.close();

	}

}
