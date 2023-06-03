package com.priya.pcrudproj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priya.pcrudproj.model.StudentForm;
import com.priya.pcrudproj.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "Student7")
public class StudentController {

	private StudentService studentService;

	@GetMapping
	public List<StudentForm> getStudListCltrl() {
		List<StudentForm> studList = studentService.getStudListService();
		return studList;
	}

	@GetMapping("/{num}")
	public List<StudentForm> getStudListSnoCltrl(@PathVariable(value = "num") int sno) {
		List<StudentForm> studList = studentService.getStudListBySnoService(sno);
		return studList;
	}

	@PostMapping
	public void insertStudCltrl(@RequestBody StudentForm studentForm) {
		studentService.insertStudService(studentForm);
	}

	@DeleteMapping("/{num}")
	public void deleteCltrl(@PathVariable(value = "num") int sno) {
		studentService.deleteService(sno);
	}

}
