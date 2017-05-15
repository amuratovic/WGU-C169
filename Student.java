/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wguc169project;

/**
 * Almir Muratovic
 * Western Governors University
 * WGU Student ID #000610620
 */
public class Student {
    
    //1.  Include the following instance variables that describe each student:
    private String studentID;
    private String firstname;
    private String lastname;
    private String emailaddress;
    private int age;
    private int[] grades;
    
    //c.  constructor using all of the input parameters
    public Student(String studentid, String firstname, String lastname, String emailaddress, int age, int[] grades){
        setStudentID(studentid);
        setFirstName(firstname);
        setLastName(lastname);
        setEmailAddress(emailaddress);
        setAge(age);
        setGrades(grades);
    }
    
    //a.  an accessor (i.e., getter) for each instance variable from part B1
    public String getStudentID(){
        return studentID;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public String getEmailAddress(){
        return emailaddress;
    }
    public int getAge(){
        return age;
    }
    public int[] getGrades(){
        return grades;
    }
    
    //b.  a mutator (i.e., setter) for each instance variable from part B1
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public void setEmailAddress(String emailaddress){
        this.emailaddress = emailaddress;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrades(int[] grades){
        this.grades = grades;
    }
    
    //d.  print() to print specific student data (e.g., student ID, first name, last name) using accessors (i.e., getters)
    //Note: Printing out the grades is optional, not required.
    //Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}.
    public void print(){
        System.out.println(getStudentID() +
                            "\tFirst Name: " + getFirstName() +
                            "\tLast Name: " + getLastName() +
                            "\tAge: " + getAge() +
                            "\t\tEmail Address: " + getEmailAddress());
    }
}
