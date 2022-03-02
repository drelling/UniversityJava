package Week8;
import java.util.Date;
// Teacher class extends Faculty

public class Teacher extends Faculty	implements Payable
{
	private int numberClassesTeach;
	
	// constructor
	public Teacher(String firstName, String lastName, String socialSecurityNumber,
		Date birthDate, Date hireDate, String occupation, String insurancePlan,
		String retirement, String department, double wages, int numberClassesTeach)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate,
				hireDate, occupation, insurancePlan, department, wages, retirement);
		
		if (numberClassesTeach < 0)
			throw new IllegalArgumentException(
				"number of classes teach must be >= 0");
		
		this.numberClassesTeach = numberClassesTeach;
	}
	
	// set department
	public void setNumberClassesTeach(int numberClassesTeach)
	{
		if (numberClassesTeach < 0)
			throw new IllegalArgumentException(
				"number of classes teaching must be >=0");
		
		this.numberClassesTeach = numberClassesTeach;
	}
	
	// return department
	public int getNumberClassesTeach()
	{
		return numberClassesTeach;
	}
	
	// calculate weekly earnings
	public double getWeeklyEarnings()
	{
		return (getWages() * 12) / 52;
	}
	
	// calculate earnings; override abstract method earnings in Employee
		@Override
		public double earnings()
		{
			return getWeeklyEarnings();
		}
	
	// return String representation of Alumnus object
	@Override
	public String toString()
	{
		return String.format("%n%n%s%s: %s",
			super.toString(), "Number of Classes Currently Teaching",
			getNumberClassesTeach(), "Weekly Earnings", getWeeklyEarnings());
	}
} // end class Teacher
