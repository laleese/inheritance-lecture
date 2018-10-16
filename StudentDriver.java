public class StudentDriver{
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Student Driver program.\n");
		Student s = new Student("Ian", "Murphy", "USF", 123, Student.COLLEGE);
		s.setBirthday(2010, 4, 6);

		System.out.println(s);
		s.greeting();
	}
}
