package Week8;
import java.util.Date;

// Employee class extends CommunityMember

public abstract class Employee extends CommunityMember
{
	private Date hireDate;
	private String occupation;
	private String insurancePlan;
	private String retirement;
	private double wages;
	
	// constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber,
		Date birthDate, Date hireDate, String occupation, String insurancePlan,
		String retirement, double wages)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		this.hireDate = hireDate;
		this.occupation = occupation;
		this.insurancePlan = insurancePlan;
		this.retirement = retirement;
		
		if (wages < 0.0)
			throw new IllegalArgumentException(
				"wages must be > 0.0");
		this.wages = wages;
	}
	
	// set graduation date
	public void sethireDate(Date hireDate)
	{
		this.hireDate = hireDate;
	}
	
	// return graduation date
	public Date getHireDate()
	{
		return hireDate;
	}
	
	// set occupation
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	
	// return occupation
	public String getOccupation()
	{
		return occupation;
	}
	
	// set insurance plan
	public void setInsurancePlan(String insurancePlan)
	{
		this.insurancePlan = insurancePlan;
	}
	
	// return insurance plan
	public String getInsurancePlan()
	{
		return insurancePlan;
	}
	
	// set retirement
	public void setRetirement(String retirement)
	{
		this.retirement = retirement;
	}
	
	// return retirement
	public String getRetirement()
	{
		return retirement;
	}
	
	// set wages
	public void setWages(double wages)
	{
	if (wages < 0.0)
		throw new IllegalArgumentException(
			"wages much be > 0.0");
	
	this.wages = wages;
	}
	
	// return wages
	public double getWages()
	{
		return wages;
	}
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%s%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: $%.2f",
			super.toString(), "Hire Date", getHireDate(),
			"Occupation", getOccupation(), "Insurance Plan", getInsurancePlan(),
			"Retirement Plan", getRetirement(), "Wages", getWages());
	}
	
	public double getPaymentAmount()
	{
		return earnings();
	}

	public abstract double earnings();
} // end class Employee
