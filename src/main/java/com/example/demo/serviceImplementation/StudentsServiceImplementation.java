package com.example.demo.serviceImplementation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.StudentsModel;
import com.example.demo.repository.StudentsDao;
import com.example.demo.service.StudentsService;

@Service
public class StudentsServiceImplementation implements StudentsService {

	@Autowired
	private StudentsDao studDao;
	
	@Override
	public List<Map<String,Object>> getAllStudents(){
		return studDao.getAllStudents();
	}
	
	@Override
	public void bulkInsertStudent(List<StudentsModel> request) {
		studDao.bulkInsertStudent(request);
	}
	
	@Override
	public void singleInsertStudent(StudentsModel request) {
		studDao.singleInsertStudent(request);
	}
}
