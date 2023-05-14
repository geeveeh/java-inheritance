package inheritance;

import java.io.*;
import java.util.Scanner;

public class Program4Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//4 3 4 allemployees.csv
		
//		System.out.println("number of students: "+ args[0]);
//		System.out.println("number of classified staff: "+ args[1]);
//		System.out.println("number of faculty: "+ args[2]);
//		System.out.println("name of input file: "+ args[3]);
		
		Employee[]workers = new Employee[11];

		
		int studentRowsProcessed=0, classifiedStaffRowsProcessed=0,facultyRowsProcessed=0;
		int numberOfStudents=Integer.parseInt(args[0]);
		int numberOfClassifiedStaff=Integer.parseInt(args[1]);
		int numberOfFaculty=Integer.parseInt(args[0]);
		int index=0;
		
		BufferedReader  reader = new BufferedReader(new FileReader("C:\\Users\\ganga\\eclipse-workspace\\inheritance\\src\\inheritance\\allemployees.csv"));
		String line;  

		while ((line=reader.readLine())!=null) {
			String[] result = line.split(",");	
			if(studentRowsProcessed<numberOfStudents) {
				//	public StudentEmployee(String name, String id, boolean isWorkStudy, int hoursWorked, boolean someFlag, double payRate)
				workers[index++] = new StudentEmployee(result[0],result[1],Boolean.valueOf(result[2]),Double.parseDouble(result[3]),Boolean.valueOf(result[4]),Double.parseDouble(result[5]));
				studentRowsProcessed++;
				continue;
			}
			
			if(classifiedStaffRowsProcessed<numberOfClassifiedStaff) {
				//		public ClassifiedStaff(String name, String id, boolean isWorkStudy, double weeklySalary, String division,double payRate)
				//                                    Janice Young,558844115,          TRUE,                    19,                TRUE,      11.75
				workers[index++] = new ClassifiedStaff(result[0],result[1],Boolean.valueOf(result[2]),Double.parseDouble(result[3]),result[4],Double.parseDouble(result[5]));
				classifiedStaffRowsProcessed++;
				continue;
			}	
			
			if(facultyRowsProcessed<numberOfFaculty) {
				//	 Faculty(              String name, String id, boolean isWorkStudy, double annualSalary, String department,double weeksPerYear)
				//                         Ed Gellenbeck,226988944,TRUE,                50225,              36,        Computer Science
				workers[index] = new Faculty(result[0],result[1],Boolean.valueOf(result[2]),Double.parseDouble(result[3]),Double.parseDouble(result[4]),(result[5]));
				facultyRowsProcessed++;
				continue;
			}			
						
		}

		reader.close();
		
		
		System.out.println("=================List of employee data saved in the array=================");
		
		for (Employee employee : workers) {
			if(employee instanceof StudentEmployee)
			{
				StudentEmployee studentEmployee=(StudentEmployee)employee;
				System.out.println(studentEmployee.toString());
				
			} else if(employee instanceof ClassifiedStaff)
			{
				ClassifiedStaff classifiedStaff=(ClassifiedStaff)employee;
				System.out.println(classifiedStaff.toString());
				
			} else if(employee instanceof Faculty)
			{
				Faculty faculty=(Faculty)employee;
				System.out.println(faculty.toString());
				
			}
			
			
			}
		
		System.out.println("=================Employee name and their two-week pay for all employees who are currently working at the university=================");
		for (Employee employee : workers) {
			
			if(employee instanceof StudentEmployee)
			{
				StudentEmployee studentEmployee=(StudentEmployee)employee;
				if(studentEmployee.isWorkStudy) {
					System.out.println(studentEmployee.name+" "+studentEmployee.getPay());
				}
				
			} else if(employee instanceof ClassifiedStaff)
			{
				ClassifiedStaff classifiedStaff=(ClassifiedStaff)employee;
				if(classifiedStaff.isWorkStudy) {
					System.out.println(classifiedStaff.name+" "+classifiedStaff.getPay());
				}
				
			} else if(employee instanceof Faculty)
			{
				Faculty faculty=(Faculty)employee;
				System.out.println(faculty.name+" "+faculty.getPay());
				
			}
			
			
			}
		
		
	}

}
