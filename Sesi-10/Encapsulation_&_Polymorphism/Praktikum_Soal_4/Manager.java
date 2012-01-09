public class Manager extends Employee
{
	private String departement;
	public Manager(String nama, double salary, String dep)
	{
		super(nama, salary);
		departement = dep;
	}
	
	public String getDepartement()
	{
		return departement;
	}
	
	public String getDetails()
	{
		return super.getDetails() + "\nDepartement : " + getDepartement();
	}
	
	public void cetak()
	{
		System.out.println("Coba di Manager");
	}
}
