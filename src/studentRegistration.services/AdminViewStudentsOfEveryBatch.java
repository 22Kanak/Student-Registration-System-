package studentRegistration.Services;
import studentRegistration.Dao.*;

public class AdminViewStudentsOfEveryBatch {
	public AdminViewStudentsOfEveryBatch() {
		dao daoObj = new daoImpl();
		daoObj.adminViewStudentsOfEveryBatch();

	}
}
