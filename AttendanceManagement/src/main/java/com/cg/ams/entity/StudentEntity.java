package com.cg.ams.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * author: Puspha
 */
@Entity
@Table(name = "students3") // Declare table name
public class StudentEntity {
	@Id // specifies the property, used for identify the class
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long rollNo;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String mobileNo;
	private long courseId;
	private String courseName;
	private long subjectId;
	private String subjectName;
	private String semester;
	private String emailId;
	private String fatherEmailId;
	private String fatherMobileNo;
	private String profilePic;

	// getters and setters of entity table
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFatherEmailId() {
		return fatherEmailId;
	}

	public void setFatherEmailId(String fatherEmailId) {
		this.fatherEmailId = fatherEmailId;
	}

	public String getFatherMobileNo() {
		return fatherMobileNo;
	}

	public void setFatherMobileNo(String fatherMobileNo) {
		this.fatherMobileNo = fatherMobileNo;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", mobileNo=" + mobileNo + ", courseId=" + courseId
				+ ", courseName=" + courseName + ", subjectId=" + subjectId + ", subjectName=" + subjectName
				+ ", semester=" + semester + ", emailId=" + emailId + ", fatherEmailId=" + fatherEmailId
				+ ", fatherMobileNo=" + fatherMobileNo + ", profilePic=" + profilePic + "]";
	}

}
