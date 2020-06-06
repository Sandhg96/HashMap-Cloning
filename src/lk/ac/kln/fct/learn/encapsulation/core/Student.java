package lk.ac.kln.fct.learn.encapsulation.core;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private Integer studentID;
	private String name;
	private String degree;
	//https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
	private HashMap<String,Subject> subjects = new HashMap<>();
	private Double gpa;

	
	public Student(Integer studentID, String name, String degree, HashMap<String, Subject> subjects, Double gpa) {
		this.studentID = studentID;
		this.name = name;
		this.degree = degree;
		this.subjects = subjects;
		this.gpa = gpa;
	}


	public Integer getStudentID() {
		return studentID;
	}


	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}
 

	public void setDegree(String degree) {
		this.degree = degree;
	}


	public HashMap<String, Subject> getSubjects() {
		HashMap<String, Subject> deepCopy = new HashMap<String, Subject>();
		
		for(Map.Entry<String, Subject> entry: subjects.entrySet()) {
			deepCopy.put(entry.getKey(), new Subject(entry.getValue().getSubjectID(), entry.getValue().getSubjectName(), entry.getValue().getAllowedDegrees()));
		}
		return deepCopy;
	}


	public void setSubjects(HashMap<String, Subject> subjects) {
		this.subjects = subjects;
	}


	public Double getGpa() {
		return gpa;
	}


	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
}
