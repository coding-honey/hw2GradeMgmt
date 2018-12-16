package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.GradeTableDAO;
import kr.ac.hansung.model.GradeTable;
import kr.ac.hansung.model.PreGrade;

@Service
public class GradeTableService {

	@Autowired
	private GradeTableDAO gradetabledao;
	
	public List<GradeTable> getGradeTables(int year, int semester) {
		List<GradeTable> gradetables = gradetabledao.getGradeTables(year, semester);
		
		return gradetables;
	}
	
	public int getYearGrades(int yearofstudy, int semester) {
		List<GradeTable> gradetables = gradetabledao.getGradeTables(yearofstudy, semester);
		int sum=0;
		for(GradeTable gradetable : gradetables)
			sum+=gradetable.getGrades();
		
		return sum;
	}
	
	public List<PreGrade> getPreGrades() {
		return gradetabledao.getPreGrades();
	}

	public void insert(PreGrade pregrade) {
		gradetabledao.insertpre(pregrade);
	}

}
