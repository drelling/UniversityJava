package Week8;
import java.util.Date;
// Student class extends CommunityMember

public class Student extends CommunityMember
{
	private String major;
	private Date graduationDate;
	private double creditHoursCompleted;
	
	// constructor
	public Student(String firstName, String lastName, String socialSecurityNumber,
		Date birthDate, String major, Date graduationDate,
		double creditHoursCompleted)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		if (creditHoursCompleted < 0.0) // validate creditHoursCompleted
			throw new IllegalArgumentException(
				"Credit Hours Completed must be >= 0.0");
		
		this.major = major;
		this.graduationDate = graduationDate;
		this.creditHoursCompleted = creditHoursCompleted;
	}
	
	// set major
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	// return major
	public String getMajor()
	{
		return major;
	}
	
	// set graduation date
	public void setGraduationDate(Date graduationDate)
	{
		this.graduationDate = graduationDate;
	}
	
	// return graduation date
	public Date getGraduationDate()
	{
		return graduationDate;
	}
	
	// set credit hours completed
	public void setCreditHoursCompleted(double creditHoursCompleted)
	{
		if (creditHoursCompleted < 0.0) // validate hours
			throw new IllegalArgumentException(
				"Credit Hours Completed cannot be < 0.0");
		
		this.creditHoursCompleted = creditHoursCompleted;
	}
	
	// return credit hours completed
	public double getCreditHoursCompleted()
	{
		return creditHoursCompleted;
	}
	
	// calculate hours left to graduation
	public double getHoursLeftToGraduate()
	{
		return 120 - creditHoursCompleted;
		
	}
	
	// calculate program level
	public String getProgramLevel()
	{
		String programLevel = "";
		
		if (creditHoursCompleted >= 90.0)
			programLevel = "Senior";
		else if (creditHoursCompleted >= 60.0)
			programLevel = "Junior";
		else if (creditHoursCompleted >= 30.0)
			programLevel = "Sophmore";
		else if (creditHoursCompleted >= 0.0)
			programLevel = "Freshman";
		
		return programLevel;
	}
		
	// return String representation of Student object
	@Override
	public String toString()
	{
		return String.format("%n%nStudent %s%s %s%n%s: %s%n%s: %.0f%n%s: %s",
			super.toString(), "Major:", getMajor(), "Graduation Date", getGraduationDate(),
			"Credit Hours Completed", getCreditHoursCompleted(),
			"Program Level", getProgramLevel());
	}
} // end class Student
