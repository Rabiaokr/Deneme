package thirdDaysHomework;

public class InsructorManager extends UserManager{
	
	public void add(Insructor insructor) {
		System.out.println(insructor.getsertifika() + insructor + " : " + "eklendi");
	}
	
	public void delete(Insructor insructor) {
		System.out.println(insructor.getsertifika() + " : " + "silindi");
	}
	
}




