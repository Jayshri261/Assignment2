package com.zensar.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entity.Student;

public interface StudentService {
	public Student getStudent(int StudId);

	public List<Student> getAllStudent();

	public void insertStudent(Student student);

	public void updateStudent(int studentId, Student student);

	public void deleteStudent(int studentId);
}
