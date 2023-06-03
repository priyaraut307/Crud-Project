package com.priya.pcrudproj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priya.pcrudproj.dao.StudentDao;
import com.priya.pcrudproj.model.StudentForm;
import com.priya.pcrudproj.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	@Override
	public List<StudentForm> getStudListService() {
		List<StudentForm> studList = studentDao.getStudListDao();
		return studList;
	}

	@Override
	public List<StudentForm> getStudListBySnoService(int sno) {
		List<StudentForm> studList = studentDao.getListBySnoDao(sno);
		return studList;
	}

	@Override
	public void insertStudService(StudentForm studentForm) {
		studentDao.insertListDao(studentForm);

	}

	@Override
	public void deleteService(int sno) {
		studentDao.delete(sno);

	}

}
