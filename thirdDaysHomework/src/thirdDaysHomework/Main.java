package thirdDaysHomework;

public class Main {

	public static void main(String[] args) {
		
		
		Insructor ınsructor1 = new Insructor();
		ınsructor1.setid(1);
		ınsructor1.setemail("nhg@gmail.com");
		ınsructor1.setsifre("2154698");
		ınsructor1.setkullanıcıadı("engin");
		ınsructor1.setsertifika("MCT PMP ve ITIL" );
		
		
		Student student1 = new Student();
		student1.setid(1);
		student1.setemail("sde@gmail.com");
		student1.setsifre("489657");
		student1.setkullanıcıadı("rabia");
		student1.setkayıtlıkurs("java+reach");
		
		
		InsructorManager ınsructormanager = new InsructorManager();
		ınsructormanager.add(ınsructor1);
		ınsructormanager.delete(ınsructor1);
		
		System.out.println("...........................");
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add(student1);
		studentmanager.delete(student1);
		
		System.out.println("...........................");
		
		UserManager usermanager = new UserManager();
		usermanager.add(student1);
		usermanager.delete(student1);
		
		System.out.println("...........................");
		
		usermanager.add(ınsructor1);
		usermanager.delete(ınsructor1);
		

	}

	

}
