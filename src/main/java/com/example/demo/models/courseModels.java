package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class courseModels {
	
	private String courseName;
	private String courseDescription;
	private int creditHours;
	private int instructorID;

}
