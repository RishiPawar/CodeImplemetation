package com.demo.controller;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerExportCSV {


	@GetMapping(value="/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getData()
	{
		List<Employee> list = Arrays.asList(new Employee("abc", "abc", new Date("01/01/1991"), "m","pune"),
				new Employee("cde", "cde", new Date("01/01/1991"), "m","pune"),
				new Employee("efg", "efg", new Date("01/01/1991"), "m","pune"),
				new Employee("xyz", "xyz", new Date("01/01/1991"), "m","pune"));
		
		return list;
	}
}
