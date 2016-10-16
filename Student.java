import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.*;
/**
 * This is a class to define the necessary attributes and methods to conceptualize a "Student"
 * The spepcific tasks are:
 * 1. Instiate 
 * 
 * @author MD.Rezaul Karim 
 * @version 13.10.2016
 */

public class Student{
	static Scanner input = new Scanner(System.in);  //Use for Scan data from user
    // Declare the important attributes of a student. For example:
    //1.Id
    //2. Name
    //3. Department
    //4. University
    //5. GPAs in various terms (Multidimensional arrays)
    //6. subjects for Current terms
    //7. Credits and grades of Current Terms (Multidimmentional Array)
    int id;
    String name,department,university;
    double cgpa;
    double[][] gpa;  // First index used for Year & 2nd in for Semester Ex : gpa[1][2] (first year 2nd semester) 
    String[] subjects;
    double[][][] credits; //First index for year 2nd is for semester & 3rd is for Subject number
    double[][][] grades; //First index for year 2nd is for semester & 3rd is for Subject number
    
    
    

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(){
        // initialise   variables with defult values
    	id = 0;
    	name = null;
    	department = null;
    	university = null;
    	gpa = new double[6][6];
    	credits = new double[8][8][10];
    	grades = new double[8][8][10];
        
    }
    /**
     * Define a method to print the students details.
     */
    
    public void studentDetailsById(){
        //write your code here
    	System.out.println("ID : "+id);
    	System.out.println("Name : "+name);
    	System.out.println("Depertment : "+department);
    	System.out.println("University : "+university);
//    	System.out.println("GPA : ");
//    	for (int i = 0; i < 2; i++){
//    		for (int j = 0; j < 2; j++) {
//    			System.out.println(i+1 +"-"+ j+1 +" : " + gpa[i][j]);
//			}
//		}
//    	System.out.println("Term		Credits		Grades : ");
//    	for (int i = 0; i < 8; i++) {
//    		for (int j = 0; j < 8; j++) {
//				for (int j2 = 0; j2 < 5; j2++) {
//					System.out.println(i+1 +"-"+ j+1 +":	 "+credits[i][j][j2]+"		"+grades[i][j][j2]);
//				}
//			}
//		}
    }
    
    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id){
        //Write your code here
    	this.id = id;
    	input.nextLine();
    	System.out.print("Enter name : ");
    	name = input.nextLine();
    	System.out.print("Enter University name : ");
    	university = input.nextLine();
    	System.out.print("Enter Department name : ");
    	department = input.nextLine();   	 
    }
    
    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID(){
        // Write your code here
    	
    	for(int i=1;i<=8;i++)
    	{
    		System.out.println("Enter GPA of Sem " + (i) +" :  ");
    		cgpa += input.nextDouble();
    	}
    	
    	return cgpa/8;
    }
    
    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */
    public double computeGPAById(){
        //write yor code here
        return 0.0;
    }
    
    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class. 
     * use as many arguments as required.
     * 
     */
    public void saveStudent() throws IOException
    {
    	FileWriter outputFile = new FileWriter("output.txt",true); //Creat output file
    	
    	BufferedWriter buffer = new BufferedWriter(outputFile); //Creat buffer for write
    	
    	PrintWriter write = new PrintWriter(buffer); //Creat printWriter obj from buffer
    	//Write Details in Output text file
    	write.println("  ");
        write.println("Name  : "+name);
        write.println("ID  : " + id);
        write.println("Department  : " + department);
        write.println("University  : " + university); 
        write.println("  ");
        
        write.close();
    }
    
    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */
    public void loadStudents(){
        //Write your code here
        
    }
    
    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args){
    	int n,iD;
    	double cgpa;
    	
    	System.out.print("How many Student ? ");
    	n = input.nextInt();
    	Student[] student = new Student[n+1]; //Create n+1 object of Student Class
    	for (int i = 1; i <= n; i++) {
    		System.out.println("-----Update Student " + i +" Information");
    		System.out.print("Enter ID no : ");
    		iD = input.nextInt();
    		student[i] = new Student(); //Memory allocation for nth student
    		try {
				student[i].updateStudentById(iD);
				student[i].studentDetailsById();
				student[i].saveStudent();
				cgpa = student[i].computeCGPAByID();
				System.out.println("CGPA is : "+cgpa);
			} catch (Exception e) {
				
			}
		}
    }
}
