package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secGrade;
	public double thirdGrade;
	
	public double finalGrade() {
		return (this.firstGrade + this.secGrade + this.thirdGrade);
	}
}
