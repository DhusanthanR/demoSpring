package com.example.demo.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsModel {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String email;
	private String phoneNumber;
}
