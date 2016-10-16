import java.util.Scanner;
/**
 * This is a class to define the necessary attributes and methods to conceptualize a "Student"
 * The spepcific tasks are:
 * 1. Instiate 
 * 
 * @author MD.Rezaul Karim 
 * @version 13.10.2016
 */

public class Student{
	static Scanner input = new Scanner(System.in);
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
    double[][] gpa;
    String[] subjects;
    double[][][] credits;
    double[][][] grades;
    
    
    

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
    	System.out.println("GPA : ");
    	for (int i = 0; i < 2; i++){
    		for (int j = 0; j < 2; j++) {
    			System.out.println(i+1 +"-"+ j+1 +" : " + gpa[i][j]);
			}
		}
    	System.out.println("Term		Credits		Grades : ");
    	for (int i = 0; i < 8; i++) {
    		for (int j = 0; j < 8; j++) {
				for (int j2 = 0; j2 < 5; j2++) {
					System.out.println(i+1 +"-"+ j+1 +":	 "+credits[i][j][j2]+"		"+grades[i][j][j2]);
				}
			}
		}
    }
    
    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id){
        //Write your code here
    	this.id = id;
    	System.out.println("Enter name : ");
    	name = input.nextLine();
    	System.out.println("Enter University name : ");
    	university = input.nextLine();
    	System.out.println("Enter Department name : ");
    	department = input.nextLine();
    	System.out.println("Enter GPA : ");
    	for (int i = 0; i < 2; i++){
    		for (int j = 0; j < 2; j++) {
    			System.out.println(i+1 +"-"+ j+1 +" : ");
    			gpa[i][j] = input.nextDouble();
			}
		}
    	System.out.println("Enter Credits & Grades for each term : ");
    	for (int i = 0; i < 8; i++) {
    		for (int j = 0; j < 8; j++) {
    			System.out.println("# "+i+1 +"-"+ j+1 +" : ");
				for (int j2 = 0; j2 < 5; j2++) {
					System.out.println("Subject "+ j2 + 1 +" : ");
					credits[i][j][j2] = input.nextDouble();
					grades[i][j][j2] = input.nextDouble();
				}
			}
		}
    }
    
    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID(){
        // Write your code here
        return 0.0;
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
    public void saveStudents(){
        //Write your code here
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
        //Write your main function to execute call defined methods
    	System.out.println("How many Student ?");
    	n = input.nextInt();
    	Student student = new Student();
    	for (int i = 0; i < n; i++) {
    		System.out.println("-----Update Student " + i+1 +" Information");
    		System.out.print("Enter ID no : ");
    		iD = input.nextInt();
    		
    		try {
				//student.updateStudentById(iD);
				student.studentDetailsById();
			} catch (Exception e) {
				
			}
		}
    }
}
