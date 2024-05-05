package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.StudentsModel;
import com.example.demo.service.StudentsService;

@RestController
@RequestMapping("/student")
public class StudentsController {

	@Autowired
	private StudentsService studentService;
	
	@GetMapping("/getAllStudent")
	public List<Map<String,Object>> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/bulkInsertStudent")
	public void bulkinsertStudent(@RequestBody List<StudentsModel> request){
		studentService.bulkInsertStudent(request);
	}
	
	@PostMapping("/singleInsertStudent")
	public void singleInsertStudent(@RequestBody StudentsModel request){
		studentService.singleInsertStudent(request);
	}
}
