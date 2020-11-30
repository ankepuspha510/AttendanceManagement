package com.cg.ams.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.ams.entity.StudentEntity;
import com.cg.ams.exception.RecordNotFoundException;
/*
 * @author: Puspha
 */

public class StudentDAOImpl implements StudentDAO {
	//creating entityManger Instance
	private EntityManager em;
	public StudentDAOImpl() {
		 em = JPAUtil.getEntityManager();
	}
	/*
	 * This method adds student entity to student3 table
	 */
	@Override
	public long add(StudentEntity entity) {
		em.persist(entity);
		return entity.getId();
	}
	/*
	 * This method update student entity to student3 table
	 */
    @Override
	public void update(StudentEntity entity) {
		em.merge(entity);
		
	}
    /*
	 * This method delete student entity to student3 table
	 */
    @Override
	public void delete(StudentEntity entity)  {
		em.remove(entity);
    }
    /*
    * this method  filters and finds using name in student3 table
    */
    @Override
    public StudentEntity findByName(String firstName) throws RecordNotFoundException{
		String jpql = "SELECT student FROM StudentEntity student where student.firstName=:FirstName";
		TypedQuery<StudentEntity> query=em.createQuery(jpql,StudentEntity.class);
		query.setParameter("FirstName", firstName);
		query.setMaxResults(1);
		StudentEntity student=query.getSingleResult();
		if(student==null) {
			throw new RecordNotFoundException("student not found");
		}
		return student;
	}
    /*
     * this method filters and finds using primary key as id student3 table
     */
    @Override
	public StudentEntity findByPk(long id) throws RecordNotFoundException{
		StudentEntity student=em.find(StudentEntity.class,id);
		if(student==null) {
			throw new RecordNotFoundException("The student with id" +id+ "not found");
		}
		return student;
	}
    
    /* 
     * This method list out all the details of students by searching the student gender
     */
    @Override

	public List<StudentEntity> searchByStudentEntityGender(String gender)throws RecordNotFoundException {
		String jpql = "SELECT student FROM StudentEntity student where student.gender=:Gender";
		TypedQuery<StudentEntity> query =em.createQuery(jpql,StudentEntity.class);
		query.setParameter("Gender", gender);
		query.setMaxResults(1);
		List<StudentEntity> std= query.getResultList();
		if(std==null)
		{
			throw new RecordNotFoundException("student not found");
		}
		return std;
		
	}
    @Override
	/*
	 * This method list out all the details of student by searching the student rollno
	 */

	public List<StudentEntity> searchByStudentEntityRollno(long rollNo)throws RecordNotFoundException {
    	String jpql = "SELECT student FROM StudentEntity student where student.rollNo=:RollNo";
		TypedQuery<StudentEntity> query =em.createQuery(jpql,StudentEntity.class);
		query.setParameter("RollNo", rollNo);
		List<StudentEntity> std=query.getResultList();
		if(std==null)
		{
			throw new RecordNotFoundException("student not found");
		}
		return std;
    	
    }
    /*
	 * open transaction
	 */
    @Override
	public void beginTransaction() {
    	em.getTransaction().begin();
    	
		
	}
    /*
	 * close transaction
	 */
    @Override
	public void commitTransaction() {
    	em.getTransaction().commit();
		
	}

	
		

	

	
	
	
	

}
