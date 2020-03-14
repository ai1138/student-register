class Student
{
  private String firstname;
	private String lastname;
	private int idnumber;
	private double gpa;
  
  public Student (String firstname, String lastname, int idnumber, double gpa)
  { 
    this.firstname = firstname;
    this.lastname = lastname;
    this.idnumber = (int) idnumber;
    this.gpa = gpa;
  }
  public String getFirstname() 
  {
		return firstname;
	}

	public void setFirstname(String firstname) 
  {
		this.firstname = firstname;
	}

	public String getLastname() 
  {
		return lastname;
	}

	public void setLastname(String lastname) 
  {
		this.lastname = lastname;
	}

	public int getIdnumber() 
  {

		return idnumber;
	}

	public void setIdnumber(int idnumber) 
  {
		this.idnumber = idnumber;
	}

	public double getGpa() 
  {
		return gpa;
	}

	public void setGpa(double gpa) 
  {
		this.gpa = gpa;
	}
  public String toString()
  {
    return this.firstname + " " + this.lastname + " " + String.valueOf(this.idnumber) + " " + String.valueOf(this.gpa);
    
  }
}
