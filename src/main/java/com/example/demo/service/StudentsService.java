package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.models.StudentsModel;

public interface StudentsService {

	public List<Map<String,Object>> getAllStudents();
	
	public void bulkInsertStudent(List<StudentsModel> request);

	public void singleInsertStudent(StudentsModel request);

}
