public class TeacherDriver{
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Teacher Driver program.\n");
		Teacher t = new Teacher("Peter", "Pacheco", "PhD in Mathematics");
		t.setBirthday(1950, 11, 6);

		System.out.println(t);
		t.greeting();
	}
}
