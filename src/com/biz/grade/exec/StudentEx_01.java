package com.biz.grade.exec;

import java.util.Scanner;

import com.biz.grade.config.DBContract.MENU;
import com.biz.grade.config.Lines;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImplV1;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentserviceImplV1;

public class StudentEx_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StudentService studentService = new StudentserviceImplV1();		
		// ScoreService scoreService = new ScoreServiceImplV1();
		
		while(true)
		{
			studentService.inputStudent();
		}
/*
		while(true)
		{
			System.out.println(Lines.dLine);
			System.out.print("1. 학생 성적 입력\n"    + 
							 "2. 학생 성적 목록 출력\n" + 
							 "3. 학생 성적 등록\n"    + 
							 "4. 학생 성적 출력\n" 	  + 
							 "end 입력시 종료\n");
			
			System.out.println(Lines.dLine);
			System.out.print("메뉴 선택 : ");
			
			String stMenu = sc.nextLine();
			
			if(stMenu.equalsIgnoreCase("end"))
				break;
			
			int menu = 0;
			try { menu = Integer.valueOf(stMenu);}
			catch(Exception e) { System.out.println("메뉴는 숫자로만 입력 가능"); }
			
			if(menu == MENU.학생정보등록)
				while(!studentService.inputStudent());
			
			else if(menu == MENU.학생정보출력)
				studentService.listStudent();
			
			else if(menu == MENU.학생성적등록)
				while(!scoreService.inputScore());
			
			else if(menu == MENU.학생성적출력)
				scoreService.inputScore();
		}
	*/	
	}

}
