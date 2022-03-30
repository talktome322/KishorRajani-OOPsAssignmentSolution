package com.greatlearning.Driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;

public class Driver {
	public static void main(String[] args) {
		
		AdminDepartment admindept=new AdminDepartment();
		HrDepartment hrdept=new HrDepartment();
		TechDepartment techdept=new TechDepartment();
		
		System.out.println(admindept.getDepartmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getworkDeadline());
		System.out.println(admindept.isIsTodayAHoliday());
		
		System.out.println("===============================");
		
		System.out.println(hrdept.getDepartmentName());
		System.out.println(hrdept.getdoActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getworkDeadline());
		System.out.println(hrdept.isIsTodayAHoliday());
		
		System.out.println("===============================");
		
		System.out.println(techdept.getDepartmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getworkDeadline());
		System.out.println(techdept.isIsTodayAHoliday());
		
	}

}
