package com.cg.ams.service;

import java.util.List;

import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
import com.cg.ams.repository.StudentDAO;
import com.cg.ams.repository.StudentDAOImpl;

public class StudentServiceImpl implements StudentService {
	StudentDAO dao=new StudentDAOImpl();
	/*
	 * This method adds student entity to student3 table
	 */
	@Override
	public long add(StudentEntity entity) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		long id=dao.add(entity);
		dao.commitTransaction();
		return id;
	}
	/*
	 * This method update student entity to student3 table
	 */
	@Override
	public void update(StudentEntity entity) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.update(entity);
		dao.commitTransaction();
		
		/*
		 * This method delete student entity to student3 table
		 */
	}
	@Override
	public void delete(StudentEntity entity) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.delete(entity);
		dao.commitTransaction();
		
	}
	/*
	    * this method  filters and finds using name in student3 table
	    */
	@Override
	public StudentEntity findByName(String firstName) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		StudentEntity entity=dao.findByName(firstName);
		return entity;
	}
	/*
	    * this method  filters and finds using primary key as id student3 table
	    */
	@Override
	public StudentEntity findByPk(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
	StudentEntity entity=dao.findByPk(id);
		return entity;
	}
	/* 
     * This method list out all the details of students by searching the student rollno
     */
	@Override
	public List<StudentEntity> searchByStudentEntityRollNo(long rollNo)throws RecordNotFoundException {
		
		return dao.searchByStudentEntityRollno(rollNo);
	}
	/* 
     * This method list out all the details of students by searching the student gender
     */
	@Override
	public List<StudentEntity> searchByStudentEntityGender(String Gender)  throws RecordNotFoundException {
		
		return dao.searchByStudentEntityGender(Gender);
	}
	

}
