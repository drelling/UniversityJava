package Week8;
import java.util.Date;
// Staff class extends Employee

public class Staff extends Employee implements Payable
{
	private double hours;
	
	// constructor
	public Staff(String firstName, String lastName, String socialSecurityNumber,
		Date birthDate, Date hireDate, String occupation, String insurancePlan,
		String retirement, double wages, double hours)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate,
				hireDate, occupation, insurancePlan, retirement, wages);
		
		if (hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException(
				"Hours worked must be >= 0.0 and <= 168.0");
		
		this.hours = hours;
	}
	
	// set hours
	public void setHours(double hours)
	{
		if (hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException(
				"Hours worked must be >= 0.0 and <= 168.0");
		
		this.hours = hours;
	}
	
	// return hours
	public double getHours()
	{
		return hours;
	}
	
	// return weekly salary
	public double getWeeklySalary()
	{
		return getWages() * getHours();
	}
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}
	// return String representation of Staff object
	@Override
	public String toString()
	{
		return String.format("%n%n%s%n%s: %s",
			super.toString(), "Hours Worked", getHours());
	}
} // end class Staff