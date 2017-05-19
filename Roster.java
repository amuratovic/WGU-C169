 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wguc169project;
import java.util.ArrayList;

/**
 * Almir Muratovic
 * Western Governors University
 * WGU Student ID #000610620
 */


public class Roster {
    
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
             "5,FirstName,LastName,myemail@wgu.com,28,86,97,79"};
             //A.  Include your personal information in the last item of the table above.
    static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args){
		
	//B.  Create a program that converts the array of Strings shown above to an ArrayList of Student objects.	
        for (String s : students){
		String[] studentInfo = s.split(",");
		String studentID = studentInfo[0];
		String studentFirstName = studentInfo[1];
		String studentLastName = studentInfo[2];
		String studentEmail = studentInfo[3];
		int studentAge = Integer.parseInt(studentInfo[4]);
		int studentGrade1 = Integer.parseInt(studentInfo[5]);
		int studentGrade2 = Integer.parseInt(studentInfo[6]);
		int studentGrade3 = Integer.parseInt(studentInfo[7]);
		
		add(studentID, studentFirstName, studentLastName, studentEmail, studentAge, studentGrade1, studentGrade2, studentGrade3);
		}
		
		
                /*
                C.  Demonstrate the program’s required functionality by running the following scenario:
                print_all();
                print_invalid_emails();
                //loop through the ArrayList and for each element:
                print_average_grade(current_loop_student);
                remove("3");
                remove("3");
                //expected: this should print a message saying such a student with this ID was not found.
                */
                
                print_all();
		print_invalid_emails();
		for(Student student : studentList) 
                    print_average_grade(student);
		remove("3");
		remove("3");
		
    }
	
        //a.  public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)
        //that sets the instance variables from part B1 and updates the roster
	public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3){
		int[] grades = {grade1, grade2, grade3};
		Student student = new Student(studentID, firstname, lastname, emailaddress, age, grades);
		studentList.add(student);
	}


	//b.  public static void remove(String studentID) that removes students from the roster by student ID
        //Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
        public static void remove(String studentID){
		for (int i = 0; i < studentList.size(); i++){
			String checkID = studentList.get(i).getStudentID();
			if (checkID.equals(studentID)){
				studentList.remove(i);
				System.out.printf("Student ID: %s is not found.\n", studentID);
				return;
			}
		}
	}
	
        //c.  public static void print_all() that prints a complete tab-separated list of student data using accessor methods
	//The print_all() method should loop through all the students in the student array list and call the print() method for each student.
        public static void print_all(){
		for (Student s : studentList){
		s.print();
		}
	}
        
        //d.  public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID
	public static void print_average_grade(Student s){
            int average = (s.getGrades()[0]+ s.getGrades()[1] + s.getGrades()[2])/3;
            System.out.println("Student Id: " + s.getStudentID() + "\t Average Grade:\t" + average);

        }

        //e.  public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user
        //Note: A valid e-mail should include an at sign (“@”) and period (“.”) and doesn’t include a space.
        public static void print_invalid_emails() {
            System.out.println("Invalid Email Address: ");
            for (Student student : studentList) {
            if (!(student.getEmailAddress().contains("@") && student.getEmailAddress().contains(".") && !(student.getEmailAddress().contains(" ")))) {
                System.out.println(student.getEmailAddress());
            }
        }
    }
	

}
