package inheritance;

public class Faculty extends Employee {
	String name;
	String id;
	boolean isWorkStudy;
	double annualSalary;
	double weeksPerYear;
	String department;

	/**
	 * @param name
	 * @param id
	 * @param isWorkStudy
	 * @param annualSalary
	 * @param weeksPerYear
	 * @param department
	 */
	public Faculty(String name, String id, boolean isWorkStudy, double annualSalary, double weeksPerYear,String department
			) {
		super();
		this.name = name;
		this.id = id;
		this.isWorkStudy = isWorkStudy;
		this.annualSalary = annualSalary;
		this.weeksPerYear = weeksPerYear;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", id=" + id + ", isWorkStudy=" + isWorkStudy + ", annualSalary="
				+ annualSalary + ", weeksPerYear=" + weeksPerYear + ", department=" + department + "]";
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return this.annualSalary;
	}

}
