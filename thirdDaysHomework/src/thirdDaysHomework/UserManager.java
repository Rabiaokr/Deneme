package thirdDaysHomework;


public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getid() + " " +  user.getemail() + " " + user.getsifre() + " " + user.getkullanıcıadı() + " : " + "Kullanıcı Başarıyla Eklendi.");
		
	}
	
	
	public void delete(User user) {
		
		System.out.println(user.getid() + " " + user.getemail() + " " + user.getsifre() + " " + user.getkullanıcıadı() + " : " + "Kullanıcı Başarıyla Silindi.");
	}
	

}
