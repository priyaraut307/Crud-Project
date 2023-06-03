package com.priya.pcrudproj.extracter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.priya.pcrudproj.model.StudentForm;

@Component
public class StudentSetExtarcter implements ResultSetExtractor<List<StudentForm>> {
	List<StudentForm> studList = new ArrayList<>();
	StudentForm sf = null;

	@Override
	public List<StudentForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		while (rs.next()) {
			sf = new StudentForm();
			sf.setSno(rs.getInt("sno"));
			sf.setSname(rs.getString("sname"));
			sf.setSage(rs.getInt("sage"));
			studList.add(sf);
		}
		return studList;
	}

}
