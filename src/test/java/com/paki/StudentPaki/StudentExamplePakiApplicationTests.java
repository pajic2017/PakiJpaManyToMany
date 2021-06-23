package com.paki.StudentPaki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.paki.StudentPaki.entities.Student;
import com.paki.StudentPaki.repository.StudentPakiRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentExamplePakiApplicationTests {

	//save
	//read
	//update
	//delete
	
	@Autowired
	StudentPakiRepository studentRepository;
	
	@Test
	public void testSave(){
		Student student=new Student();
		student.setName("Marko");
		student.setCourse("Markovic");
		student.setFee(88d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testReadById(){
		Student student=studentRepository.findById(5l).get();
		System.out.println(student);
		
	}
	
	@Test
	public void updateTestStudent(){
		Student student=studentRepository.findById(6l).get();
		student.setFee(41d);
		
		studentRepository.save(student);
	}
	
	
	@Test
	public void deleteTestStudent(){
		Student student=new Student();
		student.setId(8l);
		
		studentRepository.delete(student);
		
	}
	
	
	

}
