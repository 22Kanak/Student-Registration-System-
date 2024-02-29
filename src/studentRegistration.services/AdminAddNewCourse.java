package studentRegistration.Services;

import studentRegistration.Dao.dao;
import studentRegistration.Dao.daoImpl;

public class AdminAddNewCourse {

	public AdminAddNewCourse() {
		dao daoObj = new daoImpl();
		daoObj.adminAddNewCourse();
	}
}
