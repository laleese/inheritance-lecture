public class StudentDriver0{
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Student Driver program.\n");
		Student0 s = new Student0("Sandra", "Draper");
		s.setBirthday(2010, 4, 6);
		s.setSchool("USF");
		
		System.out.println(s);
		s.greeting();
	}
}
