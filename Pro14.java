import java.util.Scanner;

class Student{
	int rollNo;
	float academicScore;
	void setStudent(int r,float a){
		rollNo = r;
		academicScore = a;
	}
	void displayStudent(){
		System.out.println("Rol number:"+rollNo);
		System.out.println("Academic Score:"+academicScore);
	}
}
interface Sports{
	float sportsscore=0;
	void setSports(float s);
	void displaySports();
}
class Result extends Student implements Sports{
	float sportsScore;
	public void setSports(float s){
		sportsScore = s;
	}
	public void displaySports(){
		System.out.println("Sports Score:"+sportsScore);
	}
	void displayResult(){
		displayStudent();
		displaySports();
		System.out.println("Total Score:"+(academicScore+sportsScore));
	}
}
public class Pro14{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		Result r = new Result();
		System.out.println("Enter roll Number");
		int roll=sc.nextInt();
		System.out.println("Enter Academic Score");
		float acad=sc.nextFloat();
		System.out.println("Enter SportsScore");
		float sports=sc.nextFloat();
		r.setStudent(roll,acad);
		r.setSports(sports);
		System.out.println("Student Result:");
		r.displayResult();
	}
}

