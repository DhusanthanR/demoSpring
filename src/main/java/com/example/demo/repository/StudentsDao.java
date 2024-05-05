package com.example.demo.repository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dataBaseEngine.service.DataBaseService;
import com.example.demo.models.StudentsModel;
import com.example.demo.models.courseModels;

@Repository
public class StudentsDao {

	@Autowired
	private DataBaseService databaseService;
	
	public List<Map<String,Object>> getAllStudents(){
		String query = "SELECT * FROM students";
		return databaseService.selectQueryForListOfMap(query);
	}
	
	public void singleInsertStudent(StudentsModel studentsData) {
		
		String query = "INSERT INTO students (firstName, lastName, birthDate, email, phoneNumber) VALUES (?, ?, ?, ?, ?)";
		
		databaseService.singleInsert(studentsData, query, (ps,student) ->{
			try {
				ps.setString(1, student.getFirstName());
				ps.setString(2, student.getLastName());
				ps.setDate(3, Date.valueOf(student.getBirthDate()));
				ps.setString(4, student.getEmail());
				ps.setString(5, student.getPhoneNumber());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}
	
	public void bulkInsertStudent(List<StudentsModel> studentsData) {
		
		String query = "INSERT INTO students (firstName, lastName, birthDate, email, phoneNumber) VALUES (?, ?, ?, ?, ?)";
		
		databaseService.bulkInsert(studentsData, query, (ps,student) ->{
			try {
				ps.setString(1, student.getFirstName());
				ps.setString(2, student.getLastName());
				ps.setDate(3, Date.valueOf(student.getBirthDate()));
				ps.setString(4, student.getEmail());
				ps.setString(5, student.getPhoneNumber());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}
	
	public void insertCourse(List<courseModels> courseData) {
		
		String query = "INSERT INTO courses (courseName, courseDescription, creditHours, instructorID) VALUES (?, ?, ?, ?)";
		
		databaseService.bulkInsert(courseData, query, (ps, course) ->{
			try {
				ps.setString(1, course.getCourseName());
				ps.setString(2, course.getCourseDescription());
				ps.setInt(3, course.getCreditHours());
				ps.setInt(4, course.getInstructorID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}

}
