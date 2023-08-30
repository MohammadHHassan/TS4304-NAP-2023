package day12.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student [] students;	// Creating array of students
	private int currentNumberOfStudents=0;
	
	public Module(String code, String name, int maxNumberOfStudents)
	{
		editCode(code);			// Equivalent to this.code = code
		editName(name);			// Equivalent to this.name = name
		students = new Student[maxNumberOfStudents];	// Declaration of students array with the limit number of students
	}
	
	public String getCode()		// Method to retrieve the module code
	{
		return code;
	}
	
	public String getName()		// Method to retrieve the module name
	{
		return name;
	}
	
	public Student [] getStudents()		// Method to retrieve the students in the module
	{
		return students;
	}
	
	public void editCode(String code)	// Method to update/edit the module code
	{
		this.code = code;
	}
	
	public void editName(String name)	// Method to update/edit the module name
	{
		this.name = name;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)	// If the module capacity is full
		{
			return false;		// Fail to enroll the student
		}
		
		for(int i=0 ; i<students.length ; i++)	// Using for loop to check the student one by one
		{
			if(students[i] != null)		// If the student array is not empty
			{
				if(students[i].getId() == student.getId())	// If there is a duplicate student
				{
					return false;	// Fail to enroll the student
				}
			}
		}
		
		students[currentNumberOfStudents] = student;	// Enroll the student in the module
		currentNumberOfStudents++;		// Increment the number of student in the module
		return true;		// Successfully enrolled the student in the module
	}
}



