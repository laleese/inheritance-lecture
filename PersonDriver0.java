public class PersonDriver0
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the PersonDriver class.\n");
		Person p1 = new Person("Lisa", "Leese");
		p1.setBirthday(1978, 10, 20);

		System.out.println(p1);
		p1.greeting();
	}
}
