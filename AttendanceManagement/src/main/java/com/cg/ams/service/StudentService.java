package com.cg.ams.service;
import java.util.List;

import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
public interface StudentService {
	public long add(StudentEntity entity);
	public void update(StudentEntity entity);
	public void delete(StudentEntity entity);
	public StudentEntity findByName(String firstName) throws RecordNotFoundException;
	public StudentEntity findByPk(long id) throws RecordNotFoundException;
	public List<StudentEntity> searchByStudentEntityRollNo(long rollNo) throws RecordNotFoundException;
	public List<StudentEntity> searchByStudentEntityGender(String gender)  throws RecordNotFoundException;
	

}
