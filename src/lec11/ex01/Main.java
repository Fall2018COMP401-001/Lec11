package lec11.ex01;

public class Main {

	public static void main(String[] args) {
		
		Professor kmp = new Professor("Ketan", "Mayer-Patel");
		Professor dewan = new Professor("Prasun", "Dewan");
		
		Room ham100 = new Room("Hamilton", 100);
		Room sn014 = new Room("Sitterson", 14);
		
		Student s1 = new Student("Alan", "Turing");
		Student s2 = new Student("Charles", "Babbage");
		Student s3 = new Student("Haskell", "Curry");
		Student s4 = new Student("Ada", "Lovelace");
		Student s5 = new Student("Jim", "Gray");
		
		Course c1 = new Course(University.Term.FALL, 2015,
				               University.Department.COMP, 401,
				               sn014, kmp);
		
		Course c2 = new Course(University.Term.FALL, 2015,
							   University.Department.COMP, 426,
							   ham100, kmp);
		
		Course c3 = new Course(University.Term.SPRING, 2016,
							   University.Department.COMP, 401,
							   ham100, kmp);
		
		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
		
		c1.printRoster();
		
	    c2.addStudent(s1);
	    c2.addStudent(s2);
	    
	    c2.printRoster();
	    
	    c3.addStudent(s1);
	    c3.addStudent(s2);
	    c3.addStudent(s3);
	    c3.addStudent(s4);
	    c3.addStudent(s5);
	    
	    c3.printRoster();
	    
	    c2.setProf(dewan);
	    
	    c2.printRoster();
	    
	    c3.setRoom(sn014);
	    
	    c3.printRoster();
	    
	}
}
