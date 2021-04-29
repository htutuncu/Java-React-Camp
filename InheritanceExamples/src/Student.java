
public class Student extends User{
	private String[] takingCourses;
	private String studentID;
	
	
	public void setTakingCourses(String[] courses) {
		this.takingCourses = courses;
	}
	
	public String[] getTakingCourses() {
		return this.takingCourses;
	}
	
	public void setStudentID(String ID) {
		this.studentID = ID;
	}
	
	public String getStudentID() {
		return this.studentID;
	}
}
