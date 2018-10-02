package lec11.ex01;

public class Professor {

	private String first;
	private String last;
	
	public Professor(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFullName() {
		return first + " " + last;
	}
}
