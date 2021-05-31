package thirdDaysHomework;


public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getid() + " " +  user.getemail() + " " + user.getsifre() + " " + user.getkullanýcýadý() + " : " + "Kullanýcý Baþarýyla Eklendi.");
		
	}
	
	
	public void delete(User user) {
		
		System.out.println(user.getid() + " " + user.getemail() + " " + user.getsifre() + " " + user.getkullanýcýadý() + " : " + "Kullanýcý Baþarýyla Silindi.");
	}
	

}
