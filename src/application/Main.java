package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.println("Enter student's name: ");
		aluno.name=sc.nextLine();
		
		System.out.println("Enter three student's grades:");
		aluno.firstGrade=sc.nextDouble();
		aluno.secGrade=sc.nextDouble();
		aluno.thirdGrade=sc.nextDouble();
		
		System.out.println(aluno.name);
		System.out.println(aluno.firstGrade);
		System.out.println(aluno.secGrade);
		System.out.println(aluno.thirdGrade);
		
		System.out.println();
		System.out.println("FINAL GRADE = " + aluno.finalGrade());
		
		if (aluno.finalGrade() > 60)
			System.out.println("PASS");
		else {
			System.out.println("FAILED\nMISSING " + (60-aluno.finalGrade()) + " POINTS");
		}
	}

}
