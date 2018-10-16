public class PersonDriver
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the PersonDriver class.\n");
		Person p1 = new Person("Lisa", "Leese");
		p1.setBirthday(1978, 10, 20);

		System.out.println(p1);
		p1.greeting();

		//Student s = new Student("Terrance", "Warner", "USF", 123, Student.COLLEGE);
		//s.setBirthday(2010, 4, 6);
		//System.out.println(s);
		//s.greeting();

		//Teacher t = new Teacher("Peter", "Pacheco", "PhD in Mathematics");
		//t.greeting();
	}
}
