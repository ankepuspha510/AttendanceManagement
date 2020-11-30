package com.cg.ams.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
import com.cg.ams.repository.StudentDAOImpl;
import com.cg.ams.service.StudentService;

class StudentDAOImplTest {

	StudentService service;
	StudentDAOImpl studentdao;
	StudentEntity stdent;
	java.util.Date date = new java.util.Date();


	@BeforeEach
	void setUp() throws Exception {
		studentdao = new StudentDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		studentdao=null;
	}
	@Test
	public void testStudentDAOImpl() {
		assertTrue(studentdao instanceof StudentDAOImpl);
	}
	
	@Test
	public void testAdd() {
		stdent=new StudentEntity();
		java.util.Date date = new java.util.Date();
		stdent.setRollNo(1324);
		stdent.setFirstName("pushpa");
		stdent.setLastName("anke");
		stdent.setDob(date);
		stdent.setGender("Female");
		stdent.setMobileNo("9704402303");
		stdent.setCourseId(4);
		stdent.setCourseName("cse");
		stdent.setSubjectId(4);
		stdent.setSubjectName("c++");
		stdent.setEmailId("puspaanke@gmail.com");
		stdent.setFatherEmailId("gopalanke@gmail.com");
		stdent.setFatherMobileNo("7678654321");
		stdent.setProfilePic("anke1");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long a = studentdao.add(stdent);
		studentdao.commitTransaction();
		assertEquals(stdent.getCourseId(),4);
	}
	@Test
	public void testUpdate() {
		StudentEntity stdent1=new StudentEntity();
		stdent1.setRollNo(1324);
		stdent1.setFirstName("pushpa");
		stdent1.setLastName("anke");
		stdent1.setDob(date);
		stdent1.setGender("Female");
		stdent1.setMobileNo("9704402303");
		stdent1.setCourseName("ece");
		stdent1.setSubjectId(4);
		stdent1.setSubjectName("c++");
		stdent1.setEmailId("puspaanke@gmail.com");
		stdent1.setFatherEmailId("gopalanke@gmail.com");
		stdent1.setFatherMobileNo("7678654321");
		stdent1.setProfilePic("anke1");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long add = studentdao.add(stdent1);
	    studentdao.commitTransaction();
		stdent1.setCourseId(5);
		studentdao.beginTransaction();
		studentdao.update(stdent1);
		studentdao.commitTransaction();
		assertEquals(stdent1.getCourseId(),5);
	}
	@Disabled
	@Test
	public void testDelete() throws RecordNotFoundException{
	studentdao.beginTransaction();
	studentdao.delete(stdent);
	studentdao.commitTransaction();
		assertNull(stdent.getFirstName());
	}
	@Test
	public void testFindByName() throws RecordNotFoundException{
		StudentEntity stdent2=new StudentEntity();
		java.util.Date date = new java.util.Date();
		stdent2.setRollNo(1434);
		stdent2.setFirstName("chinna");
		stdent2.setLastName("soma");
		stdent2.setDob(date);
		stdent2.setGender("Male");
		stdent2.setMobileNo("9704402303");
		stdent2.setCourseId(4);
		stdent2.setCourseName("civil");
		stdent2.setSubjectId(4);
		stdent2.setSubjectName("sm1");
		stdent2.setEmailId("chinnasoma@gmail.com");
		stdent2.setFatherEmailId("raghavasoma@gmail.com");
		stdent2.setFatherMobileNo("7674815359");
		stdent2.setProfilePic("1mb");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long a = studentdao.add(stdent2);
		studentdao.commitTransaction();
		stdent2 = studentdao.findByName("chinna");
		assertEquals(stdent2.getCourseId(),4);
		
	}
	@Test
	public void testFindByPk() throws RecordNotFoundException {
		StudentEntity stdent3=new StudentEntity();
		java.util.Date date = new java.util.Date();
		stdent3.setRollNo(1435);
		stdent3.setFirstName("lohi");
		stdent3.setLastName("chamanchula");
		stdent3.setDob(date);
		stdent3.setGender("Female");
		stdent3.setMobileNo("7675643421");
		stdent3.setCourseId(5);
		stdent3.setCourseName("ece");
		stdent3.setSubjectId(4);
		stdent3.setSubjectName("java");
		stdent3.setEmailId("lohic@gmail.com");
		stdent3.setFatherEmailId("reddylohi@gmail.com");
		stdent3.setFatherMobileNo("987654321");
		stdent3.setProfilePic("1mb");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long a = studentdao.add(stdent3);
		long num = stdent3.getId();
		studentdao.commitTransaction();
		@SuppressWarnings("unused")
		StudentEntity student = studentdao.findByPk(num);
		assertEquals(stdent3.getCourseId(),5);
		
	}
	@Test
	public void testSearchByStudentEntityGender() throws RecordNotFoundException {
		StudentEntity stdent4=new StudentEntity();
		java.util.Date date = new java.util.Date();
		stdent4.setRollNo(1436);
		stdent4.setFirstName("sunny");
		stdent4.setLastName("boya");
		stdent4.setDob(date);
		stdent4.setGender("Male");
		stdent4.setMobileNo("9876564521");
		stdent4.setCourseId(5);
		stdent4.setCourseName("eee");
		stdent4.setSubjectId(4);
		stdent4.setSubjectName("dbms");
		stdent4.setEmailId("sunnyboyya@gmail.com");
		stdent4.setFatherEmailId("giris@gmail.com");
		stdent4.setFatherMobileNo("912345678");
		stdent4.setProfilePic("1mb");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long a = studentdao.add(stdent4);
		studentdao.commitTransaction();
		List<StudentEntity> student = studentdao.searchByStudentEntityGender("Male");
		assertEquals(student.get(0).getSubjectId(),4);
		
	}
	@Test
	public void testSearchByStudentEntityRollno() throws RecordNotFoundException {
		StudentEntity stdent5=new StudentEntity();
		java.util.Date date = new java.util.Date();
		stdent5.setRollNo(1437);
		stdent5.setFirstName("abhi");
		stdent5.setLastName("boya");
		stdent5.setDob(date);
		stdent5.setGender("Male");
		stdent5.setMobileNo("7702844816");
		stdent5.setCourseId(5);
		stdent5.setCourseName("mech");
		stdent5.setSubjectId(4);
		stdent5.setSubjectName("dotnet");
		stdent5.setEmailId("abhiboyya@gmail.com");
		stdent5.setFatherEmailId("rathnas@gmail.com");
		stdent5.setFatherMobileNo("987654321");
		stdent5.setProfilePic("1mb");
		studentdao.beginTransaction();
		@SuppressWarnings("unused")
		long a = studentdao.add(stdent5);
		studentdao.commitTransaction();
		List<StudentEntity> student = studentdao.searchByStudentEntityRollno(1437);
		assertEquals(student.get(0).getSubjectId(),4);
		
	}

	

}
