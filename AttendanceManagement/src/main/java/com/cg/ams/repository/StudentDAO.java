package com.cg.ams.repository;
import java.util.List;

import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
public interface StudentDAO {
	public long add(StudentEntity entity);
	public void update(StudentEntity entity);
	public void delete(StudentEntity entity);
	public StudentEntity findByName(String FirstName) throws RecordNotFoundException;
	public StudentEntity findByPk(long id) throws RecordNotFoundException;
	public List<StudentEntity> searchByStudentEntityRollno( long rollNo) throws RecordNotFoundException;
	public List<StudentEntity> searchByStudentEntityGender(String Gender) throws RecordNotFoundException;
	public void beginTransaction();
	public void commitTransaction();
	
	

}
