package com.zensar.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.Repository.StudentRepository;
import com.zensar.dto.StudentDto;
import com.zensar.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;
	@Override
	public StudentDto getStudent(int StudentId) {
		Student getstudent=studentRepository.findById(StudentId).get();
		
		return modelMapper.map(getstudent,StudentDto.class);
	}

	@Override
	public List<StudentDto> getAllStudent() {
		List<Student>listOfStudents=studentRepository.findAll();
		List<StudentDto>listOfStudentDto = new ArrayList<StudentDto>();

		for(Student student:listOfStudents) {
		//listOfStudentDto.add(mapToDto(student));
		listOfStudentDto.add(modelMapper.map(student,StudentDto.class));
		}
		return listOfStudentDto;

		}
	

	@Override
	public StudentDto insertStudent(StudentDto studentDto) {

		//Student student = mapToEntity(studentDto);
		Student student = modelMapper.map(studentDto, Student.class);
		Student insertedStudent=studentRepository.save(student);
		//StudentDto dto = new StudentDto();
		return modelMapper.map(insertedStudent,StudentDto.class);

		//return maptoDto;
	}

	@Override
	public void updateStudent(int studentId, StudentDto studentDto) {
		//Student student=mapToEntity(studentDto);
		Student student = modelMapper.map(studentDto, Student.class);
		Student updatedStudent=studentRepository.save(student);





	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);

	}
	/*public StudentDto mapToDto(Student student) {
	StudentDto dto=new StudentDto();
	dto.setStudentAge(student.getStudentAge());
	dto.setStudentId(dto.getStudentId());
	dto.setStudentName(dto.getStudentName());
	return dto;

	}



	public Student mapToEntity(StudentDto studentDto) {
	Student student=new Student();
	student.setStudentId(studentDto.getStudentId());
	student.setStudentName(studentDto.getStudentName());
	student.setStudentAge(studentDto.getStudentAge());
	return student;
	}*/



	}


