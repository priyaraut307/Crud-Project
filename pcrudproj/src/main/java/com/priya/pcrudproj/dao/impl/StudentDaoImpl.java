package com.priya.pcrudproj.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.priya.pcrudproj.dao.StudentDao;
import com.priya.pcrudproj.extracter.StudentSetExtarcter;
import com.priya.pcrudproj.model.StudentForm;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	private StudentSetExtarcter studentSetExtarcter;

	@Override
	public List<StudentForm> getStudListDao() {
		List<StudentForm> studList = jdbcTemplate.query("select * from Student7 order by sno",
				studentSetExtarcter::extractData);
		return studList;
	}

	@Override
	public List<StudentForm> getListBySnoDao(int sno) {
		List<StudentForm> studList = jdbcTemplate.query("select * from Student7 where sno=" + sno,
				studentSetExtarcter::extractData);
		return studList;
	}

	@Override
	public void insertListDao(StudentForm studentForm) {
		String query = "Insert into Student7 values(" + studentForm.getSno() + ",'" + studentForm.getSname() + "',"
				+ studentForm.getSage() + ")";
		jdbcTemplate.update(query);
	}

	@Override
	public void delete(int sno) {
		String query = "Delete from Student7 where sno=" + sno;
		jdbcTemplate.update(query);
	}

}
