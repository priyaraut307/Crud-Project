package com.priya.pcrudproj.service;

import java.util.List;

import com.priya.pcrudproj.model.StudentForm;

public interface StudentService {
	List<StudentForm> getStudListService();

	List<StudentForm> getStudListBySnoService(int sno);

	void insertStudService(StudentForm studentForm);

	void deleteService(int sno);

}
