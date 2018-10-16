public class CombinationDriver{
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Combination Driver program.\n");
		Teacher t = new Teacher("Peter", "Pacheco", "PhD in Mathematics");
		t.setBirthday(1950, 11, 6);

		Student s = new Student("Zoe", "Hallmen", "USF", 345, 3);
		Person p = new Person();

		System.out.println(">>> GREETINGS:");
		t.greeting();
		s.greeting();
		p.greeting();

		System.out.println(">>> OBJECT toString OUTPUT");
		System.out.println(p);
		p = s;
		System.out.println(p);
		p = t; 
		System.out.println(p);
	}
}
