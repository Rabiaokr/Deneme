package thirdDaysHomework;

public class Main {

	public static void main(String[] args) {
		
		
		Insructor �nsructor1 = new Insructor();
		�nsructor1.setid(1);
		�nsructor1.setemail("nhg@gmail.com");
		�nsructor1.setsifre("2154698");
		�nsructor1.setkullan�c�ad�("engin");
		�nsructor1.setsertifika("MCT PMP ve ITIL" );
		
		
		Student student1 = new Student();
		student1.setid(1);
		student1.setemail("sde@gmail.com");
		student1.setsifre("489657");
		student1.setkullan�c�ad�("rabia");
		student1.setkay�tl�kurs("java+reach");
		
		
		InsructorManager �nsructormanager = new InsructorManager();
		�nsructormanager.add(�nsructor1);
		�nsructormanager.delete(�nsructor1);
		
		System.out.println("...........................");
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add(student1);
		studentmanager.delete(student1);
		
		System.out.println("...........................");
		
		UserManager usermanager = new UserManager();
		usermanager.add(student1);
		usermanager.delete(student1);
		
		System.out.println("...........................");
		
		usermanager.add(�nsructor1);
		usermanager.delete(�nsructor1);
		

	}

	

}
