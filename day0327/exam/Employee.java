package day0327.exam;

public class Employee {
	
	private String no;
	private String name;
	private String dept;
    private String job;
	private int sal;
	public Employee() {}
	public Employee(String no, String name, String dept,String job, int sal) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.sal = sal;
	}
	
	
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getSal() {
		return sal;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return  no + ":"+dept +""+ name + "" + job;
	}
	
	
	
	
	

}
