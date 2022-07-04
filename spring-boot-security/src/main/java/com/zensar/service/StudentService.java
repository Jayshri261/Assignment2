package com.zensar.service;

import java.util.List;

import com.zensar.entity.Student;

public interface StudentService {

	public Student getStudent(int studentId);

	public List<Student> getStudents();

	public Student insertStudent(Student student);

	public void deleteStudent(int studentId);

	public Student updateStudent(int studentId, Student student);
}