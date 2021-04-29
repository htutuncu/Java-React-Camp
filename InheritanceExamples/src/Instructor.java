
public class Instructor extends User {
	private String[] courses;
	
	
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return this.courses;
	}
	
	@Override
	public String getUserName() {
		return super.getUserName() + " instructor";
	}
	
	@Override
	public void setUserName(String name) {
		System.out.println(name + "user added.");
	}
	
}
