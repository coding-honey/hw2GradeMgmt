package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.ac.hansung.model.GradeTable;
import kr.ac.hansung.model.PreGrade;

@Component("id_gradetableDAO")
public class GradeTableDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getGradetableCount() {
		String sqlStatement = "select count(*) from gradetables";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	public int getPreGradeCount() {
		String sqlStatement = "select count(*) from pregrades";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	// query and return multiple Objects
	public List<GradeTable> getGradeTables(int year, int semester) {

		String sqlStatement = "select * from gradetables where yearofstudy=? AND semester=?;";

		return jdbcTemplate.query(sqlStatement, new Object[]{year, semester}, new RowMapper<GradeTable>() {
			@Override
			public GradeTable mapRow(ResultSet rs, int rowNum) throws SQLException {

				GradeTable gradetable = new GradeTable();

				gradetable.setId(rs.getInt("id"));
				gradetable.setYearofstudy(rs.getInt("yearofstudy"));
				gradetable.setSemester(rs.getInt("semester"));
				gradetable.setCode(rs.getString("code"));
				gradetable.setClassname(rs.getString("classname"));
				gradetable.setDivision(rs.getString("division"));
				gradetable.setGrades(rs.getInt("grades"));

				return gradetable;
			}

		});
	}
	
	// query and return multiple Objects
		public List<PreGrade> getPreGrades() {

			String sqlStatement = "select * from pregrades";

			return jdbcTemplate.query(sqlStatement, new RowMapper<PreGrade>() {
				@Override
				public PreGrade mapRow(ResultSet rs, int rowNum) throws SQLException {

					PreGrade pregrade = new PreGrade();

					pregrade.setId(rs.getInt("id"));
					pregrade.setYearofstudy(rs.getInt("yearofstudy"));
					pregrade.setSemester(rs.getInt("semester"));
					pregrade.setCode(rs.getString("code"));
					pregrade.setClassname(rs.getString("classname"));
					pregrade.setDivision(rs.getString("division"));
					pregrade.setGrades(rs.getInt("grades"));

					return pregrade;
				}

			});
		}

	public boolean insertpre(PreGrade pregrade) {

		int yearofstudy = 2019;
		int semester = 1;
		String code = pregrade.getCode();
		String classname = pregrade.getClassname();
		String division = pregrade.getDivision();
		int grades = pregrade.getGrades();

		String sqlStatement = "insert into pregrades (yearofstudy, semester, code, classname, division, grades) values (?, ?, ?, ?, ?, ?)";

		return jdbcTemplate.update(sqlStatement, new Object[] { yearofstudy, semester, code, classname, division, grades }) == 1;
	}

	/*public boolean delete(int id) {
		String sqlStatement = "delete from offers where id=?";

		return jdbcTemplate.update(sqlStatement, new Object[] { id }) == 1;
	}*/

}
