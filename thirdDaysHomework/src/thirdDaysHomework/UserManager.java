package thirdDaysHomework;


public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getid() + " " +  user.getemail() + " " + user.getsifre() + " " + user.getkullan�c�ad�() + " : " + "Kullan�c� Ba�ar�yla Eklendi.");
		
	}
	
	
	public void delete(User user) {
		
		System.out.println(user.getid() + " " + user.getemail() + " " + user.getsifre() + " " + user.getkullan�c�ad�() + " : " + "Kullan�c� Ba�ar�yla Silindi.");
	}
	

}
