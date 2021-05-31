package thirdDaysHomework;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.getkayıtlıkurs() + " : " +  "eklendi");
	}
	
	
	public void delete(Student student) {
		System.out.println(student.getkayıtlıkurs() + " : " +  "silindi");
	}
	

}
