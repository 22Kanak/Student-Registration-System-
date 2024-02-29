package studentRegistration.Services;

import java.util.Scanner;
import studentRegistration.Dao.*;
public class AdminUpdateFeesOfCourse {

	public AdminUpdateFeesOfCourse() {
		Scanner sc = new Scanner(System.in);
		dao daoObj = new daoImpl();
		System.out.println("Enter Course name: ");
		String cName = sc.next();
		System.out.println("Enter fees to update:");
		int fees = sc.nextInt();
		daoObj.adminUpdateFeesOfCourse(cName, fees);
	}
}

