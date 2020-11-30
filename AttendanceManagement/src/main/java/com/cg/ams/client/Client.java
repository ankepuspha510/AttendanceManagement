package com.cg.ams.client;

import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
import com.cg.ams.service.StudentService;
import com.cg.ams.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) throws RecordNotFoundException
	{
		StudentService service = new StudentServiceImpl();
		
		StudentEntity student= new StudentEntity();
		//student.setId(100);
		student.setRollNo(1324);
		student.setFirstName("pushpa");
		student.setLastName("anke");
		student.setDob(null);
		student.setGender("Female");
		student.setMobileNo("9704402303");
		student.setCourseId(4);
		student.setCourseName("cse");
		student.setSubjectId(4);
		student.setSubjectName("c++");
		student.setEmailId("puspaanke@gmail.com");
		student.setFatherEmailId("gopalanke@gmail.com");
		student.setFatherMobileNo("7678654321");
		student.setProfilePic("anke1");
		service.add(student);
		//add completed
		student.setRollNo(1234);
		student.setFirstName("rakesh");
		student.setLastName("soma");
		student.setDob(null);
		student.setGender("male");
		student.setMobileNo("8309905834");
		student.setCourseId(5);
		student.setCourseName("civil");
		student.setSubjectId(3);
		student.setSubjectName("sm1");
		student.setEmailId("rakeshreddy@gmil.com");
		student.setFatherMobileNo("raghavareddy@gmil.com");
		student.setFatherMobileNo("5463789654");
		student.setProfilePic("1mb");
		service.update(student);
		//update completed
		long num = student.getId();
		System.out.println("key="+num);
		//System.out.println(service.findByPk(1));
		System.out.println(service.findByName("pushpa"));
		//System.out.println(service.searchByStudentEntityGender("female"));
		//System.out.println(service.searchByStudentEntityRollNo(1234));
		
	}

}
