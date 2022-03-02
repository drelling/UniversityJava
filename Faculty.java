package Week8;
import java.util.Date;
// Faculty abstract class extends Employee

public abstract class Faculty extends Employee	
{
	private String department;
	
	// constructor
	public Faculty(String firstName, String lastName, String socialSecurityNumber,
			Date birthDate, Date hireDate, String occupation, String insurancePlan,
			String retirement, double wages, String department)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate,
				hireDate, occupation, insurancePlan, retirement, wages);
		
		this.department = department;
	}
	
	// set department
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	// return department
	public String getDepartment()
	{
		return department;
	}
	
	// return String representation of Alumnus object
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %s%n",
			super.toString(), "Department", getDepartment());
	}
	
	public double getPaymentAmount()
	{
		return earnings();
	}

	public abstract double earnings();
} // end abstract class Faculty
