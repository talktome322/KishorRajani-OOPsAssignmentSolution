package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		super();
	}

	public String getDepartmentName() {
		return "Welcome To HR Depatrtment";
	}

	public String getTodaysWork() {
		return "Today's Work => Fill Today's Time Sheet and Mark your Attendance";
	}

	public String getworkDeadline() {
		return "Deadline => Complete By EOD";
	}

	public String getdoActivity() {
		return "To Do Activity => Team Lunch";
	}

}