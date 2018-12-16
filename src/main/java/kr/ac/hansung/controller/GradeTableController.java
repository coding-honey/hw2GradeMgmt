package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.GradeTable;
import kr.ac.hansung.model.PreGrade;
import kr.ac.hansung.service.GradeTableService;

@Controller
public class GradeTableController {
	
	@Autowired
	private GradeTableService gradetableService;
	
	@RequestMapping("/gradetables")
	public String showGradeTables(Model model) {
		
		//List<GradeTable> gradetables = gradetableService.getGradeTables();
		int grade2014_1 = gradetableService.getYearGrades(2014, 1);
		int grade2014_2 = gradetableService.getYearGrades(2014, 2);
		int grade2015_1 = gradetableService.getYearGrades(2015, 1);
		int grade2017_2 = gradetableService.getYearGrades(2017, 2);
		int grade2018_1 = gradetableService.getYearGrades(2018, 1);
		int grade2018_2 = gradetableService.getYearGrades(2018, 2);
		model.addAttribute("grade2014_1", grade2014_1);
		model.addAttribute("grade2014_2", grade2014_2);
		model.addAttribute("grade2015_1", grade2015_1);
		model.addAttribute("grade2017_2", grade2017_2);
		model.addAttribute("grade2018_1", grade2018_1);
		model.addAttribute("grade2018_2", grade2018_2);
		
		return "gradetables";
	}
	
	@RequestMapping("/gradeforyear")
	public String showGradeForYear(@RequestParam String year,
								@RequestParam String semester, Model model) {
		
		if( (year != null) && (semester != null) ) {
			System.out.println("years : " + year + "/ semesters : " + semester);
				int years = Integer.parseInt(year);
				int semesters = Integer.parseInt(semester);
				
				List<GradeTable> gradetables = gradetableService.getGradeTables(years,semesters);
				
				model.addAttribute("gradetables", gradetables);
		} else {
			System.out.println("years랑 semester 안넘어옴");
		}
		
		return "gradeforyear";
		
	}
	
	@RequestMapping("/pregrades")
	public String showPreGrades(Model model) {
		List<PreGrade> pregrades = gradetableService.getPreGrades();
		model.addAttribute("pregrades", pregrades);
		
		return "pregrades";
	}
	
	@RequestMapping("/createpregrade")
	public String createOffer(Model model) {
		
		model.addAttribute("pregrade", new PreGrade());
		
		return "createpregrade";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, PreGrade pregrade) {
		
		gradetableService.insert(pregrade);
		
		model.addAttribute("pregrade", pregrade);
		
		return "pregradecreated";
	}
}
