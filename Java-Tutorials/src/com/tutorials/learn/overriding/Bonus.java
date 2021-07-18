package com.tutorials.learn.overriding;

public class Bonus {
	
	public static double getEmployeeBonus(Employee e) {
		if(e instanceof Manager) {
			return 2000.98;
		}else if(e instanceof Administrator) {
			return 1959.98;
		}else {
			return 2156.98;
		}
	}
	
	public static double getTeacherBonus(Teacher t1) {
		if(t1 instanceof Principal) {
			return 2678.99;
		}else if(t1 instanceof ScienceTeacher) {
			return 8976.99;
		}else {
			return 7896.99;
		}
	}

}
