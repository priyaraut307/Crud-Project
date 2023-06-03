package com.priya.pcrudproj.dao;

import java.util.List;

import com.priya.pcrudproj.model.StudentForm;

public interface StudentDao {
	List<StudentForm> getStudListDao();

	List<StudentForm> getListBySnoDao(int sno);

	void insertListDao(StudentForm studentForm);

	void delete(int sno);

}
