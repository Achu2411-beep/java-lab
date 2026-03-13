class Student{
	String name;
	int roll_no;
	int marks;
	void check(){
		if(marks>45){
			System.out.println("student is eligible");
		}else{
			System.out.println("Student is not eligible");
		}
	}
}




public class mark{
	public static void main(String args[]){
		Student s1=new Student();
		s1.name="Aswathi";
		s1.roll_no=20;
		s1.marks=92;
		s1.check();

		Student s2=new Student();
                s2.name="Athul";
                s2.roll_no=21;
                s2.marks=98;
		s2.check();

		Student s3=new Student();
                s3.name="Rishin";
                s3.roll_no=22;
                s3.marks=97;
		s3.check();
	}
}



