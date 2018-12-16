package kr.ac.hansung.model;

public class GradeTable {
	
	private int id;
	private int yearofstudy;
	private int semester;
	private String code;
	private String classname;
	private String division;
	private int grades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYearofstudy() {
		return yearofstudy;
	}
	public void setYearofstudy(int yearofstudy) {
		this.yearofstudy = yearofstudy;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getGrades() {
		return grades;
	}
	public void setGrades(int grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "GradeTable [id=" + id + ", yearofstudy=" + yearofstudy + ", semester=" + semester + ", code=" + code
				+ ", classname=" + classname + ", division=" + division + ", grades=" + grades + "]";
	}
	
	
}
