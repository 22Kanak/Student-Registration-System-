package studentRegistration.Dao;

import java.sql.SQLException;
import java.util.List;

import Exception.CourseException;
import Exception.StudentException;
import studentRegistration.Model.BatchRecord;
import studentRegistration.Model.BatchSeat;
import studentRegistration.Model.Course;
import studentRegistration.Model.Student;



public class daoImpl implements dao {
	@Override
	public String registerStudent(Student student) throws StudentException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerBatch(int cId, String cName, String sEmail) throws SQLException, CourseException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkForStudent(String sEmail, String Password) throws StudentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> getListOfCourses() throws SQLException, CourseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkForCourse(String cName) throws SQLException, CourseException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCourseId(String cName) throws SQLException, CourseException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean studentDetailEdit(String sEmail, String sPassword, String sNewPassword, String sNewName,
			String sNewCourse) throws SQLException, CourseException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BatchRecord getBatchRecordForStudent(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editStudentProfile(String sEmail, String nSPassword, String nSName) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BatchSeat> getBatchSeatdetails() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCourseName(int cId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayCourseAvailableWithOrWithoutSeats(String option) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkForAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayHomePageOptionToUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayOptionsForAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminAddNewCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminUpdateFeesOfCourse(String cName, int fees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminDeleteCourse(String cName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminDisplayCourseInfo(String cName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminCreatBatchunderaCourse(String cName, int bId, int totalSeats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminAllocateStudentsInaBatchUnderaCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getListOfStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStudentPassword(String sEmail) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adminUpdateTotalSeatsOfaBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adminViewStudentsOfEveryBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getSEmailListFromBatchWhoIsIntoACourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSNameFromEmail(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

