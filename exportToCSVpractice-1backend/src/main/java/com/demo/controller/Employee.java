package com.demo.controller;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthdate;
	private String gender;
	private String address;

}
